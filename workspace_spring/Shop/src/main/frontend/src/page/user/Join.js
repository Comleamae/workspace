import React, { useRef, useState } from 'react'
import './Join.css'
import axios from 'axios'
import { useNavigate } from 'react-router-dom'
import { useDaumPostcodePopup } from 'react-daum-postcode'
import Modal from '../../common/Modal'

const Join = () => {
  //setTimeOut(): 화살표 함수로 채워 시간을 조절할수있다
  
  // 태그를 참조하는 변수
  const email_1 = useRef()
  const email_2 = useRef()
  const [isShow, setIsShow] = useState(false)
  const [onConfirm, setConfirm] = useState(true);
  const navigate = useNavigate()
  // 등록할 데이터를 담을 변수
  const[joinData, setJoinData]=useState({
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

  // 입력받은 값을 실시간으로 바꿔줄 기능
  function changeJoinData(e){
    setJoinData({
      ...joinData,
      [e.target.name]:e.target.name!='memEmail'
      ? e.target.value
      : email_1.current.value+email_2.current.value
    })
  }
  // 아이디 중복확인 기능
  function confirmId(){
    axios
    .get(`/api_member/one/${joinData.memId}`)
    .then((res)=>{
      alert(res.data.memId==joinData.memId?'중복된 아이디입니다':'사용한 가능한 아이디입니다')
      setConfirm(false)
    })
    .catch((error)=>{
      console.log(error)
    }, [])
  }
  // 회원가입 버튼 클릭 시 insert 쿼리 실행하러 가기
  function join(){
    if(onConfirm){
      alert('아이디 중복 확인 필요')
      return
    }
    if(joinData.memPw==''||joinData.memId==''||joinData.memName==''){
      alert('필수 입력 사항이 공백입니다')
      return
    }
    if(joinData.confirmPw!=joinData.memPw){
      alert('비밀번호가 다릅니다')
      return
    }
    axios
    .post('/api_member/join', joinData)
    .then((res)=>{
      //state변수의 값을 바꿔 모달창 띄움
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
  return (
    <div className='join-div'>
      <div>
        <table className='join-table'>
          <tbody>
            <tr>
              <td>아이디</td>
              <td>
               <div className='inline-input'>
                  <input type='text' name='memId' className='form-control' onChange={(e)=>{changeJoinData(e)}}/>
                  <button type='button' className='btn btn-primary' onClick={(e)=>{confirmId()}}>중복확인</button>
               </div>
              </td>
            </tr>
            <tr>
              <td>비밀번호</td>
              <td>
                <input type='password' className='form-control' name='memPw' onChange={(e)=>{changeJoinData(e)}}/>
              </td>
            </tr>
            <tr>
              <td>비밀번호 확인</td>
              <td>
                <input type='password' className='form-control' name='confirmPw' onChange={(e)=>{changeJoinData(e)}}/>
              </td>
            </tr>
            <tr>
              <td>이름</td>
              <td>
                <input type='text' className='form-control' name='memName' onChange={(e)=>{changeJoinData(e)}}/>
              </td>
            </tr>
            <tr>
              <td>연락처</td>
              <td>
                <input type='text' placeholder='숫자만 입력하세요' name='memTel' className='form-control' onChange={(e)=>{changeJoinData(e)}}/>
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
        isShow?<Modal navigate={navigate} content={setModalContent} setIsShow={setIsShow}/>:null
      }
    </div>
  )
}

export default Join
