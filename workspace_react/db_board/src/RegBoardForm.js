import axios from "axios"
import { useEffect, useState } from "react"
import { useNavigate } from "react-router-dom"

const RegBoardForm = () => {
  const navigate = useNavigate()

  const[board, setBoard] = useState({
    boardTitle : ''
    , boardWriter : ''
    , boardContent : ''
  })

  const changeBoard = (e)=>{
    setBoard({
      ...board,
      [e.target.name]:e.target.value
    })
  }
  useEffect(()=>{
    axios
    .post('/regBoardForm', changeBoard())
    .then(()=>{
      setBoard
    })
    .catch(()=>{
      alert('값가져와')
    })
  }, [])
  
  return(
    <>
      <table>
        <tr>
          <td>제목</td>
          <td>
            <input type="text" name="boardTitle" onChange={(e)=>{
              changeBoard(e)
            }}/>
          </td>
        </tr>
        <tr>
          <td>작성자</td>
          <td>
            <input type="text" name="boardWriter" onChange={(e)=>{
              changeBoard(e)
            }}/>
          </td>
        </tr>
        <tr>
          <td>내용</td>
          <td>
            <textarea name="boardContent" onChange={(e)=>{
              changeBoard(e)
            }}/>
          </td>
        </tr>
      </table>
      <button type="button" onClick={()=>{
        console.log(board)
      }}>글 등록</button>
    </>
  )
}
export default RegBoardForm