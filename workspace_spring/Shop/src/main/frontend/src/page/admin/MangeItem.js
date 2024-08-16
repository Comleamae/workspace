import axios from 'axios'
import React, { useEffect, useState } from 'react'
import './MangeItem.css'

const MangeItem = () => {
  const [itemList, setItemList] = useState([])
  //판매 상태가 바뀌엇는지 저장해라
  const [isChangeStatus, setIsChangeStatus] = useState(false)

  useEffect(()=>{
    axios
    .get('/api-item/list')
    .then((res)=>{
      setItemList(res.data)
    })
    .catch((error)=>{})
  }, [])

  function deleteOne(itemCode){
    axios
    .delete(`/api-admin/deleteItem/${itemCode}`)
    .then((res)=>{})
    .catch((error)=>{
      console.log(error)
    })
  }

  function chageStatus(itemCode){
    axios
    .put(`/api-admin/chageStatus${itemCode}`, isChangeStatus)
    .then((res)=>{
      isChangeStatus==false
      ?
      setIsChangeStatus(true)
      :
      setIsChangeStatus(false)
    })
    .catch((error)=>{},[])
  }
  return (
    <div className='mange-div'>
      {
        itemList.map((item, i)=>{
          return(
              <div key={i} className='mange-one'>
                  <img src={`http://localhost:8080/upload/${item.imgList[0].attachedFileName}`}/>
                  <div>{item.cateCode}/{item.itemName}</div>
                  <div>{item.itemPrice}</div>
                  <div>{item.itemStatus}<button type='button' className='btn btn-primary' onClick={(e)=>{chageStatus(item.itemCode)}}>판매상태변환</button></div>
                  <button type='button' className='btn btn-primary' onClick={(e)=>{deleteOne(item.itemCode)}}>삭제</button>
              </div>
           
          )
        })
      }
    </div>

  )
}

export default MangeItem
