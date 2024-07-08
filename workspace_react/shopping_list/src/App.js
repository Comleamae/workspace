import logo from './logo.svg';
import './App.css';
import { useState } from 'react';

import Add from './Add';
import List from './List';

function App() {
  //장보기 목록
  const [list, setList] = useState(['계란 한판', '생수', '불고기용 돼지고기'])
  //배열 추가 삭제
  //.push(4)
  //리스트이 1번째 요소부터 2개 삭제
  //.splice(1, 2)
  //리스의 0번째 요소부터 1개 삭제
  //.splice(0, 1)

  return (
    <div className="App">

      <h1>Shopping List</h1>

      <List list={list} setList={setList}/>

      <Add list={list} setList={setList}/>
     
    </div>
  );
}

export default App;
