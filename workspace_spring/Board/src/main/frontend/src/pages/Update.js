import axios from 'axios'
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom'

const Update = ({onLogin}) => {
  const navigate = useNavigate()
  const {boardNum} = useParams()
  const [updateBoard, setUpdateBoard] = useState({
    title:''
    ,content:''
  })
  useEffect(()=>{
    axios
    .get(`/board/detail/${boardNum}`)
    .then((res)=>{
      setUpdateBoard(res.data)
    })
    .catch((error)=>{})
  }, [])
  function goUpdate(){
    if(onLogin.memId==''){
      alert('로그인 후에 시도해주세요')
      return
    }
    axios
    .put('/board/update', updateBoard)
    .then((res)=>{
      alert('성공')
      navigate(-1)
    })
    .catch((error)=>{
      alert('실패')
      console.log(error)
    })
  }
  function changeBoard(e){
    setUpdateBoard({
      ...updateBoard,
      [e.target.name]:e.target.value
    })
  }
  return (
    <div>
       <table>
        <thead>
          <tr>
            <td>작성일</td>
            <td>{updateBoard.createDate}</td>
            <td>작성자</td>
            <td>{updateBoard.memId}</td>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>제목</td>
            <td colSpan={3}>
              <input type='text' name='title' defaultValue={updateBoard.title} onChange={(e)=>{changeBoard(e)}}/>
            </td>
          </tr>
          <tr>
            <td>내용</td>
            <td colSpan={3}>
              <textarea name='content'defaultValue={updateBoard.content} onChange={(e)=>{changeBoard(e)}}></textarea>
            </td>
          </tr>
        </tbody>
      </table>
      <button type='button' onClick={(e)=>{navigate(-1)}}>뒤로가기</button>
      <button type='button' onClick={(e)=>{goUpdate()}}>수정</button>
    </div>
  )
}

export default Update
