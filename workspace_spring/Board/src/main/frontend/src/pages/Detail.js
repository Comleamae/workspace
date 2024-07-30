import axios from 'axios'
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom'
import * as boardApi from '../apis/boardApi'
import * as replyApi from '../apis/replyApi'
// 재랜더링: 스테이트 변수가 선언된 컴포넌트를 다시 해석 *새로고침과 다름
const Detail = ({onLogin}) => {
  console.log('Detail 컴포넌트 실행')
  
  const {boardNum} = useParams()
  //게시글 상세 정보
  const [detailBoard, setDetailBoard] = useState({})
  //댓글 목록
  const [replyOne, setReplyOne] = useState([])
  //새로운 댓글
  const [newReply, setNewReply] = useState({
    replyContent: ''
    , memId: onLogin.memId
    , boardNum: boardNum
  })
  const navigate = useNavigate()
  

  function deleteSelRe(){
    axios
    .delete(`/reply/deleteSel/${boardNum}`)
    .then((res)=>{})
    .catch((error)=>{},[])
  }
  function deleteRe(replyNum){
    axios
    .delete(`/reply/delete/${replyNum}`)
    .then((res)=>{
      alert('ㅌㅌ')
      setNewReply({
        ...newReply,
        replyContent:''
      })
    })
    .catch((error)=>{
      alert('삭제실패')
      console.log(error)
    }, [])
  }
  // 게시글을 삭제하기위해서는 외래키를 가진 댓글을 먼저 삭제해야함
  function goDelete(){
    deleteSelRe()
    axios
    .delete(`/board/delete/${boardNum}`)
    .then((res)=>{
      alert('성공')
      navigate('/main')
    })
    .catch((error)=>{
      alert('실패')
      console.log(error)
    }, [])
  }
  
  useEffect(()=>{
    boardApi.getBoardDetail(boardNum)
    .then((res)=>{
      setDetailBoard(res.data)
      alert('받아옴')
    })
    .catch((error)=>{
      alert('실패')
      console.log(error)
    })
  }, [])

  useEffect(()=>{
    replyApi.getReplyList(boardNum)
    .then((res)=>{
      setReplyOne(res.data)
    })
    .catch((error)=>{
      alert('error')
    })
  },[newReply])

  function regReply(){
    axios
    .put('/reply/regReply', newReply)
    .then((res)=>{
      alert('댓글 등록 성공')

      // document.querySelector('input[type="text"]').value = ''

      //추가된 댓글이 화면에 바로 보이게 하는 코드 작성
      setNewReply({
        ...newReply,
        replyContent:''
      })
      
    })
    .catch((error)=>{
      alert('실패')
    })
  }
  function changeReply(e){
    setNewReply({
      ...newReply,
      [e.target.name]:e.target.value
    })
  }
 
  return (
    <div>
      <table>
        <thead>
          <tr>
            <td>작성일</td>
            <td>{detailBoard.createDate}</td>
            <td>작성자</td>
            <td>{detailBoard.memId}</td>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>제목</td>
            <td colSpan={3}>
              {detailBoard.title}
            </td>
          </tr>
          <tr>
            <td>내용</td>
            <td colSpan={3}>
              {detailBoard.content}
            </td>
          </tr>
        </tbody>
      </table>
      <button type='button' onClick={(e)=>{navigate('/main')}}>목록가기</button>
      {
        onLogin.memId == detailBoard.memId || onLogin.memRole == 'ADMIN'
        ?
        <div>
          <button type='button' onClick={(e)=>{navigate(`/update/${boardNum}`)}}>수정</button>
          <button type='button' onClick={(e)=>{goDelete()}}>삭제</button>
        </div>
        :
        null
      }
        <div className='reply-div'>
        {
          replyOne.map((reply, i)=>{
            return(
              <div key={i}>
              <p>{reply.replyDate}</p>
              <p>{reply.memId}</p>
              <p>{reply.replyContent}</p>
              {
                onLogin.memId == reply.memId || onLogin.memRole == 'ADMIN'
                ?
                <button type='button' onClick={()=>{deleteRe(reply.replyNum)}}>삭제</button>
                :
                null
              }
              
            </div>
            )
          })
        }
     { 
      onLogin.memId != null
      ?
      <div>
        <input value={newReply.replyContent} type='text' name='replyContent' onChange={(e)=>{changeReply(e)}}></input>
        <button type='button' onClick={(e)=>{regReply()}}>댓글 등록</button>
      </div>
      :
      null
    }
      </div>

      
    </div>
  )
}

export default Detail
