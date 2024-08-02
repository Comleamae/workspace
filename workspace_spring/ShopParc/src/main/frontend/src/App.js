import './reset.css';
import './App.css';
import { Route, Routes, useNavigate } from 'react-router-dom';
import UserLayout from './pages/user/UserLayout';
import AdiminLayout from './pages/admin/AdiminLayout';
import Join from './pages/user/Join';
import Login from './pages/user/Login';

function App() {
  const navigate = useNavigate()
  return (
    <div className="container">
      <div className='login-div'>
        <div className='status'>
          <span onClick={(e)=>{navigate('/login')}}>Login</span>
          <span onClick={(e)=>{navigate('/join')}}>Join</span>
        </div>
      </div>
      <div className='layout-div'>
        <Routes>
          {/* 일반 유저용 */}
          <Route path='/' element={<UserLayout/>}>
            {/* 상품 목록 화면 */}
            <Route path='' element={<div>상품목록화면</div>}/>
            <Route path='join' element={<Join/>}/>
            <Route path='login' element={<Login/>}/>
          </Route>

          {/* 관리자용 */}
          <Route path='/admin' element={<AdiminLayout/>}>
            <Route path='test1' element={<div>상품 등록 페이지</div>}/>
            <Route path='test2' element={<div>상품 삭제 페이지</div>}/>
          </Route>
        </Routes>
      </div>
    </div>
  );
}
export default App;
