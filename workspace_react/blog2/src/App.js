import logo from './logo.svg';
import './App.css';
import { useState } from 'react';
import Board from './Board';
import Detail from './Detail';
import Insert from './Insert';

function App() {
  

  
  const [titles, setTitles] = useState(['울산 맛집', 'React 공부', 'goBackHome'])
  

  
  let [likeCnts, setCnts] = useState([0, 1, 2])

 
  let [isShow, setIsShow] = useState(false)
 

  function test(){
    alert(1);
  }

  
  [1,2,3].map((e, i)=>{
    
    return 123;
  })

  return (
    <div className="App">
      <div className="blog-nav">
        <h3>My Blog</h3>
      </div>
      <Board titles={titles} setTitles={setTitles} likeCnts={likeCnts} setCnts={setCnts}/>
      <Insert titles={titles} likeCnts={likeCnts} setCnts={setCnts}/>
      {
        isShow ? <Detail/>: null
      }
    </div>
  );
}

export default App;
