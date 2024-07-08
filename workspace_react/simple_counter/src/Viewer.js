function Viewer(props){
  console.log(2)

  return (
    <div className='viewer'>
      <h3>현재카운터 </h3>
      <p>{props.num}</p>
    </div>
  );
}

export default Viewer;