import axios from "axios"
import { useEffect, useState } from "react"
import { useNavigate, useParams } from "react-router-dom"

const ScoreReg = () =>{
  const navigate = useNavigate()
  const params = useParams()

  const[stu, setStu] = useState({})

  // const[scores, setScores] = useState(
  //   { stuNum : 0
  //     , stuName:''
  //     , korScore:stu.korScore
  //     , engScore:stu.engScore
  //     , mathScore:stu.mathScore}
  // )

  // function changeScore(e){
  //   setScores({...scores,
  //     [e.target.name] : e.target.value
  //   })
  // }
  function changeScore(e){
    setStu({...stu,
      [e.target.name] : e.target.value
    })
  }

  function regScore(){
    axios
    .put(`/regScore`, stu)
    .then((res)=>{
      navigate('/stuScore')
    })
    .catch((error)=>{
      alert('실패했다')
      console.log(error)
    })
  }

  useEffect(()=>{
    axios
    .get(`/oneStu/${params.stuNum}`)
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
        국어:<input type="text" name="korScore" defaultValue={stu.korScore} onChange={(e)=>{
          changeScore(e)
        }}></input>
      </div>
      <div>
        영어:<input type="text" name="engScore" defaultValue={stu.engScore} onChange={(e)=>{
          changeScore(e)
        }}></input>
      </div>
      <div>
        수학:<input type="text" name="mathScore" defaultValue={stu.mathScore} onChange={(e)=>{
          changeScore(e)
        }}></input>
      </div>
      <button type="button" onClick={()=>{
        regScore(params.stuNum)
      }}>점수등록</button>
    </>
  )
}
export default ScoreReg