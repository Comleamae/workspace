function checkAllMenu(){
  const allChk = document.querySelector('#chk_all')

  const isChecked= allChk.checked

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


function checkAllOption(e){

  const isChecked = e.checked

  if(isChecked){
    const ulC = e.nextElementSibling
    const inputC = ulC.querySelectorAll('input')

    inputC.forEach(function(e, i){
    e.checked = true
  });
  }
  else{
    const ulC = e.nextElementSibling
    const inputC = ulC.querySelectorAll('input')

    inputC.forEach(function(e, i){
    e.checked = false
  });
  }
  
  
 
    
  
}