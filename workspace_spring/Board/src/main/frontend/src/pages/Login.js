import axios from "axios"
import { useState } from "react"
import { json, useNavigate } from "react-router-dom"
import './Login.css'
import * as memberApi from '../apis/memberApi'

//리액트는 화면을 새로고침 할 때마다 데이터가 초기화 되기 때문에
// 로그인을 했다는 정보를 일반적인 방식으로 저장해도 새로고침하면 로그인이 풀려버린다.

//새로고침 해도 정보가 사라지는 않는 저장 공간을 두 개 제공.
//이 두 개의 저장 공간은 client pc에 존재.?
//문자열 데이터만 저장 가능

//localStorage : 
// 여기에 저장되는 데이터는 직접 삭제하지 않는 한 반영구적으로 보전.
// 인터넷 끊겨도, 컴퓨터를 재부팅해도 데이터가 살아있음.
// 브라우저에 다른 탭끼리도 데이터가 공유

//sessionStorage
// 여기에 저장되는 데이터는 인터넷(브라우저)을 종료하면 자동으로 사라짐
// 브라우저의 탭이 달라도 데이터 공유가 안 됨.

//사용법
//데이터 저장 : window.sessionStorage.setItem(key, value);
//데이터 읽기 : window.sessionStorage.getItem(key);
//데이터 삭제 : window.sessionStorage.removeItem(key);
//전체 데이터 삭제 : window.sessionStorage.clear();

const Login = ({setOnLogin})=>{
  //sessionStorage에 데이터 입력 
  //sessionStorage는 문자열만 입력가능->문자열 변환(json)
  window.sessionStorage.setItem('name', 'kim');
  window.sessionStorage.setItem('age', 20);

  const m = {
    stuNum : 1,
    stuName : 'kim',
    score : 80
  };

  //객체 -> json으로 변환(객체를 문자로 변환)
  //JSON.stringify();
  //json -> 객체
  //JSON.parse();
  window.sessionStorage.setItem('member', JSON.stringify(m));

  const data = window.sessionStorage.getItem('member');
  console.log(data);
  //json 데이터를 가져오면 문자로 인식한다!!
  console.log(data.stuNum);

  const result = JSON.parse(data);
  console.log(result)

  //객체나 배열을 Starage에 저장할 때 json 형태로 저장 할 수 있음.
  //json(javascript object notation) -> 자바스크립트의 객체를 문자화 시킷 것!
  // {name : 'kim', age : 20} ->  "{name : 'kim', age : 20}"
  //모든 언어에서 공통으로 해석할 수 있는 자료형
  
  //sessionStorage에서 데이터 읽기
  console.log(window.sessionStorage.getItem('name'));

  const navigate = useNavigate()
  const [loginMem, setLoginMem] = useState({
    memId:''
    , memPw:''
  })
 
  const goLogin = ()=>{
    //id, pw 입력했는지 유효성 검사
    memberApi.loginChk(loginMem)
    .then((res)=>{
      //조회결과에 따라 로그인 실행
      //조회결과가 있으면 로그인 처리!
      //조회결과가 없으면 다시 로그인 할 수 있도록 처리
      if(res.data != ''){
        alert('로그인 성공');
        //sessionStorage에 로그인한 사람의 아이디, 이름, 권한을 저장
        const loginInfo = {
          memId : res.data.memId
          , memName : res.data.memName
          , memRole : res.data.memRole
        }
        // const [memId, memName, memRole] = res.data
        window.sessionStorage.setItem('loginInfo', JSON.stringify(loginInfo))
        setOnLogin(loginInfo)
        navigate('/main')
      }
      else{
        alert('ID 혹은 PW 확인!');
      }
    })
    .catch((error)=>{
      alert('전달 실패')
      console.log(error)
    }, []) 
  }
  
  function changeOne(e){
    setLoginMem({...loginMem,
      [e.target.name] : e.target.value
    })
  }
  return(
    <div className="login-div">
      <div>
        아이디
        <input type="text" name="memId" placeholder="input ID" onChange={(e)=>{changeOne(e)}}/>
      </div>
      <div>
        비밀번호
        <input type="text" name="memPw"  placeholder="input PW" onChange={(e)=>{changeOne(e)}}/>
      </div>
      <input type="button" className="btn" value="로그인" onClick={(e)=>{goLogin()}}/>      
      <button type="button" onClick={()=>{navigate('/main')}}>목록가기</button>
    </div>
  )
}
export default Login