import axios from 'axios'
import React, { useEffect, useState } from 'react'
import { useNavigate } from 'react-router-dom'

const Join = () => {
  const navigate = useNavigate()
  const [confirmId, setConfirmId] = useState({})
  const [regData, setRegData] = useState({})

  
  function confirmIdOne(){
      axios
      .get(`/member/one/${regData.memId}`)
      .then((res)=>{
        setConfirmId(res.data)
        if(confirmId==null){
          alert('사용가능한 아이디')
        }
      })
      .catch((error)=>{})
    }
    
  
  function changeDate(e){
    setRegData({
      ...regData,
      [e.target.name]:e.target.value
    })
  }

  function regMem(){
    if(regData.memPw!=regData.confirmPw){
      alert('비밀번호가 다름')
      return;
    }
    axios
    .post('/member/reg', regData)
    .then((res)=>{
      alert('회원 등록완료')
      navigate('/')
    })
    .catch((error)=>{
      console.log(error)
    }, [])
  }
  return (
    <div className='join-form'>
      <table>
        <tr>
          <td>아이디</td>
          <td>
            <input type='text' name='memId' onChange={(e)=>{changeDate(e)}}/>
          </td>
          <td>
            <button type='button' onClick={(e)=>{confirmIdOne()}}>중복확인</button>
          </td>
        </tr>
        <tr>
          <td>비밀번호</td>
          <td>
            <input type='password' name='memPw' onChange={(e)=>{changeDate(e)}}/>
          </td>
        </tr>
        <tr>
          <td>비밀번호 확인</td>
          <td>
            <input type='password' name='confirmPw' onChange={(e)=>{changeDate(e)}}/>
          </td>
        </tr>
        <tr>
          <td>이름</td>
          <td>
            <input type='text' name='memName'onChange={(e)=>{changeDate(e)}}/>
          </td>
        </tr>
        <tr>
          <td>연락처</td>
          <td>
            <input type='text' name='memTel' placeholder='숫자만 입력하세요' onChange={(e)=>{changeDate(e)}}/>
          </td>
        </tr>
        <tr>
          <td rowSpan={3}>주소</td>
          <td>
            <input type='text' name='post' placeholder='우편번호' onChange={(e)=>{changeDate(e)}}/> <button type='button'>검색</button>
          </td>
        </tr>
        <tr>
          <td>
            <input type='text' name='memAddr' placeholder='주소' onChange={(e)=>{changeDate(e)}}/>
          </td>
        </tr>
        <tr>
          <td>
            <input type='text' name='addrDetail' placeholder='상세주소' onChange={(e)=>{changeDate(e)}}/>
          </td>
        </tr>
        <tr>
          <td>이메일</td>
          <td>
            <input type='text' name='memEamil' onChange={(e)=>{changeDate(e)}}/>
            <select name='memEamil'>
              <option>naver.com</option>
              <option>gmail.com</option>
            </select>
          </td>
        </tr>
      </table>
      
      <div className='btn-div'>
        <button type='button' onClick={(e)=>{navigate(-1)}}>뒤로가기</button>
        <button type='button' onClick={(e)=>{regMem()}}>가입하기</button>
      </div>
    </div>
  )
}

export default Join
