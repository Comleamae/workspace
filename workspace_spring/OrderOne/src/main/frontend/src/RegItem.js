const RegItem = ()=>{
  return(
    <>
      <table>
        <tr>
          <td>상품명</td>
          <td>
            <input type="text"></input>
          </td>
        </tr>
        <tr>
          <td>상품가격</td>
          <td>
            <input type="text"></input>
          </td>
        </tr>
        <tr>
          <td>판매자</td>
          <td>
            <input type="text"></input>
          </td>
        </tr>
        <tr>
          <td>상품설명</td>
          <td>
            <textarea></textarea>
          </td>
        </tr>
      </table>
      <button type="button">등록</button>
    </>
  )
}
export default RegItem