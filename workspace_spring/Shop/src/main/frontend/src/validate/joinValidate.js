//valid_tag[0]:memId
//valid_tag[1]:memPw
//valid_tag[2]:confirmPw
//valid_tag[3]:memName
//valid_tag[4]:memTel

 // 유효성 검사 결과를 저장할 변수
 let resultArr = [
  false //아이디
  , false //비번
  , false //이름
  , false //연락처
]

let result_pw1 = false
let result_pw2 = false

export const joinValidate = (tagName, newData, valid_tag) => {
   
     // 유효성 결과 메시지를 띄우는 함수
     function sendFeedbackmsg(feedbackTag, type, msg){
      feedbackTag.current.className = `feedback ${type}`
      feedbackTag.current.textContent = msg
    }
    // id 값을 변경했으면 id 피드백만 띄움
    switch(tagName){
      case'memId':
        //1) 아이디 유효성 검사 id가 영문만 포함 + 4~12자리인지 검사하는 정규식
        //test():매개변수로 들어온 데이터가 조건에 부합하면 리턴 true
        const regex_memId = /^[a-z|A-Z]{4,12}$/
          if(regex_memId.test(newData.memId)){
            sendFeedbackmsg(valid_tag[0], 'good', '사용 가능한 아이디입니다')
            resultArr[0] = true
            }
          else{
            sendFeedbackmsg(valid_tag[0], 'error', '사용 불가능한 아이디입니다')
            resultArr[0] = false
          }
        break;
      // pw 값을 변경했으면 pw 피드백만 띄움 confirm도함
      case'memPw':
      case 'confirmPw':
        // 비밀번호 형식이 4~12글자, 영문 소문자+숫자
        const regex_memPw =/^(?=.*[a-z])(?=.*[0-9]).{4,12}$/


        if(regex_memPw.test(newData.memPw)){
          sendFeedbackmsg(valid_tag[1], 'good', '사용 가능한 비밀번호입니다')
          result_pw1 = true
        }
        else{
          sendFeedbackmsg(valid_tag[1], 'error', '사용 불가능한 비밀번호입니다')
          result_pw1 = false
        }
        
        // 비밀번호가 일치하지 않으면
        if(newData.memPw!=newData.confirmPw){
          sendFeedbackmsg(valid_tag[2], 'error', '비밀번호가 일치하지 않습니다')
          result_pw2 = false
        }
        else{
          sendFeedbackmsg(valid_tag[2], 'good', '비밀번호가 일치합니다')
          result_pw2 = true
        }

        resultArr[1] = result_pw1&&result_pw2?true:false

        break;
        
      case'memName':
        //2) 이름값 유효성 검사
         // name가 한글만 2~10 name 값을 변경했으면 name 피드백만 띄움
        const regex_memName =/^[ㄱ-ㅎ|가-힣]{2,10}$/
          if(regex_memName.test(newData.memName)){
          sendFeedbackmsg(valid_tag[3], 'good', '사용 가능한 이름입니다')
          resultArr[2] = true
         }
          else{
          sendFeedbackmsg(valid_tag[3], 'error', '사용 불가능한 이름입니다')
          resultArr[2] = false
        }
        break;
        // tel 값을 변경했으면 tel 피드백만 띄움
      case'memTel':
      //연락처 정규식
      const regex_memTel = /^\d{2,3}-\d{3,4}-\d{4}$/;
        if(regex_memTel.test(newData.memTel)){
          sendFeedbackmsg(valid_tag[4], 'good', '유효한 연락처입니다')
          resultArr[3] = true
        }
        else{
          sendFeedbackmsg(valid_tag[4], 'error', '연락처를 확인하세요')
          resultArr[3] = false
        }
        break;
    }
  //resultArr의 모든 데이터가 true일때 리턴 true
  //배열에 매개변수로 전달된 데이터가 존재하면 true 리턴함
  
  //return !resultArr.includes(false) 

  for(const e of resultArr){//true true false true
    if(!e){
      return false
    }
  }
  return true //위와 같은 코드임
}
