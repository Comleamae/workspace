import axios from 'axios'
import React, { useEffect, useState } from 'react'
import './RegItem.css'
import { useNavigate } from 'react-router-dom'
import Modal from '../../common/Modal'

const RegItem = () => {
  const[categoryList, getCategoryList] = useState([])
  
  //모달 표시 상태
  const[isShow, setIsShow] = useState(false)
  //모달 내용 바꾸는 함수
  function modalContent(){
    return(
      <div>상품을 등록했습니다</div>
    )
  }
  //모달 상자 닫힌후 실행할 함수
  function modalClose(){
    
  }
  const navigate = useNavigate()
  const[itemData, setItemData] = useState({
    categoryNum:0
    , itmeName:''
    , itmeIntro:''
    , itmePrice:0
  })
  //카테고리 셀렉트 박스
  useEffect(()=>{
    axios
    .get('/api-admin/cateList')
    .then((res)=>{
      getCategoryList(res.data)
    })
    .catch((error)=>{console.log(error)})
  },[])
  //아이템 등록을 위한 변화기록
  function changeItemData(e){
    setItemData({
      ...itemData,
      [e.target.name]:e.target.value
    })
  }
  //아이템 등록 함수
  function insertItem(){
    axios
    .post('/api_admin/regItem', itemData)
    .then((res)=>{
        setIsShow(true) 
    })
    .catch((error)=>{

    }, [])
  }
  return (
    <div className='reg-item-div'>
      <table>
        <tbody>
          <tr>
            <td>
              <div>상품카테고리</div>
              <div>
                <select name='cateCode' onClick={(e)=>{changeItemData(e)}}>
                  {
                    categoryList.map((cate,i)=>{
                      return(
                        <option key={i} value={cate.cateCode}>{cate.cateName}</option>
                      )
                    })
                  }
                </select>
              </div>
            </td>
          </tr>
          <tr>
            <td>
              <div>상품명</div>
              <div><input type='text' className='input-element' name='itemName' onChange={(e)=>{changeItemData(e)}}/></div>
            </td>
          </tr>
          <tr>
            <td>
              <div>상품 가격</div>
              <div><input type='text' name='itemPrice' onChange={(e)=>{changeItemData(e)}}/></div>
            </td>
          </tr>
          <tr>
            <td>
              <div>상품 소개</div>
              <div>
                <textarea name='itemIntro' onChange={(e)=>{changeItemData(e)}}></textarea>
              </div>
            </td>
          </tr>
        </tbody>
      </table>
      
      <div className='btn-div'>
        <button type='button' className='btn btn-primary' onClick={(e)=>{insertItem()}}>상품목록</button>
      </div>
      {
        isShow
        ?
        <Modal content={modalContent}
        setIsShow={setIsShow}
        clickCloseBtn={modalClose}/>
        :
        null
      }
      
     
    </div>
  )
}
export default RegItem
