function setTable(){
  //받아올 값
  const num1 = document.querySelector('#rowInput').value
  const num2 = document.querySelector('#colInput').value

  //생성할 영역
  let newTr = ``
  
  for(let i=1; i<=num1; i++){
    // newTr=`newTr+<tr>`
    newTr+=`<tr>`
  
      for(let j=1; j<=num2; j++){
        newTr+=`<td>${i}행${j}열</td>`
      }

    newTr+=`</tr>`
  }
  
  //생성될 영역
  const newTableArea= document.querySelector('.table-div')
  newTableArea.innerHTML = '';//태그까지 전부 ''로 대체
  //newTableArea.textContent ='' //글자만 전부 ''로 대체 태그는 남음  
  const newTable = `<table>${newTr}</table>`
  newTableArea.insertAdjacentHTML('beforeend', newTable); 
  
}