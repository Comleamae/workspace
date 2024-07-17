import axios from "axios"
import { useState } from "react"
import { useNavigate } from "react-router-dom"

const RegBoardForm = () => {
  const navigate = useNavigate()

  //입력한 내용을 저장하는 state변수
  const [board, setBoard] = useState({
    boardTitle : ''
    , boardContent : ''
    , boardWriter : ''
  })

  //글 등록 버튼 클릭 시 실행하는 함수
  function regOne(){
    //제목이 비었으면
    //1)java Ver(속성 선택자 활용)
    const title_input = document.querySelector('input[name="boardTitle"]')

    //2)react Ver

    //1)
    if(title_input.value == ''){
      alert('제목은 필수입력입니다')
      title_input.focus()
      return ; //함수 끝냄
    }

    // //2)
    // if(board.boardTitle == ''){
    //   alert('제목은 필수입력입니다')
    // }

    if(document.querySelector('input[name="boardWriter"]').value == ''){
      alert('작성자는 필수입력입니다')
      document.querySelector('input[name="boardWriter"]').focus()
      return ;
    }
    axios
    .post('/regBoard', board)
    .then((res)=>{
      alert('게시글이 등록됬습니다')
      navigate('/')
    })
    .catch((error)=>{
      alert('게시글 등록에 실패했습니다')
      console.log(error)
    })
    
  }
  
  //입력 값 세팅
  function changeBoard(e){
    setBoard({
      ...board,
      [e.target.name] : e.target.value
    })
  }
  
  return(
    <div>
      <table>
        <tr>
          <td>제목</td>
          <td>
            <input type="text" name="boardTitle" onChange={(e)=>{
              changeBoard(e)}}/>
          </td>
        </tr>
        <tr>
          <td>작성자</td>
          <td>
            <input type="text" name="boardWriter" onChange={(e)=>{
              changeBoard(e)}}/>
          </td>
        </tr>
        <tr>
          <td>내용</td>
          <td>
            <textarea name="boardContent" onChange={(e)=>{
              changeBoard(e)}}></textarea>
          </td>
        </tr>
      </table>
      <button type="button" onClick={(e)=>{
        regOne()
        
      }}>글 등록</button>
    </div>
  )
}
export default RegBoardForm