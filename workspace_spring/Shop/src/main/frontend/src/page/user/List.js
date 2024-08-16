import axios from 'axios'
import React, { useEffect, useState } from 'react'
import './List.css'
import { useNavigate, useParams } from 'react-router-dom'

const List = ({form}) => {
  const navigate = useNavigate()
  //리스트 담을 변수
  const[itemList, setItemList] = useState([])
  //상세보기로 가자
  console.log(form)
  useEffect(()=>{
    axios
    .get(`/api-item/list/${form}`)
    .then((res)=>{
      setItemList(res.data)
      
    })
    .catch((error)=>{
      
    })
  },[form])
  return (
    <div className='item-list-div'> 
      {
        itemList.map((item, i)=>{
          return(
              <div key={i} className='item-one'>
                <img src={`http://localhost:8080/upload/${item.imgList[0].attachedFileName}`}/>
                <h4 onClick={(e)=>{navigate(`/detail/${item.itemCode}`)}}>{item.itemName}</h4>
                <p>{item.itemPrice.toLocaleString()}</p>
              </div>
          )
        })
      }
     
    </div>
  )
}

export default List
