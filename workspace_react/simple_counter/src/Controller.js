function Controller(props){
  console.log(2);

  // [1,3].forEach(function(e,i){}) 일반 함수

  // [1,3].forEach((e,i)=>{}) 화살표 함수


  return (
    <div className='controller'>
    <button type='button' value='-10' onClick={(e)=>{
      props.changeNum(e.target.value)
    }}>-10</button>
    <button type='button' value='-1' onClick={(e)=>{
      props.changeNum(e.target.value)
    }}>-1</button>
    <button type='button' value='+1' onClick={(e)=>{
      props.changeNum(e.target.value)
    }}>+1</button>
    <button type='button' value='+10' onClick={(e)=>{
      props.changeNum(e.target.value)
    }}>+10</button>
  </div>

  );
}

export default Controller;