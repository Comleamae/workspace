import axios from "axios"
// 검색기능
// export const getBoardList = (searchData) =>{
//   const response = axios.post('/board/list', searchData)
//   return response
// }
export const getBoardList = (pageNo) =>{
  const response = axios.post('/board/list', {'pageNo':pageNo})
  return response
}
export const getBoardDetail = (boardNum)=>{
  return axios.get(`/board/detail/${boardNum}`)
}
export const postRegBoard = (newBoard)=>{
  const response = axios.post('/board/reg', newBoard)
  return response
}
export const deleteBoard = (boardNum)=>{
  return axios.delete(`/board/delete/${boardNum}`)
}