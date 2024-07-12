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
    copyList.forEach((e, i)=>{
      if(boardNum==e.boardNum)
        copyList.splice(i, 1);
        setBoard_List(copyList)
    })
  }


  //const arr = [1,2,3];
  //const result =  arr.splice(0, 1);
  //splice 함수 자체를 리턴할 경우 배열에서 잘라낸 부분을 리턴한다
  //=>따로 잘라내고 남은 부분을 리턴해주어야 원하는 결과를 얻을 수 있다.


  //result = [1]
  //arr = [2,3]


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
        goDelete(e)
        navigate(`/`)
      }}>삭제</button>
    </div>
  )
}

export default Detail