import React, { useRef, useState } from 'react'
import './Join.css'
import axios from 'axios'
import { useNavigate } from 'react-router-dom'
import { useDaumPostcodePopup } from 'react-daum-postcode'
import Modal from '../../common/Modal'
import {joinValidate} from '../../validate/joinValidate'

const Join = () => {
  //setTimeOut(): 화살표 함수로 채워 시간을 조절할수있다
  
  // 태그를 참조하는 변수
  const email_1 = useRef()
  const email_2 = useRef()
  const [isShow, setIsShow] = useState(false)
  const [isCheckId, setIsCheckId] = useState(false);
  const navigate = useNavigate()
  // 등록할 데이터를 담을 변수
  const[joinData, setJoinData]= useState({
    memId:''
    , memPw:''
    , confirmPw:''
    , memName:''
    , memTel:''
    , post:''
    , memAddr:''
    , addrDetail:''
    , memEmail:''
  })
  // daum 주소 api 팝업창을 띄우기 위한 함수 선언
  const open = useDaumPostcodePopup()

  //주소 검색 팝업창이 닫힐 때 실행되는 기능
  function handleComplete(data){
    setJoinData({
      ...joinData,
      post:data.zonecode,
      memAddr:data.roadAddress
    })
  }

  //검색 버튼 클릭 시 실행되는 함수
  function handleClick(){
    open({onComplete:handleComplete})
  }
  //태그를 참조할 수 있는 ref로 만든 배열에 변수저장 만들어
  //1) 각자 선언하고 하나의 배열에 넣어 사용
  const memId_valid_tag = useRef()
  const memName_valid_tag = useRef()
  const memTel_valid_tag = useRef()
  const memPw_valid_tag = useRef()
  const confirmPw_valid_tag = useRef()

  const valid_tag = [
    memId_valid_tag
    , memPw_valid_tag
    , confirmPw_valid_tag
    , memName_valid_tag
    , memTel_valid_tag
  ]

  // 유효성 검사 결과를 저장하는 변수
  const [valid_result, setValidResult] = useState(false);

  // 입력받은 값을 실시간으로 바꿔줄 기능
  function changeJoinData(e){
    // 입력한 데이터를 먼저 가져옴
    const newData = {
      ...joinData,
      [e.target.name]:e.target.name!='memEmail'
                                      ? e.target.value
                                      : email_1.current.value+email_2.current.value
    }
    //입력한 데이터에 대한 validation(유효성) 처리
    //validation 처리:모든 데이터가 유효한 데이면 리턴 true
    const result = joinValidate(e.target.name, newData, valid_tag)
    setValidResult(result)

    // 유효성 검사가 끝난 데이터를 joinData에 저장
    setJoinData(newData)
   
  }
  // 아이디 중복확인 기능
  function isEnableId(){
    if(joinData.memId==''){
      return;
    }
    axios
    .get(`/api_member/isEnableId/${joinData.memId}`)
    .then((res)=>{
      if(res.data){
        alert('사용 가능한 아이디입니다')
        setIsCheckId(true)
      }
      else{
        alert('중복된 아이디입니다')
        setIsCheckId(false)
      }
    })
    .catch((error)=>{
      console.log(error)
    }, [])
  }
  // 회원가입 버튼 클릭 시 insert 쿼리 실행하러 가기
  function join(){
    
    //유효성 검사 결과가 false면 회원가입 로직 중지
    if(!valid_result){
      alert('입력 데이터를 확인하세요')
      return
    }
    //아이디 중복검사 했는지 확인
    if(!isCheckId){
      alert('아이디 중복 확인 필요')
      return
    }
    axios
    .post('/api_member/join', joinData)
    .then((res)=>{
      //state변수의 값을 바꿔 모달창 띄움->띄워진 모달창에서 닫기 누르면 로그인 페이지 이동
      setIsShow(true)
    })
    .catch((error)=>{}, [])
  }
  //모달창 안의 내용을 생성하는 함수
  function setModalContent(){
    return(
      <div>회원가입축하</div>
    )
  }

  //모달창을 닫으면 실행되는 함수
  function onclickModalBtn(){
    navigate('/loginForm')
  }
  return (
    <div className='join-div'>
      <div>
        <table className='join-table'>
          <tbody>
            <tr>
              <td>아이디</td>
              <td>
               <div className='inline-input'>
                  <input type='text' name='memId' className='form-control' onChange={(e)=>{
                    changeJoinData(e);
                    setIsCheckId(false);
                  }}/>
                  <button type='button' className='btn btn-primary' onClick={(e)=>{isEnableId()}}>중복확인</button>
               </div>
               <div className='feedback' ref={memId_valid_tag}></div>
              </td>
            </tr>
            
            <tr>
              <td>비밀번호</td>
              <td>
                <input type='password' className='form-control' name='memPw' onChange={(e)=>{changeJoinData(e)}}/>
                <div className='feedback' ref={memPw_valid_tag}></div>
              </td>
            </tr>
            <tr>
              <td>비밀번호 확인</td>
              <td>
                <input type='password' className='form-control' name='confirmPw' onChange={(e)=>{changeJoinData(e)}}/>
                <div className='feedback' ref={confirmPw_valid_tag}></div>
              </td>
            </tr>
            <tr>
              <td>이름</td>
              <td>
                <input type='text' className='form-control' name='memName' onChange={(e)=>{changeJoinData(e)}}/>
                <div className='feedback' ref={memName_valid_tag}></div>
              </td>
            </tr>
            <tr>
              <td>연락처</td>
              <td>
                <input type='text' placeholder='숫자만 입력하세요' name='memTel' className='form-control' onChange={(e)=>{changeJoinData(e)}}/>
                <div className='feedback' ref={memTel_valid_tag}></div>
              </td>
            </tr>
            <tr>
              <td>주소</td>
              <td>
                <div className='inline-input'>
                  <input value={joinData.post} readOnly={true} type='text' placeholder='우편번호' className='form-control' name='post' onChange={(e)=>     {changeJoinData(e)}} onClick={(e)=>{handleClick()}}/>
                  <button type='button' className='btn btn-primary' onClick={(e)=>{handleClick()}}>검색</button>
                </div>
              </td>
            </tr>
            <tr>
              <td></td>
              <td>
                <input value={joinData.memAddr} readOnly={true} type='text' placeholder='주소' className='form-control' name='memAddr' onClick={(e)=>{handleClick()}} onChange={(e)=>{changeJoinData(e)}}/>
              </td>
            </tr>
            <tr>
              <td></td>
              <td>
                <input type='text' placeholder='상세주소' className='form-control' name='addrDetail' onChange={(e)=>{changeJoinData(e)}}/>
              </td>
            </tr>
            <tr>
              <td>이메일</td>
              <td>
                <div className='inline-select'>
                  <input type='text' ref={email_1} className='form-control' name='memEamil' onChange={(e)=>{changeJoinData(e)}}/>
                  <select ref={email_2} className='form-control' name='memEmail' onChange={(e)=>{changeJoinData(e)}}>
                    <option value={'@naver.com'}>naver.com</option>
                    <option value={'@gmail.com'}>gmail.com</option>
                  </select>
                </div>
              </td>
            </tr>
          </tbody>
        </table>
      </div>
      <div className='btn-div'>
        <button type='button' className='btn btn-primary' onClick={(e)=>{join()}}>회원가입</button>
      </div>
      {/* 회원가입 성공 시 열리는 모달 */}
      {
        isShow
        ?
        <Modal clickCloseBtn={onclickModalBtn} 
                content={setModalContent} 
                setIsShow={setIsShow}/>
        :null
      }
    </div>
  )
}

export default Join
