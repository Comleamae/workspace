import logo from './logo.svg';
import './App.css';
import { Route, Routes, useNavigate } from 'react-router-dom';
import ItemInfo from './ItemInfo';
import RegItem from './RegItem';

function App() {
  const navigate = useNavigate()
  return (
    <div className="App">
      <div className='header'>
        <ul>
          <li>
            <span onClick={()=>{
              navigate('/main')
            }}>상품정보</span>
          </li>
          <li>
            <span onClick={()=>{
              navigate('/regItem')
            }}>상품등록</span>
          </li>
          <li>
            <span onClick={()=>{
              navigate('/orderItem')
            }}>주문하기</span>
          </li>
          <li>
            <span onClick={()=>{
              navigate('/orderList')
            }}>주문목록</span>
          </li>
        </ul>
      </div>
      <div className='content'>
        <Routes>
          {/* 상품정보 */}
          <Route path='/main' element={<ItemInfo/>}/>
          {/* 상품등록 */}
          <Route path='/regItem' element={<RegItem/>}/>
          {/* 상품주문 */}
          <Route path='/orderItem' element={<ItemInfo/>}/>
          {/* 주문목록*/}
          <Route path='/orderList' element={<ItemInfo/>}/>
        </Routes>
      </div>
    </div>
  );
}

export default App;
