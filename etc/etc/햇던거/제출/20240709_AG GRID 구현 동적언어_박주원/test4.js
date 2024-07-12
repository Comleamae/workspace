// 전체 선택/해제
function checkAllMenu(){
  const allChk = document.querySelector('#chk_all')
  // 전체 체크박스의 체크 여부
  const isChecked= allChk.checked
  // 모든 체크박스
  const menuChks = document.querySelectorAll('input')
  

  

  if(isChecked){
    for(const menuChk of menuChks){
      menuChk.checked = true;
    }
    
  }

  else{
    for(const menuChk of menuChks){
      menuChk.checked = false;
    }
  }

}
const checkAllOption = (cBox)=>{
              // 다음 형제 노드
  const ulC = cBox.nextElementSibling
  const inputC = ulC.querySelectorAll('input')

  if(cBox.checked){
    for(const input of inputC){
      input.checked=true
    }

  }
  else{
    for(const input of inputC){
      input.checked=false
    }

  }
}

// function checkAllOption(e){

//   const isChecked = e.checked

//   if(isChecked){
//     const ulC = e.nextElementSibling
//     const inputC = ulC.querySelectorAll('input')

//     inputC.forEach(function(e, i){
//     e.checked = true
//   });
//   }
//   else{
//     const ulC = e.nextElementSibling
//     const inputC = ulC.querySelectorAll('input')

//     inputC.forEach(function(e, i){
//     e.checked = false
//   });
//   }
  
  
 
    
  
// }