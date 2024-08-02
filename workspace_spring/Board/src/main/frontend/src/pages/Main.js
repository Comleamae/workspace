
import { useEffect, useState } from "react"
import * as boardApi from '../apis/boardApi';
import { useNavigate } from "react-router-dom";

const Main = (({onLogin})=>{
  //자바에서 가져온 페이지 정보를 담을 변수
  const [pageInfo, setPageInfo] = useState({})
  //그림 그릴 페이지 숫자를 담을 배열(map)
  const [pageArr, setPageArr] = useState([])
  const [boardList, setBoardList] = useState([])
  const [searchData, setSearchData] = useState({
    searchType:'TITLE'
    , searchValue:''
  })
  const navigate = useNavigate()

  

  useEffect(()=>{
   // boardApi.getBoardList(searchData)
    boardApi.getBoardList(1)
    .then((res)=>{
      setBoardList(res.data.boardList)
      //함수형
      setPageInfo(res.data.pageInfo)
      // //map형
      // const pageData = []
      // for(let i = res.data.pageInfo.beginPage; i<res.data.pageInfo.endPage+1; i++){
      //   pageData.push(i)
      // }
      // setPageArr(pageData)
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
    setBoardList(res.data.boardList)
   })
   .catch((error)=>{}, [])
  }
  //페이징 처리한 곳에서 숫자(페이지번호)를 클릭하면 다시 게시글을 조회
  function getList(pageNo){
    boardApi.getBoardList(pageNo)
    .then((res)=>{
      setBoardList(res.data.boardList)
      setPageInfo(res.data.pageInfo) 
    })
    .catch((error)=>{}, [])
  }
 
  //페이징 그리기
  //일반for문을 사용하지 못하기에 함수에 담아서 리턴 시키는 방식으로 사용
  function drawPaginataion(){
    const arr = []
    if(pageInfo.prev){
      arr.push(<span className="page-span" onClick={(e)=>{getList(pageInfo.beginPage-1)}}>이전</span>)
    }
    for(let i=pageInfo.beginPage; i<=pageInfo.endPage; i++){
      arr.push(<span key={i} className="page-span" name="nowPage" onClick={(e)=>{getList(i)}}>{i}</span>)
    }
    if(pageInfo.next){
      arr.push(<span className="page-span" onClick={(e)=>{getList(pageInfo.endPage+1)}}>다음</span>)    
    }
    return arr
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
            <td>글번호</td>
            <td>제목</td>
            <td>작성자</td>
            <td>작성일</td>
          </tr>
         </thead>
          <tbody>
            {   
              boardList.map((board, i)=>{
                  return(
                    <tr key={i}>
                      <td>{boardList.length-i}</td>
                      <td>{board.boardNum}</td>
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
      {/* 페이징 정보가 나오는 div */}
      <div className="page-div">
       {
        //함수형
        drawPaginataion()
       }
      </div>
    </div>
  )
})
export default Main