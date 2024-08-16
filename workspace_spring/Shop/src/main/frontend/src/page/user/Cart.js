import axios from 'axios'
import React, { useEffect, useState } from 'react'
import './Cart.css'

const Cart = () => {
  const[cartList, setCartList] = useState([])
  const[cnt, setCnt] = useState(0)
 
  const userId = JSON.parse(window.sessionStorage.getItem('loginInfo')).memId

  let totalPrice = 0

  useEffect(()=>{
    axios
    .get(`/api-cart/getMyCart/${userId}`)
    .then((res)=>{
      setCartList(res.data)
    })
    .catch((error)=>{})}, [cnt])

  
  cartList.forEach((cart,i)=>{
    totalPrice = cart.itemVO.itemPrice*cart.cartCnt+totalPrice
  })

  function deleteCart(cartCode){
    axios
    .delete(`/api-cart/deleteCart/${cartCode}`)
    .then((res)=>{
      setCnt(cnt+1)
    })
    .catch((error)=>{})
  }

  function changeData(e, cart){
    const[name, value] = e.target
    

  }
 

  return (
    <div className='shop-cart-div'>
      <table className='cart-list-table'>
        <thead>
          <tr>
            <td>No</td>
            <td><input type='checkbox'/></td>
            <td>상품정보</td>
            <td>가격</td>
            <td>수량</td>
            <td>구매가격</td>
            <td>구매일시</td>
            <td></td>
          </tr>
        </thead>
        <tbody>
          {
            cartList.map((cart, i)=>{
              return(
                <tr key={i}>
                  <td>{cartList.length-i}</td>
                  <td><input type='checkbox' onClick={(e)=>{}}/></td>
                  <td>
                    <div className='in-box-intro'>
                      <img src={`http://localhost:8080/upload/${cart.itemVO.imgList[0].attachedFileName}`}/>
                      <p>{cart.itemVO.itemName}</p>
                    </div>
                  </td>
                  <td>
                    {cart.itemVO.itemPrice}
                  </td>
                  <td>
                    <div className='circul-div'>
                      <input type='number' name='cartCnt' value={cart.cartCnt} onChange={(e)=>{changeData(e, cart)}}/>
                    </div>
                  </td>
                  <td>
                    {'￦'+(cart.itemVO.itemPrice*cart.cartCnt).toLocaleString()}
                  </td>
                  <td>
                    {cart.cartDate}
                  </td>
                  <td>
                    <button type='button' className='btn btn-primary' onClick={(e)=>{deleteCart(cart.cartCode)}}>삭제</button>
                  </td>
                </tr>
              )
            })
          }
        </tbody>
      </table>
      <div>
        총구매금액:{totalPrice}
      </div>
      <div className='btn-div'>
        <button type='button' className='btn btn-primary'>선택삭제</button>
        <button type='button'  className='btn btn-primary'>선택구매</button>
      </div>
    </div>
  )
}

export default Cart
