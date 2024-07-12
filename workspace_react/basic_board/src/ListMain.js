import { useNavigate } from 'react-router-dom'
import './ListMain.css'

//게시글 목록 컴포넌트
const ListMain = ({board_list})=>{
  //함수 ->사용시 소괄호 부착 ex)navigate()
  const navigate = useNavigate()


  return(
    <div>
      <table>
        <thead>
          <tr>
            <td>글번호</td>
            <td>제목</td>
            <td>작성자</td>
            <td>작성일</td>
          </tr>
        </thead>
        <tbody>
          {
            board_list.map((board, i)=>{
              return(
                <tr key={i}>
                  <td>{board.boardNum}</td>
                  <td>
                    <span onClick={(e)=>{
                      navigate(`/detail/${board.boardNum}`) 
                    }}>
                      {board.title}
                    </span>
                    {/* <Link to='/detial'>{board.title}</Link> */}
                  </td>
                  <td>{board.writer}</td>
                  <td>{board.createDate}</td>
                </tr>
              )
            })
              
          }
        </tbody>
      </table>
      <button type='button' onClick={(e)=>{
        navigate(`/writeForm`)
      }}>글쓰기</button>
    </div>
  )
}
export default ListMain