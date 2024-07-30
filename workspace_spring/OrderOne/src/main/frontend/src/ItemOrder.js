import axios from "axios"
import { useEffect, useState } from "react"
import { useNavigate } from "react-router-dom"

const ItemOrder = ()=>{

  const [itemList, setItemList] = useState([])

  const [orderList, setOrderList] = useState([])
  
  const [item, setItem] = useState({
    itemName:'',
    itemPrice: ''
  })
  
  const navigate = useNavigate()

  useEffect(()=>{
    axios
    .get(`/itemList`)
    .then((res)=>{
      setItemList(res.data)
      setItem({
        itemName:res.data[0].itemName
        , itemPrice:res.data[0].itemPrice
      })
    })
    .catch((error)=>{
      alert('fail')
    })
  },[])

  function goSetting(e){
    itemList.forEach((selectOne, i)=>{
      if(selectOne.itemName == (e.target.value)){
          setItem({
                  itemName:e.target.value
                  , itemPrice:selectOne.itemPrice
                })
      }
      
    })
  }

  const changeOrder = (()=>{

  })

  const goOrder = (()=>{
    axios
    .put('/regOrder')
    .then((res)=>{
      navigate('/orderList')
    })
    .catch((error)=>{
      alert('실패')
    })
  })

  return(
    <div>
      <table>
        <tr>
          <td>주문상품</td>
          <td>
            <select name="buyItemName" value={item.itemName} onChange={(e)=>{
              goSetting(e)
            }}>
            {
              itemList.map((e,i)=>{
                return(
                  <option key={i}>
                    {e.itemName}
                  </option>
                )
              })
            }
            </select>
          </td>
        </tr>
        <tr>
          <td>상품단가</td>
          <td>
           <input type="text" value={item.itemPrice} name="buyItemPrice" readOnly></input>
          </td>
        </tr>
        <tr>
          <td>주문자</td>
          <td>
            <input type="text" name="buyer" onChange={(e)=>{}}></input>
          </td>
        </tr>
        <tr>
          <td>주문수량</td>
          <td>
            <input type="number" name="orderCnt" onChange={(e)=>{}}></input>
          </td>
        </tr>
      </table>
      <button type="button" onClick={(e)=>{
        goOrder()
      }}>주문하기</button>
    </div>
  )
}
export default ItemOrder