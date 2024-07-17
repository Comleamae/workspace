import { useNavigate } from "react-router-dom"

const ScoreReg = () =>{
  const navigate = useNavigate()
  return(
    <>
      <h3>{}학생의 성적을 입력합니다</h3>
      <div>
        국어:<input type="text"></input>
      </div>
      <div>
        영어:<input type="text"></input>
      </div>
      <div>
        수학:<input type="text"></input>
      </div>
      <button type="button" onClick={()=>{
        navigate('/stuScore')
      }}>점수등록</button>

    </>
  )
}
export default ScoreReg