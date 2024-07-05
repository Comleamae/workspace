import logo from './logo.svg';
import './App.css';
import { useState } from 'react';

function App() {

  const board_list = [
   {  boardNum:1,
      title:'첫번째 게시글',
      content:'첫번째 내용',
      writer:'김자바'
   },
   {  boardNum:2,
      title:'두번째 게시글',
      content:'두번째 내용',
      writer:'이자바'
   },
   {  boardNum:3,
      title:'세번째 게시글',
      content:'세번째 내용',
      writer:'박자바'
   } 
  ];


  let [isShow, setIsShow] = useState(false);

  return (
    <div className="App">
     <div className='container'>
        <table border={1}>
         <thead>
            <tr>
              <td>글번호</td>
              <td>제목</td>
              <td>작성자</td>
            </tr>
         </thead>
         <tbody>
          {
            board_list.map((board, i)=>{
              return(
                <tr key={i}>
                  <td>{board.boardNum}</td>
                  <td onClick={}>{board.title}</td>
                  <td>{board.writer}</td>
                </tr>
              )
            })
          }
         </tbody>
        </table>
  
     </div>

      {
       isShow ? <Detail/> : null
      }
    </div>
  )

 
}



function Detail(props){
  return(
    <div>
      글번호:{props.board.boardNum}
      제목:{props.title}
      내용:{props.content}
      작성자:{props.writer}
    </div>
  )
}


export default App;
