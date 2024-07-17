import axios from "axios"
import { useEffect, useState } from "react"
import { useNavigate } from "react-router-dom"

const Score = ()=>{
  const navigate = useNavigate()
  const [stuList, setStuList] = useState([])

  useEffect(()=>{
    axios
    .get('/stuList')
    .then((res)=>{
      setStuList(res.data)
    })
    .catch((error)=>{
      alert('학생정보 없음')
    })
  }, [])

  return(
    <>
      <h3>성적 관리 페이지</h3>
      <table>
        <thead>
          <tr>
            <td>NO</td>
            <td>학생명</td>
            <td>성적입력</td>
          </tr>
        </thead>
        <tbody>
          {
            stuList.map((stu,i)=>{
              return(
                <tr>
                  <td>
                    {stu.stuNum}
                  </td>
                  <td>
                    {stu.stuName}
                  </td>
                  <td>
                    <button type="button" onClick={()=>{
                      navigate('/scoreForm')
                    }}>입력</button>
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
export default Score