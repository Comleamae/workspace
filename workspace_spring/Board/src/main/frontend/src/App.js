import logo from './logo.svg';
import './App.css';
import './reset.css';
import { Route, Routes, useNavigate, useParams } from 'react-router-dom';
import Main from './pages/Main';
import LoginForm from './pages/LoginForm';
import Login from './pages/Login';
import WriteForm from './pages/WriteForm';
import Detail from './pages/Detail';
import { useEffect, useState } from 'react';
import axios from 'axios';
import Update from './pages/Update';


//재랜더링:값이 변한 state 변수가 선언된 컴포넌트를 다시 해석
function App() {

  const[onLogin,  setOnLogin] = useState({})
  const navigate = useNavigate()

  function logOut(){
    //세션 스토리지 내의 아이템을 비울때 사용함
    window.sessionStorage.removeItem('loginInfo')
    //하지만 빈 객체로 만들어 두지 않으면 ""라는 값을 가지므로 로그인 상태로 확인함
    setOnLogin({})
    alert('로그아웃!')
    navigate('/main')
  }
  // 브라우저 내의 세션 스토리지에서 정보를 받아오기에 useEffect를 사용해서하는가?
  useEffect(()=>{
    const loginDataStirng = window.sessionStorage.getItem('loginInfo')

    if(loginDataStirng != null){
      //세션스토리지의 객체는 JSON을 통한 객체의 문자열화로만 저장할 수 있기에 
      //불러올 경우에는 JSON.parse(세션스토리지의 데이터)를 통해서 문자열화를 해제해 객체로 변환작업을 거쳐야 불러올 수 있음
      const loginData = JSON.parse(loginDataStirng)
      setOnLogin(loginData)}
  }, [])

  return (
    <div className='container'>
      <div className="App">
        <div className='header'>
          <div className="setLogin">
            {
              onLogin.memId == null 
              ?
              <>
                <span onClick={()=>{navigate('/login')}}>Login</span>
                <span onClick={()=>{navigate('/form')}}>Join</span> 
              </>
              :
              <div>
                <span>{onLogin.memName}님 반갑습니다</span>
                <span onClick={(e)=>{
                  logOut(e)
                }}>로그아웃</span>
              </div>
            }
          </div>
          <h2>자유 게시판</h2>
        </div>
        <div className='content'>
          <Routes>
            {/* 메인화면 */}
            <Route path='/main' element={<Main onLogin={onLogin}/>}></Route>
            {/* 회원가입 페이지 */}
            <Route path='/form' element={<LoginForm/>}></Route>
            {/* 로그인 페이지 */}
            <Route path='/login' element={<Login setOnLogin={setOnLogin}/>}></Route>
            {/* 글쓰기 페이지 */}
            <Route path='/write' element={<WriteForm onLogin={onLogin}/>}/>
            {/* 글 상세 조회 */}
            <Route path='/detail/:boardNum' element={<Detail onLogin={onLogin}/>}/>
            {/* 글 수정 */}
            <Route path='/update/:boardNum' element={<Update onLogin={onLogin}/>}/>
          </Routes>
        </div>
      </div>
    </div>
  );
}

export default App;
