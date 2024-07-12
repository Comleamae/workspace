import { useState } from "react"
import { useNavigate } from "react-router-dom"

function Form({board_list, setBoard_List}) {
  const navigate = useNavigate()
  //입력한 모든 정보를 저장하는 state 변수
  const [board, setBoard] = useState({
    boardNum: 0,
    title: '',
    content: '',
    writer: '',
    createDate: ''
  })

  const changeBoard =(e)=>{
    setBoard({
      ...board,
      [e.target.id]:e.target.value
  })
  }

  return (
    <div>
      <table>
        <tr>
          <td>글번호</td>
          <td>
            <input type="text" id="boardNum" onChange={(e)=>{
              changeBoard(e)
            }}></input>
          </td>
        </tr>
        <tr>
          <td>제목</td>
          <td>
            <input type="text" id="title" onChange={(e)=>{
              changeBoard(e)
            }}></input>
          </td>
        </tr>
        <tr>
          <td>작성자</td>
          <td>
            <input type="text" id="writer" onChange={(e)=>{
              changeBoard(e)
            }}></input>
          </td>
        </tr>
        <tr>
          <td>작성일</td>
          <td>
            <input type="date" id="createDate" onChange={(e)=>{
              changeBoard(e)
            }}></input>
          </td>
        </tr>
        <tr>
          <td>내용</td>
          <td>
            <textarea id="content" onChange={(e)=>{
              changeBoard(e)
            }}></textarea>
          </td>
        </tr>
      </table>
  
      <button type="button" onClick={(e)=>{
        setBoard_List([...board_list, board])
        navigate('/')
      }}>글등록</button>
    </div>
  )
}

export default Form
