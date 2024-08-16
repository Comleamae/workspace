import axios from 'axios'
import React, { useEffect, useState } from 'react'
import './RegItem.css'
import { useNavigate } from 'react-router-dom'
import Modal from '../../common/Modal'

const RegItem = () => {
  const[categoryList, getCategoryList] = useState([])

  //첨부파일을 저장할 변수
  const[mainImg, setMainImg] = useState(null)

  //
  const[subImg, setSubImg] = useState(null)

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
    navigate('/admin/mangeItem')
  }
  const navigate = useNavigate()
  const[itemData, setItemData] = useState({
    cateCode:1
    , itemName:''
    , itemIntro:''
    , itemPrice:''
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
  //첨부파일 존재시 config
  //post(url, data, config)
  //get(url, config)
  //put(url, data, config)
  //delete(url, config)

  function insertItem(){
    //axios 통신으로 자바로 갈 때 첨부파일이 있으면
    //반드시 아래의 설정코드를 axios에 추가
    const fileConfing = {headers:{'Content-Type':'multipart/form-data'}}

    //위의 설정코드를 axios 통신할때 추가하면
    //자바로 넘어가는 데이터를 전달하는 방식이 달라짐
    //첨부파일이 있는 데이터를 자바로 전달하기 위해서는 form객체를 사용해서 전달
    
    //1. form 객체 생성
    const itemForm = new FormData();

    //2. form 객체에 데이터 추가
    itemForm.append('itemName', itemData.itemName);
    itemForm.append('itemPrice', itemData.itemPrice);
    itemForm.append('itemIntro', itemData.itemIntro);
    itemForm.append('cateCode', itemData.cateCode);
    itemForm.append('mainImg', mainImg);
    itemForm.append('subImg', subImg);

    //3. 데이터를 가진 form 객체를 axios 통신에서 자바로 전달한다
    // axios.post('/api-admin/regItem', itemData, fileConfing)
    axios.post('/api-admin/regItem', itemForm, fileConfing)
    .then((res)=>{
        setIsShow(true) 
    })
    .catch((error)=>{
      console.log(error)
    }, [])
  }
  return (
    <div className='reg-item-div'>
      <table className='input-element'>
        <tbody>
          <tr>
            <td>
              <div className='input-title'>상품카테고리</div>
              <div>
                <select name='cateCode' className='form-control' onChange={(e)=>{changeItemData(e)}}>
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
              <div className='input-title'>상품명</div>
              <div><input type='text' name='itemName' className='form-control' onChange={(e)=>{changeItemData(e)}}/></div>
            </td>
          </tr>
          <tr>
            <td>
              <div className='input-title'>상품 가격</div>
              <div><input type='text' name='itemPrice' className='form-control' onChange={(e)=>{changeItemData(e)}}/></div>
            </td>
          </tr>
          <tr>
            <td>
              <div className='input-title'>상품 소개</div>
              <div>
                <textarea name='itemIntro' className='form-control' rows={7} onChange={(e)=>{changeItemData(e)}}></textarea>
              </div>
            </td>
          </tr>
        </tbody>
      </table>
      <div className='file-div'>
        <input type='file' onChange={(e)=>{
          //선택한 파일 정보(배열로 가지고 옴)
          setMainImg(e.target.files[0])
        }
      }/>
      </div>
      <div className='file-div'>
        <input type='file' onChange={(e)=>{
          setSubImg(e.target.files[0])
        }}/>
      </div>
      <div className='btn-div'>
        <button type='button' className='btn btn-primary' onClick={(e)=>{insertItem()}}>상품등록</button>
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
