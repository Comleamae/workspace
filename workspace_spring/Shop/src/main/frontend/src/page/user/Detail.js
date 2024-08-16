import axios from 'axios'
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom'
import './Detail.css'

const Detail = () => {
  const[detailData,setDetailData] = useState({})

  const {itemCode} = useParams()
  const navigate = useNavigate()

  const [isMainShow, setIsMainShow] = useState(false)
  const[totalPrice, setTotalPrice] = useState(0)
  const[itemCnt, setItemCnt] = useState(1)
  const [mainImgName, setMainImgName] = useState('')
  const [subImgName, setSubImgName] = useState('')
  
  const [cartData, setCartData] = useState({
    cartCnt:1
    , itemCode:itemCode
    , memId:JSON.parse(window.sessionStorage.getItem('loginInfo')).memId
  })

  function changeNum(e){
    setCartData({
       ...cartData,
      [e.target.name]:e.target.value
    })
  }

  useEffect(()=>{
    axios
    .get(`/api-item/detail/${itemCode}`)
    .then((res)=>{
      //조회된 정보에서 대표이미지명, 서브이미지명 찾기
      let img1=''
      let img2=''
      // 값을 바로 set함수에 넣어 주지않는 이유는 state변수로 재시작 하는걸 방지하기 위해서
      res.data.imgList.forEach((img, i) => {
        if(img.isMain == 'Y'){
          img1 = img.attachedFileName
        }
        else{
          img2 = img.attachedFileName
        }
      })
      setMainImgName(img1)
      setSubImgName(img2)
      setIsMainShow(true)
      setDetailData(res.data)
      setTotalPrice(res.data.itemPrice)
    })
    .catch((error)=>{})
  }, [])

  function regCart(){
    axios
    .post('/api-cart/regCart', cartData)
    .then((res)=>{
      const result = window.confirm('장바구니에 상품을 담았습니다. \n계속 쇼핑하겠습니까?')
      // 취소를 선택하면 장바구니 목록으로
      if(!result){
        navigate('/userCart')
      }
    })
    .catch((error)=>{})
  }

  // function aboutCnt(e){
  //   changeNum(e)
  //   setTotalPrice(detailData.itemPrice*Number(e.target.value))
  //   setItemCnt(e.target.value)
  // }

  // 수량이 변경되면 실행되는 함수
  function changeItemCnt(e){
    const cnt = Number(e.target.value)

    if(cnt<1||cnt>10){
      alert('수량은 최대 10개, 최소1개 가능합니다')
      setItemCnt(1)
      setTotalPrice(detailData.itemPrice)
      //장바구니 등록 시 필요시 수량 데이터 변경
      setCartData({...cartData, 'itemCnt':1})
    }
    else{
      //총 가격 계산:단가*수량
      setTotalPrice(detailData.itemPrice*Number(e.target.value))
      setItemCnt(e.target.value)}

      //장바구니 등록 시 필요시 수량 데이터 변경
      setCartData({...cartData, 'itemCnt':e.target.value})
    }
  

  return (
    <div className='item-detail-div'>
      <div className='detailHeader'>
        <div className='mainImg'>
          <img src={
          isMainShow
          ?
          `http://localhost:8080/upload/${mainImgName}`:null}
          />
        </div>
        <div className='info'>
          <h1>{detailData.itemName}</h1>
          <div className='item-cnt-div'>
            <p><span>가격:</span>{Object.keys(detailData).length==0?null: '￦'+detailData.itemPrice.toLocaleString()+'원'}</p>
            <p><span>수량:</span><input type='number' value={itemCnt} name='cartCnt' className='form-control' onChange={(e)=>{
              //수량이 0이하이거나 10개를 초과하면 수량을 1개로 고정
                changeItemCnt(e)
                changeNum(e)
              }}/></p>
          </div>
          {/* <p>총가격: {Object.keys(detailData).length==0?null:'￦'+detailData.itemPrice*cartData.cartCnt.toLocaleString()+'원'}</p> */}
          <p>총가격: {'￦'+totalPrice.toLocaleString()+'원'}</p>
          <div className='btn-div'>
            <button type='button' className='btn btn-primary' onClick={(e)=>{}}>구매하기</button>
            <button type='button' className='btn btn-primary' onClick={(e)=>{regCart()}}>장바구니에 담기</button>
          </div>
        </div>
      </div>

      <div className='detailContent'>
        {detailData.itemIntro}
      </div>

      <div className='detailFooter'>
        <img src={
          isMainShow
          ?
          `http://localhost:8080/upload/${subImgName}`:null}
          />
      </div>
    </div>
    
  )
}
export default Detail
