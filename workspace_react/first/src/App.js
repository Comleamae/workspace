import logo from './logo.svg';
import './App.css';

function App() {
  return (
    // jsx-> html이 아님!
    // html에서 사용한 문법이 작동하지 않음
    <div className="App">
      {/* 함수의 태그화 */}
      <MyTable></MyTable>
    </div>
  );
}

//컴포넌트
function MyTable(){
  return(
    <table border="1">
      <tr>
        <td>이름</td>
        <td>나이</td>
      </tr>
     </table>
  );
}

export default App;
