import axios from 'axios'
import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom'

const Login = ({setOnLogin, onLogin}) => {
  
  const[loginData, setLoginData] = useState({memId:''
    , memPw:''})

  const navigate = useNavigate()
  function changeData(e){
    setLoginData({
      ...loginData,
      [e.target.name]:e.target.value
    })
  }
  //데이터베이스에서 아이디랑 비밀번호가 같은 걸 조회해서 나오면 로그인 성공
  function confirmLogin(){
    axios
    .post('/api_member/login', loginData)
    .then((res)=>{
      if(res.data!=""){
        alert('로그인 성공')
        //session에 로그인 정보를 저장하기위한 객체를 생성
        const loginInfo = {
          memId: res.data.memId
          , memName: res.data.memName
          , memRole: res.data.memRole
        }
        //session에는 객체 자체를 저장할 수 없기에 json을 통해서 문자로
        window.sessionStorage.setItem('loginInfo', JSON.stringify(loginInfo))
        setOnLogin(loginInfo)
        navigate('/')
      }
      else{
        alert('로그인 실패')
      }
    })
    .catch((error)=>{}, [])
  }
  return (
    <div>
      <h1>로그인 페이지</h1>
      <div>
        <table>
          <tbody>
            <tr>
              <td>아이디</td>
              <td>
                <input type='text' name='memId' onChange={(e)=>{changeData(e)}}/>
              </td>
            </tr>
            <tr>
              <td>비밀번호</td>
              <td>
                <input type='text' name='memPw' onChange={(e)=>{changeData(e)}}/>
              </td>
            </tr>
          </tbody>
        </table>
      </div>
      <div className='btn-div'>
        <button onClick={(e)=>{confirmLogin()}}>로그인</button>
      </div>
    </div>
  )
}

export default Login
