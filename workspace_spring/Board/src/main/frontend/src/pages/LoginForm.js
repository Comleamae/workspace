import axios from "axios"
import './LoginForm.css'
import { useState } from "react"
import { useNavigate } from "react-router-dom"
import * as memberApi from '../apis/memberApi'

const LoginForm = ()=>{
  //버튼 활성화 여부 state 변수
  const [isDisabled, setIsDisabled] = useState(true)
  const navigate = useNavigate()
  const [isChecked, setIsChecked] =useState(true)
  //회원가입 시 가져가야 하는 데이터를 저장할 state 변수
  const [regMem, setRegMem] = useState({
    memId:''
    , memPw:''
    , confirmPw:''
    , memName:''
    , gender:'male'
  })
  //input태그에 값 입력시 regMem변경
  function changeMem(e){
    //아이디 input 태그의 값이 변경되면 회원가입 버튼을 비활성화
    if(e.target.name == 'memId'){
      setIsDisabled(true)
    }
    setRegMem({
      ...regMem,
      [e.target.name]:e.target.value
    })
  }
  
  //아이디 중복 확인 함수
  function checkId(){

    if(regMem.memId == ''){
      alert('아이디를 입력하세요')
      return 
    }

    //아이디 값을 가지고 자바로 가서 중복 확인 쿼리를 실행
    memberApi.checkId(regMem.memId)
    .then((res)=>{
      //true=>아이디 사용불가능
      //false=>아이디 사용가능
      const result = res.data
      alert(result ? '아이디 중복':'사용가능')
      //사용가능한 id면 버튼 활성화
      setIsDisabled(!result ? false : true)
    })
    .catch((error)=>{
      alert('중복확인오류')
      console.log(error)
    })
  }
  //회원가입 버튼 클릭 시 실행
  function goRegMem(){
    //validation 처리 = 유효성 검사
    if(regMem.memPw != regMem.confirmPw){
      alert('비번일치하지않음')
      return
    }
    //id는 4~8글자
    const idLength = regMem.memId.length
    if(idLength<4 || idLength>8){
      alert('id는 4~8 글자여야 합니다')
      return
    }

    //회원가입 
    memberApi.regMem(regMem)
    .then((res)=>{
      if(regMem.confirmPw==regMem.memPw){
        alert('등록성공')
        navigate('/login')
      }
      else{
        alert('비밀번호 확인해봐')
        
      }
    })
    .catch((error)=>{
      alert('실패')
      console.log(error)
    })
  }

  return(
    <div className="login-div">
      <div>
        <p>아이디</p>
        <div className="id-area">
          <input type="text" className="inp" name="memId" onChange={(e)=>{changeMem(e)}}/>
          <button type="button" className="btn" onClick={(e)=>{
            checkId()
          }}>중복확인</button>
        </div>
      </div>
      <div>
        <p>비밀번호</p>
        <input type="password" name="memPw" className="inp" onChange={(e)=>{changeMem(e)}}/>
      </div>
      <div>
        <p> 비밀번호 확인</p>
        <input type="password" name="confirmPw" className="inp" onChange={(e)=>{changeMem(e)}}/>
      </div>
      <div>
        <p>이름</p>
        <input type="text" name="memName" className="inp" onChange={(e)=>{changeMem(e)}}/>
      </div>
      <div className="gender-div">
        <div>
          <span>성별</span>
        </div>
        <div>
          <input type="radio" name="gender" value="male" onChange={(e)=>{changeMem(e)}} checked={regMem.gender == 'male'}/>남
        </div>
        <div>
          <input type="radio" name="gender" value="female" onChange={(e)=>{changeMem(e)}} checked={regMem.gender == 'female'}/>여
        </div>
      </div>
      <div className="btn-div">
        <button type="button" className="btn" disabled={isDisabled} onClick={(e)=>{goRegMem()}}>회원가입</button>
        {/* 버튼 활성화 연습 */}
        {/* <button type="button" disabled={isDisabled} onClick={(e)=>{goRegMem()}}>회원가입</button> */}
      </div>
    </div>
  )
}
export default LoginForm