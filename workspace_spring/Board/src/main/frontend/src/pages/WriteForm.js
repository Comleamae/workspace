import axios from 'axios'
import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom'
import * as boardApi from '../apis/boardApi'

const WriteForm = ({onLogin}) => {
  const [newBoard, setNewBoard] = useState({
    title:''
    , content:''
    , memId : `${onLogin.memId}`
  })
  const navigate = useNavigate()

  function goReg(){
    if(newBoard.title==''){
      alert('제목을 입력해주세요')
      return
    }
    boardApi.postRegBoard(newBoard)
    .then((res)=>{
      alert('받앗음')
      navigate('/main')
    })
    .catch((error)=>{
      alert('못받앗슈')
      console.log(error)
    })
  }

  function changeBoard(e){
    setNewBoard({
      ...newBoard,
      [e.target.name]:e.target.value
    })
  }
  return (
    <div>
      <table>
        <tr>
          <td>제목</td>
          <td>
            <input type='text' name='title' onChange={(e)=>{changeBoard(e)}}/>
          </td>
        </tr>
        <tr>
          <td>내용</td>
          <td>
            <textarea name='content' onChange={(e)=>{changeBoard(e)}}></textarea>
          </td>
        </tr>
      </table>
      <button type='button' onClick={(e)=>{
        goReg()
      }}>글등록</button>
    </div>
  )
}

export default WriteForm
