
import logo from './logo.svg';
import './App.css';
import './reset.css';
import { Route, Routes, useNavigate } from 'react-router-dom';
import ListAll from './ListAll';
import RegStu from './RegStu';
import DelStu from './DelStu';
import Score from './Score';
import ScoreReg from './ScoreReg';

function App() {
  const navigate = useNavigate()

  return (
    <div className="App">

      {/* 헤더 영역 */}
      <div className='menu'>
        <ul>
          <li>
            <span onClick={()=>{
            navigate('/stuAllList')
            }}>학생정보조회</span>
          </li>
          <li>
            <span  onClick={()=>{
            navigate('/stuReg')
            }}>학생등록</span>
          </li>
          <li>
            <span onClick={()=>{
            navigate('stuDel')
            }}>학생삭제</span>
          </li>
          <li>
            <span onClick={()=>{
            navigate('stuScore')
            }}>성적관리</span>
          </li>
        </ul>
      </div>

      {/* 컨텐츠 영역 */}
      <div className='content'>
        <Routes>
          {/* 학생정보조회 */}
          <Route path='/stuAllList' element={<ListAll/>}/>
          {/* 학생등록페이지 */}
          <Route path='/stuReg' element={<RegStu/>}/>
          {/* 학생삭제페이지 */}
          <Route path='/stuDel' element={<DelStu/>}/>
          {/* 성적관리페이지 */}
          <Route path='/stuScore' element={<Score/>}/>
          {/* 성적입력페이지 */}
          <Route path='/scoreForm' element={<ScoreReg/>}/>
        </Routes>
      </div>
    </div>
  );
}

export default App;
