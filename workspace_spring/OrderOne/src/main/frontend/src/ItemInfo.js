import axios from "axios"
import { useEffect, useState } from "react"
import { getItemList } from "./apis"

const ItemInfo = () =>{

  const [itemList, setItemList] = useState([])

  useEffect(()=>{
    getItemList()
    .then((res)=>{
      setItemList(res.data)
    })
    .catch((error)=>{})
  }, [])

  return(
    <>
      <h4> 총 {itemList.length}개의 상품이가 등록되었습니다 </h4>
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
          {
            itemList.map((e, i)=>{
              return(
                <tr key={itemList.length-1}>
                <td>
                  {itemList.length-i}
                </td>
                <td>
                  {e.itemName}
                </td>
                <td>
                  {e.itemPrice}
                </td>
                <td>
                  {e.seller}
                </td>
              </tr>
              )
              
            })
          }
        </tbody>
      </table>
    </>
  )
}
export default ItemInfo