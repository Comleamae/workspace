import logo from './logo.svg';
import './App.css';
import data from './data';
import ListMain from './ListMain';
import Detail from './Detail';
import Form from './Form';
import { Route, Routes, useNavigate } from 'react-router-dom';
import { useState } from 'react';
import InputTest from './InputTest';



function App() {
  //게시글 목록
  const [boardList, setBoardList] = useState(data)

  return (
    <div className="App">

      <Routes>
        {/* 게시글 목록페이지 */}
        <Route path='/' element={<ListMain board_list={boardList}/>}></Route>

        {/* 게시글 상세 정보 페이지 */}
        <Route path='/detail/:boardNum' element={<Detail board_list={boardList} setBoard_List={setBoardList}/>}></Route>

        {/* 게시글 등록페이지 */}
        <Route path='/writeForm' element={<Form board_list={boardList} setBoard_List={setBoardList}/>}></Route>

        <Route path='/test' element={<InputTest/>}></Route>
      </Routes>
    </div>
  );
}

export default App;
