import axios from 'axios'
import React, { useEffect, useState } from 'react'

const Login = () => {
  const [loginData, setLoginData] = useState({})

  useEffect(()=>{
    axios
    .post('/member/login', loginData)
    .then((res)=>{
      
    })
    .catch((error)=>{
      console.log(error)
    })
  }, [])

  function changeDate(e){
    setLoginData({
      ...loginData,
      [e.target.name]:e.target.value
    })
  }

  return (
    <div className='loginForm'>
      <table>
        <tr>
          <td>아이디</td>
          <td>
            <input type='text' name='memId' onChange={(e)=>{changeDate(e)}}/>
          </td>
        </tr>
        <tr>
          <td>비밀번호</td>
          <td>
            <input type='password' name='memPw' onChange={(e)=>{
              changeDate(e)
            }}/>
          </td>
        </tr>
      </table>
    </div>
  )
}

export default Login
