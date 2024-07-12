import { useState } from "react"

 const InputTest = ()=>{
  //input 태그에 입력한 내용을 저장하는 변수
  //구조분해할당
  //1)const inpuData ='' 
  //2)setInputData('jav') //inpuData 변수의 값을 'java'로 변경
  //2번은 1번에 대한 setter 2번은 실행 후 재랜더링
  //1)
  const [inputData, setInputData] = useState('')
  const [inputData2, setInputData2] = useState('')

  const [stu, setStu] = useState({
    stuName :'',
    age: 0,
    score: 0,
    addr:''
  })

  function changeStu(e){
    setStu({
      ...stu,
      [e.target.name] : e.target.value
    })
  }
  return(
    <>
            <div>
              이름: <input type='text' onChange={(e)=>{
                //e.target = 이벤트가 발생하고 있는 태그

                setInputData(e.target.value)
              }}/> <br />

              나이 : <input type='text' onChange={(e)=>{
                setInputData2(e.target.value)
              }}/>
            </div> 
      
            <div>
              학생명 : <input type='text' name='stuName' onChange={(e)=>{
              changeStu(e)
              }}/><br/>
              나이 : <input type='text' name='age' onChange={(e)=>{
                changeStu(e)
              }}/><br/>
              점수 : <input type='text' name='score' onChange={(e)=>{
                changeStu(e)
              }}/><br/>
              주소 : <input type='text' name='addr' onChange={(e)=>{
                changeStu(e)
              }}/><br/>
            </div>

            <div>
              이름: {stu.stuName} <br/>
              나이: {stu.age} <br/>
              점수: {stu.score} <br/>
              주소: {stu.addr} <br/>
            </div>
    </>
  )
 }

 export default InputTest;
 
 