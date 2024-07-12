import logo from './logo.svg';
import './App.css';
import data from './data';
import Item from './Item';
import { Link, Route, Routes } from 'react-router-dom';
import Detail from './Detail';
import Book from './Book';


function App() {
  //상품 목록 데이터
  const item_list = data
  

  return (
    <div className="App">
     <div className='header'>
      Book Shop
      <Link to='/list'>상품목록</Link>
      <Link to={'/detail'} >상품상세</Link>
     </div>
     <div className='banner'>
                {/* public 폴더에 있는 파일을 불러오기위한 */}
      <img src={process.env.PUBLIC_URL + '/header.jpg'}/>
     </div>
    {/* 이동할 수 있는 페이지의 url들 */}
    <Routes>
      <Route path = '/' element = {<div>메인페이지</div>}/>
      <Route path = '/detail/:id' element = {<Detail item_list={item_list}/>}/>
      <Route path= '/list' element = {<Item item_list={item_list}/>}/>
      <Route path = '*' element = {<div>잘못된 페이지입니다</div>}/>
    </Routes>

     {/* <Item item_list={item_list}/> */}

     
    </div>
  );
}



export default App;
