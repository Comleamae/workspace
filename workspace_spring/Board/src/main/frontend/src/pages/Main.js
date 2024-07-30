
import { useEffect, useState } from "react"
import * as boardApi from '../apis/boardApi';
import { useNavigate } from "react-router-dom";

const Main = (({onLogin})=>{
  const [cnt, setCnt] = useState(0)
  const [boardList, setBoardList] = useState([])
  const [searchData, setSearchData] = useState({
    searchType:'TITLE'
    , searchValue:''
  })
  const navigate = useNavigate()

  useEffect(()=>{
    boardApi.getBoardList(searchData)
    .then((res)=>{
      setBoardList(res.data)
    })
    .catch((error)=>{
      alert('실패함')
    })
  }, [])

  function changeSearch(e){
    setSearchData({
      ...searchData,
      [e.target.name]:e.target.value
    })
  }
  //검색 버튼 클릭 시 실행 함수
  function searchOne(){
   boardApi.getBoardList(searchData)
   .then((res)=>{
    setBoardList(res.data)
    
   })
   .catch((error)=>{}, [])
  }


  return(
    <div className="board-list-container">
      <div className="search-div">
        <select name="searchType" onChange={(e)=>{changeSearch(e)}}>
          <option value={'TITLE'}>제목</option>
          <option value={'MEM_ID'}>작성자</option>
        </select>
        <input type="text" name="searchValue" onChange={(e)=>{changeSearch(e)}}></input>
        <button className="btn" type="button" onClick={(e)=>{searchOne()}}>검색</button>
      </div>
      <div className="board-list-div">
        <table>
         <colgroup>
          <col width='10%'/>
          <col width='*'/>
          <col width='20%'/>
          <col width='20%'/>
         </colgroup>
         <thead>
          <tr>
            <td>NO</td>
            <td>제목</td>
            <td>작성자</td>
            <td>작성일</td>
          </tr>
         </thead>
          <tbody>
            {   boardList.map((board, i)=>{
                  return(
                    <tr key={i}>
                      <td>{boardList.length-i}</td>
                      <td>
                        <span onClick={(e)=>{navigate(`/detail/${board.boardNum}`)}}>{board.title}</span>
                      </td>
                      <td>{board.memId}</td>
                      <td>{board.createDate}</td>
                    </tr>
                  )
              })
            }
          </tbody>
        </table>
      </div>
      <div className="btn-div">
        {
          onLogin.memId != null
          ?
          <button type="button" onClick={()=>{navigate('/write')}}>글쓰기</button>
          :
          null
        }
        
      </div>
      
    </div>
  )
})
export default Main