import axios from "axios"

// 전체 출력
export const getItemList = ()=>{
  return axios.get('/itemList')
}

//하나 등록
export const insertOne = (item)=>{
  return axios.post('/regItem', item)
}