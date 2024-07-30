import logo from './logo.svg';
import './App.css';
import './reset.css';
import { Route, Routes, useNavigate } from 'react-router-dom';
import Home from './page/Home';
import Mange from './page/Mange';
import Sales from './page/Sales';
import Regform from './page/Regform'


function App() {
  const navigate = useNavigate()
  return (
    <div className="App">
      <div className='menu'>
        <table>
          <thead>
            <tr>
              <td onClick={(e)=>{navigate('/')}}>홈</td>
              <td>
                <span onClick={(e)=>{navigate('/mange')}}>차량관리</span>
              </td>
              <td>
                <span onClick={(e)=>{navigate('/reg')}}>판매 정보 등록</span>
              </td>
              <td>
                <span onClick={(e)=>{navigate('/sales')}}>판매등록</span>
              </td>
            </tr>
          </thead>
        </table>
      </div>
      <div className='content'>
        <Routes>
          {/* 홈화면 */}
          <Route path='/' element={<Home/>}/>
          {/* 차량관리 */}
          <Route path='/mange' element={<Mange/>}/>
          {/* 판매정보등록 */}
          <Route path='/reg' element={<Regform/>}/>
          {/* 판매목록 */}
          <Route path='/sales' element={<Sales/>}/>
        </Routes>
      </div>
    </div>
  );
}

export default App;
