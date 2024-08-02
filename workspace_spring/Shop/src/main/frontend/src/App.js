
import { useState } from 'react';
import './App.css';
import AdminLayout from './page/admin/AdminLayout';
import Join from './page/user/Join';
import Login from './page/user/Login';
import UserLayout from './page/user/UserLayout';
import './reset.css';
import { Route, Routes, useNavigate, useParams } from 'react-router-dom';

function App() {
  const navigate = useNavigate()
  //로그인 상태
  const[onLogin, setOnLogin] = useState({})
  function logOut(){
    window.sessionStorage.removeItem('loginInfo')
    setOnLogin({})
  }
  return (
    <div className="container">
      <div className='login-div'>
        {
          onLogin!=""
          ? 
          <div>
            <ul className='header-menu'>
              <li>
                <p>{onLogin.memName}님 반갑습니다</p>
                <button type='button' onClick={(e)=>{logOut()}}>Log Out</button>
              </li>
            </ul>
          </div>
          :
          <div>
            <ul className='header-menu'>
              <li><span onClick={(e)=>{navigate('/login')}}>LOGIN</span></li>
              <li><span onClick={(e)=>{navigate('/join')}}>JOIN</span></li>
            </ul>
          </div>
        }
       
        <div className='banner'>
          <div>
            <img className='banner-img' src='http://localhost:8080/images/book_banner.PNG'/>
          </div>
          <div className='title-div'>BOOK SHOP</div>
        </div>
      </div>
      <div className='layout-div'>
        <Routes>
          {/* 유저페이지 */}
          <Route path='/' element={<UserLayout/>}>
            <Route path='' element={<div>상품목록화면</div>}/>
            <Route path='join' element={<Join/>}/>
            <Route path='login' element={<Login setOnLogin={setOnLogin} onLogin={onLogin}/>}/>
          </Route >
          
          {/* 관리자페이지 */}
          <Route path='/admin'element={<AdminLayout/>}>
            
          </Route>
        </Routes>
        
      </div>
    </div>
  )
}

export default App;
