import { useState } from "react"
import { useNavigate, useParams } from "react-router-dom"

const Update = () => {

  const navigate = useNavigate()

  const params = useParams()

  const[board, setBoard] = useState({})

  function updateOne(){
    if(window.confirm('수정하시겠습니까?')){

    }
  }

  return(
    <>
      <h2>글 수정 화면</h2>
      <table>
        <tr>
          <td>글번호</td>
          <td>
            {board.boardNum}
          </td>
          <td>작성자</td>
          <td>

          </td>
          <td>작성일</td>
          <td>

          </td>
        </tr>
        <tr>
          <td>제목</td>
          <td>

          </td>
        </tr>
        <tr>
          <td>내용</td>
          <td>

          </td>
        </tr>
      </table>

      <button type="button" onClick={()=>{
        updateOne()
      }}>수정 확정</button>
    </>

  )
}
export default Update