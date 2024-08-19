import axios from 'axios'
import React, { useEffect, useState } from 'react'
import './Cart.css'

const Cart = () => {
  const[cartList, setCartList] = useState([])
  const[cnt, setCnt] = useState(0)
  //제목줄 체크박스의 체크여부를 저장하고 있는 state변수
  //체크:true / 체크x:false
  const[chkAll, setChkAll] = useState(true)

  //내용줄 체크박스의 체크여부를 저장할 state변수(배열)
  const[chks, setChks] = useState([])

  //주문하나를 담을 state
  const[cart, setCart] = useState({})

  const userId = JSON.parse(window.sessionStorage.getItem('loginInfo')).memId

  let totalPrice = 0

  useEffect(()=>{
    axios
    .get(`/api-cart/getMyCart/${userId}`)
    .then((res)=>{
      setCartList(res.data)

      //조회된 장바구니 목록만큼 체크박스의 값을 설정
      const checkArr = new Array(res.data.length)
      //모든 배열의 값을 하나로 통일
      checkArr.fill(true)
      setChkAll(checkArr)
      setChks(checkArr)
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
  // 원하는 시점에 실행 할 수 있다고 생각
  useEffect(()=>{
    //마운트 됬을때는 실행하지 않겠다->처음 마운트 될때 리스트를 불러오지 않음으로 실행x
    if(chks.length != 0){
      //제목줄이 체크->전체 체크박스체크
     const copyChks = [...chks]

     if(chkAll){
      copyChks.fill(true)
     }
     else{
      copyChks.fill(false)
     }
     setChks(copyChks)
    }
  }, [chkAll])


 // 제목줄 체크박스 변경 시 실행되는 함수
 function changeCheckAll(){
     //!부정형으로 함으로서 항상 반대로
     setChkAll(!chkAll)
 }

  return (
    <div className='shop-cart-div'>
      <table className='cart-list-table'>
        <thead>
          <tr>
            <td>No</td>
            <td><input type='checkbox' 
              checked={chkAll} 
              onChange={(e)=>{changeCheckAll()}}/></td>
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
                  <td><input type='checkbox' checked={chks[i]} 
                        onChange={(e)=>{
                          //배열의 특성으로 실질 값을 바꿀수 없어 전개해 값만 옮겨서 새로 만들어 
                          const copyChks = [...chks]
                          copyChks[i] = !copyChks[i]
                          setChks(copyChks)
                        }}/></td>
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
                      <input type='number' name='cartCnt' defaultValue={cart.cartCnt} onChange={(e)=>{
                        const copyCnt = [cart]
                        setCart({...cart,
                          'cartCnt':copyCnt})
                      }}/>
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
