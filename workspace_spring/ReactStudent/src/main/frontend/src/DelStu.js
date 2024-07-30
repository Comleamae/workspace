import axios from "axios"
import { useEffect, useState } from "react"
import {getStuList} from './apis'

const DelStu = () => {
  const [stuList,setStuList] = useState([])
  

  useEffect(()=>{
    getStuList()
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
      alert('삭제완료')

      //stuList 라는 STATE 변수의 값을 변경한다-> 재랜더링되면서 알아서 그림을 새롭게 그린다
      //STATE 변수의 값을 state 변경 함수를 사용해서 변경

      //데이터베이스에서 삭제한 학생 정보를 stuList 에서도 삭제
      // stuList.forEach((stu, i)=>{
      //   if(stu.stuNum == stuNum){
      //     stuList.splice(i, 1)
      //   }
      // })

      //위 코드를 람다식으로
      //filter를 통해 걸러낸 삭제를 실행할 stu를 제외한 나머지를 선택
      const result = stuList.filter((stu)=>{return stu.stuNum != stuNum})
      

      //setStuList([...stuList])
      setStuList([...result])
     
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