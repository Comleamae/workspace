import {useNavigate, useParams } from "react-router-dom"

const Detail = ({board_list, setBoard_List})=>{
  const navigate = useNavigate()

  //url로 넘어온는 데이터 받기
  //const params = useParams()
  //const boardNum = params.boardNum
  const {boardNum} = useParams()

  let findBoard = null
  let copyList = [...board_list]

  board_list.forEach((e, i) => {
    if(e.boardNum == boardNum){
      findBoard = e
    }
  });

  const goDelete = () => {
    setBoard_List(copyList.splice(boardNum))
  }

  return(
    <div className="detail">
            <div>
              <h3>글 상제 조회 화면</h3>
              <table>
                <tr>
                  <td>글 번호</td>
                  <td>{findBoard.boardNum}</td>
                  <td>작성자</td>
                  <td>{findBoard.writer}</td>
                  <td>작성일</td>
                  <td>{findBoard.createDate}</td>
                </tr>
                <tr>
                  <td>제목</td>
                  <td>{findBoard.title}</td>
                </tr>
                <tr>
                  <td>내용</td>
                  <td>{findBoard.content}</td>
                </tr>
              </table>
            </div>
      <button type="button">뒤로가기</button>
      <button type="button" onClick={(e)=>{
        goDelete()
        navigate(`/`)
      }}>삭제</button>
    </div>
  )
}

export default Detail