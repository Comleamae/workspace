function setTable(){
  //받아올 값
  let num1 = document.querySelector('#rowInput').value
  let num2 = document.querySelector('#colInput').value

  //생성할 영역
  let newTr = ''
  
  for(let i = 1; i<=num1; i++){
    newTr+=`<tr>`
    
    for(let j=1; j<num2; j++){
      newTr+=`<td>${i}행${j}열</td>`
    }
    newTr+=`</tr>`
  }
  
  //생성될 영역
  const newTableArea= document.querySelector('.table-div')
  newTableArea.innerHTML = '';
  
  const newTable = `<table>${newTr}</table>`
  newTableArea.insertAdjacentHTML('beforeend', newTable); 
  
}