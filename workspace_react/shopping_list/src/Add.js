import { useState } from "react"

function Add(props){
  //input 태그의 데이터를 저장할 변수
   let [text, setText] = useState('');

  return(
    <div className="box">
      {/* onChange={()=>{}} 안의 내용이 바뀔때마다 */}
      <input type="text" onChange={(e)=>{
        setText(e.target.value)
      }}></input>

      <button type="button" onClick={(e)=>{
        //const cList = [...props.list]
        //input 태그에 입력한 내용을 가져온다
        //가져온 내용을 list에 추가한다
        // cList.push(text);
        props.list.push(text)
        
        //변경된 list의 내용으로 setList함수 호출
        // props.setList([cList])
        props.setList([...props.list])
      }}>추가</button>
    </div>
    )
  }

export default Add