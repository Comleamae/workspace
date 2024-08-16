
import { useEffect, useState } from 'react';
import './App.css';
import AdminLayout from './page/admin/AdminLayout';
import Join from './page/user/Join';
import Login from './page/user/Login';
import UserLayout from './page/user/UserLayout';
import './reset.css';
import { Route, Routes, useNavigate} from 'react-router-dom';
import RegItem from './page/admin/RegItem';
import List from './page/user/List';
import Detail from './page/user/Detail';
import MangeItem from './page/admin/MangeItem';
import MangeCategory from './page/admin/MangeCategory';
import MangeUser from './page/admin/MangeUser';
import MangeRecord from './page/admin/MangeRecord';
import SaleHistoryOfMonth from './page/admin/SaleHistoryOfMonth';
import SearchUser from './page/admin/SearchUser';
import Cart from './page/user/Cart';


//새로고침과 재랜더링은 다르다
//새로고침하면 state 변수의 값이 전부 초기화
//재랜더링 state 변수의 값은 보존된다
function App() {
  const navigate = useNavigate()

  //목차를 저장할 변수
  const[form, setForm] = useState(0)

  //로그인 정보를 저장할 수 있는 state변수--
  //모든 컴포넌트에서 사용해하기때문에 부모 컴포넌트인 App에 생성
  const[loginInfo, setLoginInfo] = useState({})
  
  //로그인 성공 시 loginInfo에 로그인 정보를 저장하지만
  //새로고침 하면 App.js 다시 시작하면서 loginInfo 변수의 값이 초기화
  //새로고침을 하더라도 sessionStorage에 로그인 정보는 존재한다
  //새로고침 할때 만약 로그인 정보가 sessionStorage에 남아있다면 
  //loginInfo state변수에 로그인 정보를 저장시켜야함

  //App.js가 mount(새로고침) 되면 실행
  useEffect(()=>{
    const sessionLoginInfo = window.sessionStorage.getItem('loginInfo')
    //세션에 로그인 정보가 있으면...
    if(sessionLoginInfo!=null){
      //1. 세션에서 가져온 데이터를 객체로 변환
      const obj_loginInfo= JSON.parse(sessionLoginInfo)

      //2. 로그인 정보를 loginInfo에 저장
      setLoginInfo(obj_loginInfo)
    }
  }, [])

  function logOut(){
    //세션에 저장된 로그인 정보 삭제
    window.sessionStorage.removeItem('loginInfo')
    //loginInfo state 변수의 값을 비워줌 -> 재랜더링
    setLoginInfo({})
    //상품 목록 페이지로 이동
    navigate('/')
  }

  //빈 객체인지 확인하는 코드
  //Object.keys() -> 객체 안의 모든 키 값을 가져옴
  //console.log(Object.keys(loginInfo.length))

  //장바구니 코드로 가는 코드
  function goCart(){
    navigate('/userCart')
    
  }
  return (
    <div className="container">
      <div className='login-div'>
        {
          Object.keys(loginInfo).length == 0
          ? 
          <div>
            <ul className='header-menu'>
              <li>
                <span onClick={(e)=>{navigate('/loginForm')}}>LOGIN</span>
              </li>
              <li>
                <span onClick={(e)=>{navigate('/join')}}>JOIN</span>
              </li>
            </ul>
          </div>
          :
          <div>
          <ul className='header-menu'>
            <li>
              {loginInfo.memId}님 환영합니다
            </li>
            <li>
              <button type='button' onClick={(e)=>{goCart(e)}}>장바구니</button>
            </li>
            <li>
              <span onClick={(e)=>{logOut()}}>Log Out</span>
            </li>
          </ul>
        </div>
        }
       
        <div className='banner'>
          <div>
            <img className='banner-img' src='http://localhost:8080/images/book_banner.PNG'/>
          </div>
          <div className='title-div'>BOOK SHOP</div>
        </div>
      </div>
      <div className='layout-div'>
        <Routes>
          {/* 유저페이지 */}
          <Route path='/' element={<UserLayout form={form} setForm={setForm}/>}>
            <Route path='list' element={<List form={form} setForm={setForm}/>}/>
            <Route path='join' element={<Join/>}/>
            <Route path='loginForm' element={<Login loginInfo={loginInfo} setLoginInfo={setLoginInfo}/>}/>
            <Route path='detail/:itemCode' element={<Detail/>}/>
            <Route path='userCart' element={<Cart/>}/>
          </Route >
          
          {/* 관리자페이지 */}
          <Route path='/admin'element={<AdminLayout/>}>
            {/* 상품 관련 화면 */}
            <Route path='mangeItem' element={<MangeItem/>}/>
            <Route path='regItem' element={<RegItem/>}/>
            <Route path='mangeCategory' element={<MangeCategory/>}/>
            {/* 구매 관련 화면 */}
            <Route path='mangeSale' element={<SaleHistoryOfMonth/>}/>
            {/* 유저 관련 화면 */}
            <Route path='mangeUser' element={<SearchUser/>}/>
            {/* 매출 관련 화면 */}
            <Route path='mangeRecord' element={<MangeRecord/>}/>

          </Route>
        </Routes>
        
      </div>
      {/* <Modal /> */}
    </div>
  )
}

export default App;
