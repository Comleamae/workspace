import axios from "axios"
import { useState } from "react"
import { useNavigate } from "react-router-dom"
import './RegStu.css'

const RegStu = () =>{
  
  const navigate = useNavigate()
  //쿼리 실행을 위해 전달해야하는 데이터
  const [stu, setStu] = useState({
    stuName:''
    , stuAge:''
    , stuAddr:''
    , stuTell:''
  })

  function changeOne(e){
    setStu({
      ...stu,
      [e.target.name] : e.target.value
    })
  }

  function regOne(){
    //이름 입력했는지 확인
    const nameInputTag = document.querySelector('input[name="stuName"]')

    if(nameInputTag.value == ''){
      alert('이름은 필수입력입니다')
      nameInputTag.focus()
      return ;
    }


    axios
    .post('/regStu', stu)
    .then((res)=>{
      alert('정보가져옴')
      navigate('/stuAllList')
    })
    .catch((error)=>{
      alert('정보 안가져감')
      console.log(error)
    })
  }

  return(
    <>
      <h3>학생 등록 페이지</h3>
      <div>
        이름: <input type="text" name="stuName" onChange={(e)=>{changeOne(e)}}></input>
      </div>
      <div>
        나이: <input type="text" name="stuAge" onChange={(e)=>{changeOne(e)}}></input>
      </div>
      <div>
        연락처: <input type="text" name="stuTell" onChange={(e)=>{changeOne(e)}}></input>
      </div>
      <div>
        주소: <input type="text" name="stuAddr" onChange={(e)=>{changeOne(e)}}></input>
      </div>
      <button type="button" onClick={(e)=>{
        regOne()
      }}>학생등록</button>
    </>
  )
}

export default RegStu