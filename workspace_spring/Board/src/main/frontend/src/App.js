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
    window.sessionStorage.removeItem('loginInfo')
    setOnLogin({})
    alert('로그아웃!')
    navigate('/main')
  }
  
  useEffect(()=>{
    const loginDataStirng = window.sessionStorage.getItem('loginInfo')

    if(loginDataStirng != null){
      const loginData = JSON.parse(loginDataStirng)
      setOnLogin(loginData)
    }
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
