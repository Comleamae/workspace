function Detail(){
  return (
    //가상 태그=>출력시 빈값으로 나옴 두개 이상의 태그가 필요할 경우에 임시로 차상위 태그로 만들어 콤포넌트 선언
    <> 
      <div className='detail'>
        <h4>제목</h4>
        <p>날짜</p>
        <p>상세내용</p>
      </div>
    </>
    
  );
}
export default Detail;