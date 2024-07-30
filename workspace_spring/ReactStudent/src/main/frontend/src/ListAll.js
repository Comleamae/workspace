import axios from "axios"
import { useEffect, useState } from "react"
import './ListAll.css'
import { useNavigate, useParams } from "react-router-dom"
//import * as api from './apis' //전체 가져오기
import {getStuList} from './apis' //일부 가져오기

const ListAll = () =>{

  const navigate = useNavigate()

  const [stuList,setStuList] = useState([])

  useEffect(()=>{
    getStuList()
    .then((res)=>{
      setStuList(res.data)
    })
    .catch((error)=>{
      alert('정보불러오기 실패')
      console.log(error)
    })
  }, [])

  return(
    <>
      <h3>학생 정보 조회 페이지</h3>
      <table>
        <thead>
          <tr>
            <td>NO</td>
            <td>학생명</td>
            <td>국어점수</td>
            <td>영어점수</td>
            <td>수학점수</td>
            <td>평균</td>
          </tr>
        </thead>
        <tbody>
          { 
            // 삼항연산자로 if문 사용
            stuList.length == 0 
            ? 
            <tr>
              <td colSpan={6}>조회된 데이터가 없습니다</td>
            </tr>
            :
            stuList.map((stu,i)=>{
              const avg = (stu.korScore + stu.engScore + stu.mathScore ) /3
              return(
              <tr key={i}>
                <td>{i+1}</td>
                <td>
                  <span onClick={(e)=>{
                    navigate(`/stuDetail/${stu.stuNum}`)
                  }}>{stu.stuName}</span>
                </td>
                <td>{stu.korScore}</td>
                <td>{stu.engScore}</td>
                <td>{stu.mathScore}</td>
                <td>
                  {Math.round(avg*100)/100}
                </td>
              </tr>
              )
            })
          }
        </tbody>
      </table>
    </>
  )
}
export default ListAll