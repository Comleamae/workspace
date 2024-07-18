import axios from "axios"
import { useEffect, useState } from "react"
import { useNavigate, useParams } from "react-router-dom"

const DelStu = () => {
  const navigate = useNavigate()
  const [stuList,setStuList] = useState([])
  

  useEffect(()=>{
    axios
    .get('/stuList')
    .then((res)=>{
      setStuList(res.data)
    })
    .catch((error)=>{
      alert('학생정보 안가져옴')
    })
  }, [])

  function delOne(stuNum){
    axios
    .delete(`/delStu/${stuNum}`)
    .then((res)=>{
      window.location.reload()
    })
    .catch((error)=>{
      alert('삭제실패')
      console.log(error)
    })
  }
  return(
    <>
      <h3>학생 삭제 페이지</h3>
      <table>
        <thead>
          <tr>
            <td>NO</td>
            <td>학생명</td>
            <td>삭제</td>
          </tr>
        </thead>
        <tbody>
          {stuList.map((stu,i)=>{
            return(
              <tr key={i}>
                <td>
                  {i+1}
                </td>
                <td>
                  {stu.stuName}
                </td>
                <td>
                  <button type="button" onClick={(e)=>{delOne(stu.stuNum)}}>삭제</button>
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

export default DelStu