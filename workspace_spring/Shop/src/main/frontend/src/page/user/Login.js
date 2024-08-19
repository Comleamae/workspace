import axios from 'axios'
import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom'
import Modal from '../../common/Modal'
import './Login.css'

const Login = ({loginInfo, setLoginInfo}) => {
  //로그인 버튼 클릭 시 화면에 보여지는 모달창의 상태
  const[beforeLoginModal, setBeforeLoginModal] = useState(false)

  //로그인 쿼리가 실행된 후 보여지는 모달창의 상태
  const[afterLoginModal, setAfterLoginModal] = useState(false)

  //login 성공 실패 여부를 저장하는 변수
  const[isLoginSuccess, setIsLoginSuccess] = useState(false)
  
  //입력한 id, pw를 저장할 변수
  const[loginData, setLoginData] = useState({
    memId:''
    , memPw:''
  })

  const navigate = useNavigate()
  //입력한 id,pw를 loginData에 저장하는 함수
  function changeLoginData(e){
    setLoginData({
      ...loginData,
      [e.target.name]:e.target.value
    })
  }
  //데이터베이스에서 아이디랑 비밀번호가 같은 걸 조회해서 나오면 로그인 성공
  function login(){
    if(loginData.memId==''||loginData.memPw==''){
      //모달창상태를 보이게 변경
      setBeforeLoginModal(true)
      return
    }
    axios
    .post('/api_member/login', loginData)
    .then((res)=>{
      setAfterLoginModal(true)
      //자바에서 null 데이터 전달되면 res.data는 빈문자('')데이터로 변환
      if(res.data==''){//로그인 실패 시
        setIsLoginSuccess(false)
        drawModalContent()
      }
      else{//로그인 성공 시
        setIsLoginSuccess(true)
         //session에 로그인 정보를 저장하기위한 객체를 생성
         const loginInfo = {
          memId: res.data.memId
          , memName: res.data.memName
          , memRole: res.data.memRole
        }
        const json_loginInfo = JSON.stringify(loginInfo)
        //session에는 객체 자체를 저장할 수 없기에 json을 통해서 문자로
        window.sessionStorage.setItem('loginInfo', json_loginInfo)
        //로그인 정보를 저장할기 위해 만든 state 변수 loginInfo(App.js에 생성)에 로그인 정보 저장
        setLoginInfo(loginInfo)
        drawModalContent()
      }
    })
    .catch((error)=>{}, [])
  }
  //login 쿼리 실행 후 뜨는 모달 안의 내용을 바꿔주는 함수
  function drawModalContent(){
    return(
      <>
        {
          isLoginSuccess
          ?
          <div>환영합니다</div>
          :
          <div>id, pw 확인하세요</div>
        }
      </>
    )
  }
  //login 쿼리 실행 후 뜨는 모달 안의 확인 버튼 클릭 시 실행되는 내용
  function handleBtn(){
    if(isLoginSuccess){//로그인 성공 시 확인 버튼 내용
      if(loginInfo.memRole == 'USER'){
        navigate('/list')
      }
      else if(loginInfo.memRole=='ADMIN'){
        navigate('/admin')
      }
    }
  }

  return (
    <div className='login-page-div'>
      <h1>로그인 페이지</h1>
      <div>
        <table className='login-page-table'>
          <tbody>
            <tr>
              <td>아이디</td>
              <td>
                <input type='text' name='memId' onChange={(e)=>{changeLoginData(e)}}/>
              </td>
            </tr>
            <tr>
              <td>비밀번호</td>
              <td>
                <input type='password' name='memPw' onChange={(e)=>{changeLoginData(e)}}/>
              </td>
            </tr>
          </tbody>
        </table>
      </div>
      <div className='btn-div'>
        <button className='btn btn-primary' onClick={(e)=>{login()}}>로그인</button>
      </div>
      {/*login 중 id, pw 입력 여부 확인 모달 위치 */}
      {
        beforeLoginModal
        ?
        <Modal content={()=>{
                          return(
                            <div>id,pw는 필수입력</div>
                            )
                          }}
                setIsShow={setBeforeLoginModal}
                clickCloseBtn={()=>{}}
        />
        :
        null
      }
      {/*login 쿼리 실행 후 뜨는 모달*/}
      {
        afterLoginModal
        ?
        <Modal content={drawModalContent}
               setIsShow={setAfterLoginModal}
               clickCloseBtn={handleBtn}
        />
        :
        null
      }
    </div>
  )
}

export default Login
