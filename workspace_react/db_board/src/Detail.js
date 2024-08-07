import axios from "axios"
import { useEffect, useState } from "react"
import { useNavigate, useParams } from "react-router-dom"


const Detail = ()=>{
  //DB에서 상세 조회한 내용을 화면에 출력
  const[board, setBoard] = useState({})

  //route 의 url로 전달되는 데이터 받기
  const params = useParams() //{boardNum:'1'}

  const navigate = useNavigate()

  useEffect(()=>{
  axios
  .get(`/detail/${params.boardNum}`)
  .then((res)=>{
    setBoard(res.data)
  })
  .catch((error)=>{
    alert('정보 안가져오냐고')
    console.log(error)
  })}, [])

  function deleteOne(){
    
    if(window.confirm('삭제하시겠습니까?')){
      axios
      .delete(`/deleteBoard/${board.boardNum}`)
      .then((res)=>{
        console.log(res)
        alert('게시글 삭제완료')
        navigate('/')
      })
      .catch((error)=>{
        alert('삭제실패')
        console.log(error)
      })
    }
    
  }
  

  return(
    <>
      <h2>글 상세 조회 화면</h2>
      <table>
        <tr>
          <td>글번호</td>
          <td>{board.boardNum}</td>
          <td>작성자</td>
          <td>{board.boardWriter}</td>
          <td>작성일</td>
          <td>{board.createDate}</td>
        </tr>
        <tr>
          <td>제목</td>
          <td>{board.boardTitle}</td>
        </tr>
        <tr>
          <td>내용</td>
          <td>{board.boardContent}</td>
        </tr>
      </table>
        
      <button type="button" onClick={(e)=>{navigate(-1)}}>뒤로가기1 -1로 이동</button>
      <button type="button" onClick={(e)=>{navigate('/')}}>뒤로가기2 /로 이동</button>
      <button type="button" onClick={(e)=>{deleteOne()}}>삭제</button>
      <button type="button" onClick={(e)=>{navigate('/update')}}>수정</button>
    </>
  )
}
export default Detail