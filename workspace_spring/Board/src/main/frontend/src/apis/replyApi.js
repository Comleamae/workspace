import axios from "axios"

export const getReplyList = (boardNum)=>{
  return axios.get(`/reply/one/${boardNum}`)
}