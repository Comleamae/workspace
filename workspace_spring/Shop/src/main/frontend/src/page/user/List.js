import axios from 'axios'
import React, { useState } from 'react'
import './List.css'
import { useNavigate } from 'react-router-dom'

const List = () => {
  const navigate = useNavigate()
  //리스트 담을 변수
  const[itemList, setItemList] = useState([])
  //상세보기로 가자
  useState(()=>{
    axios
    .get('/item/list')
    .then((res)=>{
      setItemList(res.data)
    })
    .catch((error)=>{

    })
  },[])
  return (
    <div className='user-list-div'> 
      {
        itemList.map((item, i)=>{
          return(
              <div key={i} className='item-one'>
                <img onClick={(e)=>{navigate(`/detail/${item.itemCode}`)}} src='http://localhost:8080/images/handle.PNG' />
                <div>{item.itemName}</div>
                <div>{item.itemPrice}</div>
              </div>
          )
        })
      }
     
    </div>
  )
}

export default List
