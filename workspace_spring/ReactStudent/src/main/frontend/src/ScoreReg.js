import axios from "axios"
import { useEffect, useState } from "react"
import { useNavigate, useParams } from "react-router-dom"
import { getOne, getScore, updateOne } from "./apis"

const ScoreReg = () =>{
  const navigate = useNavigate()
  const {stuNum} = useParams()

  const[stu, setStu] = useState({})

  function changeScore(e){
    setStu({...stu,
      [e.target.name] : e.target.value
    })
  }

  function regScore(){
    // axios
    // .put('/regScore', stu)
    updateOne(stu)
    .then((res)=>{
      navigate('/stuScore')
    })
    .catch((error)=>{
      alert('실패했다')
      console.log(error)
    })
  }
  //성적 입력을 하려는 학생의 이름, 국,영,수 점수 조회
  useEffect(()=>{
    getOne(stuNum)
    .then((res)=>{
      setStu(res.data)
    })
    .catch((error)=>{
      alert('실패')
    })
  }, [])

  return(
    <>
      <h3>{stu.stuName}학생의 성적을 입력합니다</h3>
      <div>
        국어:<input type="text" name="korScore" value={stu.korScore} onChange={(e)=>{
          changeScore(e)
        }}></input>
      </div>
      <div>
        영어:<input type="text" name="engScore" value={stu.engScore} onChange={(e)=>{
          changeScore(e)
        }}></input>
      </div>
      <div>
        수학:<input type="text" name="mathScore" value={stu.mathScore} onChange={(e)=>{
          changeScore(e)
        }}></input>
      </div>
      <button type="button" onClick={()=>{
        regScore(stuNum)
      }}>점수등록</button>
    </>
  )
}
export default ScoreReg