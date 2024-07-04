import logo from './logo.svg';
import './App.css';
import { useState } from 'react';

//App() 함수의 리턴문 안에 작성하는 코드가 화면에 나타남
//html 코드처럼 보이는 것은 실은 jsx 라는 문법이다
//그렇기 때문에 html과 조금 다른 부분이 있다. ex)className
function App() {
  const titles = ['울산 맛집', 'React 공부', 'goBackHome']

  //좋아요 갯수
  let cnt = 0;

  //대괄호의 첫번째 : 변수
  //대괄호의 두번째 :
  let [likeCnt, setLikeCnt] = useState(0)

  function test(){
    alert(1);
  }

  return (
    <div className="App">
      <div className="blog-nav">
        <h3>My Blog</h3>
      </div>

      <div className="list">
        <h4>
          {titles[0]}
          {/* 리액트에서 함수 호출시 {함수명}만 호출 하면 된다 */}
          <span onClick={() => {
            
            }}>👍</span>
          {cnt}
        </h4>
        <p>2024-07-04 작성</p>
      </div>
      <div className="list">
        <h4>{titles[1]}</h4>
        <p>2024-07-04 작성</p>
      </div>
      <div className="list">
        <h4>{titles[2]}</h4>
        <p>2024-07-04 작성</p>
      </div>
      
    </div>
  );
}





export default App;
