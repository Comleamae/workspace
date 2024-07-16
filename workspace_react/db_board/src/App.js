import logo from './logo.svg';
import './App.css';
import { Route, Routes, useNavigate } from 'react-router-dom';
import BoardList from './BoardList';
import Detail from './Detail';
import AxiosTest from './AxiosTest';
import RegBoardForm from './RegBoardForm';

function App() {
  
  return (
    <div className="App">
      <Routes>
        {/* axios 예제 페이지 */}
        <Route path='/axios' element={<AxiosTest/>}/>

        {/* 게시글 목록 페이지 */}
        <Route path='/' element={<BoardList/>}/>

        {/* 게시글 상세보기 페이지 */}
        <Route path='/detail/:boardNum' element={<Detail/>}/>
        
        {/* 게시글 등록 폼 페이지 */}
        <Route path='/regBoardForm' element={<RegBoardForm/>}/>
      </Routes>
    </div>
  );
}

export default App;
