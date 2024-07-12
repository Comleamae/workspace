const StuList = () => {
  return(
    <>
      <div className="menu">
        <ul>
          <li>
            학생정보조회
          </li>
          <li>
            학생등록
          </li>
          <li>
            학생삭제
          </li>
          <li>
            성적관리
          </li>
        </ul>
      </div>

      <div className="stuList">
        <table>
          <thead>
            <tr>
              <td>No</td>
              <td>학생명</td>
              <td>국어점수</td>
              <td>영어점수</td>
              <td>수학점수</td>
              <td>평균</td>
            </tr>
          </thead>
          <tbody>
            
          </tbody>
        </table>
      </div>
      
    </>
  )

}
export default StuList