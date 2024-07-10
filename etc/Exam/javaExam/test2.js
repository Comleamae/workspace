
function setAvgAge(){
  //값이 든 태그를 선택해서 값을 받아옴
  const totalAgeSelect = document.querySelectorAll('.ageTd')
  let totalAge = 0;
  let avgAge = 0;
  let index =0;
  totalAgeSelect.forEach(function(tdAge, i){
    totalAge = totalAge + Number(tdAge.textContent)
    index=index+i
  })
  avgAge = totalAge/index
  console.log(avgAge)
  
  //값이 들어갈 태그 선택
  const result= document.querySelector('#resultTd')
  result.innerHTML = avgAge
}