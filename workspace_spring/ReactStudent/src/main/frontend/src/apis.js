
//서버와 통신하는 기능을 모아놓은 js

import axios from "axios"

//학생 목록 조회 api
//최초 1회에만 적용됨
export const getStuList1 = axios.get('/stuList')
//지속적으로 불러옴
export const getStuList = ()=>{
 const resposnse = axios.get('/stuList')
 return resposnse
}


//상세정보조회
export const getOne = (stuNum)=>{
  return axios.get(`/oneStu/${stuNum}`)
}

//상세정보 교체
export const updateOne = (stu)=>{
  return axios.put('/regScore', stu)
}

// export let myName = 'kim'
// export let myAge = 30

// export const myPrint = ()=>{
//   console.log(1)
// }

// export function myPrint2(){
//   console.log(2)
// }

