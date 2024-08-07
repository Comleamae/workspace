import axios from 'axios'
import React, { useEffect, useState } from 'react'

const MangeItem = () => {
  const [itemList, setItemList] = useState([])

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
  return (
    <div className='list'>
      {
        itemList.map((item, i)=>{
          return(
            <div key={i}>
              <img src='http://localhost:8080/images/handle.PNG' />
              <div>{item.itemName}</div>
              <div>{item.itemPrice}</div>
              <button type='button' onClick={(e)=>{deleteOne(item.itemCode)}}>삭제</button>
            </div>
          )
        })
      }
    </div>
  )
}

export default MangeItem
