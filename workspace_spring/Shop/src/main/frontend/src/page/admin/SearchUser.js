import axios from 'axios'
import React, { useEffect, useState } from 'react'
import './SearchUser.css'

const SearchUser = () => {

  const[userList, setUserList] = useState([])

  useEffect(()=>{
    axios
    .get('/api-admin/getAllUser')
    .then((res)=>{
      setUserList(res.data)
    })
    .catch((error)=>{
      console.log(error)
    })
  }, [])

  return (
    <div className='search-user-div'>
       <table>
          <thead>
            <tr>
              <td>이름</td>
              <td>아이디</td>
              <td>비밀번호</td>
              <td>연락처</td>
              <td>우편번호</td>
              <td>주소</td>
              <td>상세주소</td>
              <td>이메일</td>
              <td>등급</td>
            </tr>
          </thead>
          <tbody>
          {
            userList.map((user, i)=>{
              return(
                <tr key={i}>
                  <td>{user.memName}</td>
                  <td>{user.memId}</td>
                  <td>{user.memPw}</td>
                  <td>{user.memTel}</td>
                  <td>{user.post}</td>
                  <td>{user.memAddr}</td>
                  <td>{user.addrDetail}</td>
                  <td>{user.memEmail}</td>
                  <td>{user.memRole}</td> 
                </tr>
              
              )
            })
          }
          </tbody>
      </table>
    </div>
  )
}

export default SearchUser
