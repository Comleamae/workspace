import axios from "axios"
import { useEffect, useState } from "react"



const OrderList = ()=>{
  useEffect(()=>{
    axios
    .get('/orderList')
    .then((res)=>{
      setOrder(res.data)
    })
    .catch((error)=>{})
  })

  const [order, setOrder] = useState([])

  return(
    <div>
      <h4>총 {order.length}건의 주문정보가 검색되었습니다</h4>
      <table>
        <thead>
          <tr>
            <td>NO</td>
            <td>상품명</td>
            <td>상품단가</td>
            <td>구매수량</td>
            <td>구매가격</td>
            <td>주문자</td>
            <td>주문일</td>
          </tr>
        </thead>
        <tbody>
          {
            order.map((e, i)=>{
              return(
                <tr>
                  <td>
                    {order.length-i}
                  </td>
                  <td>
                    {e.buyItemName}
                  </td>
                  <td>
                    {e.buyItemPrice}
                  </td>
                  <td>
                    {e.buyCnt}
                  </td>
                  <td>
                    {e.buy}
                  </td>
                  <td></td>
                  <td></td>
                </tr>
              )
            })
          }
        </tbody>
      </table>
    </div>
  )
}
export default OrderList