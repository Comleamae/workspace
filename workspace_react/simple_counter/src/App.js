import logo from './logo.svg';
import './App.css';
import Viewer from './Viewer.js';
import { useState } from 'react';
import Controller from './Controller';

function App() {

  let [num, setNum] = useState (0)

  function changeNum(cNum){
    //console.log(cNum)
    const result = num + Number(cNum);
    console.log(result)
    setNum(result)
  }

  // num = 10; != setNum(10); 값이 변하는 것은 같지만 후자만 재랜더링을 통해 화면을 다시 출력해줌

  return (
    <div className="App">
      
      <h1>Simple Counter</h1>
      <Viewer num={num}/>
      <Controller changeNum={changeNum}/>
      
    </div>
  );
}



export default App;
