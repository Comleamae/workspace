import axios from "axios"
import { useEffect, useState } from "react"

const ListAll = () =>{

  const [stuList,setStuList] = useState([])

  useEffect(()=>{
    axios
    .get('/stuList')
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
          {stuList.map((e,i)=>{
            return(
            <tr key={i}>
              <td>{e.stuNum}</td>
              <td>{e.stuName}</td>
              <td>{e.korScore}</td>
              <td>{e.engScore}</td>
              <td>{e.mathScore}</td>
              <td>
                {((e.korScore + e.engScore + e.mathScore ) /3.0).toFixed()}
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