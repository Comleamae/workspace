import axios from "axios"
//아이디 중복 체크
export const checkId = (inputId)=>{
  const response = axios.get(`/member/checkId/${inputId}`)
  return response
}
//회원가입
export const regMem = (regMem)=>{
  const response = axios.post('/member/regMem', regMem)
  return response
}
//로그인
export const loginChk = (loginMem)=>{
  const response = axios.post('/member/login', loginMem)
  return response
}