import axios from "axios"
import { useEffect, useState } from "react"
import { useNavigate, useParams } from "react-router-dom"
import { getOne, getScore } from "./apis"

const StuDetail = ()=>{
  const navigate = useNavigate()
  const [stu, setStu] = useState({})
  const params = useParams()
  const avg = (stu.korScore+stu.engScore+stu.mathScore)/3

  useEffect(()=>{
    getOne(params.stuNum)
    .then((res)=>{
      setStu(res.data)
    })
    .catch((error)=>{
      alert('실패')
    })
  },[])

  return(
    <>
      <table>
        <tr>
          <td>이름</td>
          <td>{stu.stuName}</td>
          <td>나이</td>
          <td>{stu.stuAge}</td>
        </tr>
        <tr>
          <td>연락처</td>
          <td>{stu.stuTell}</td>
          <td>주소</td>
          <td>{stu.stuAddr}</td>
        </tr>
        <tr>
          <td>국어점수</td>
          <td>{stu.korScore}</td>
          <td>영어점수</td>
          <td>{stu.engScore}</td>
        </tr>
        <tr>
          <td>수학점수</td>
          <td>{stu.mathScore}</td>
          <td>평균</td>
          <td>{Math.round(avg*100)/100}</td>
        </tr>
      </table>
      <button type="button" onClick={()=>{navigate(-1)}}>뒤로가기</button>
    </>
  )
}
export default StuDetail