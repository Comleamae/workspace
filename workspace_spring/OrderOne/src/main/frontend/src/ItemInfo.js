import axios from "axios"
import { useEffect } from "react"

const ItemInfo = () =>{

  const [item, setItem] =

  useEffect(()=>{
    axios
    .get('')
    .then((res)=>{})
    .catch((error)=>{})
  })

  return(
    <>
      <h4> 총 ?개의 상품이가 등록되었습니다 </h4>
      <table>
        <thead>
          <tr>
            <td>NO</td>
            <td>상품명</td>
            <td>상품가격</td>
            <td>판매자</td>
          </tr>
        </thead>
        <tbody>

        </tbody>
      </table>
    </>
  )
}
export default ItemInfo