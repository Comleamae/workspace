function Board(props){
  return(
      <div className="list">
        <h4>
        {props.titles}
        {/* 리액트에서 함수 호출시 {함수명}만 호출 하면 된다 */}
        <span>👍</span>
        0
        </h4>
        <p>2024-07-04 작성</p>
      </div>
  )
}
export default Board