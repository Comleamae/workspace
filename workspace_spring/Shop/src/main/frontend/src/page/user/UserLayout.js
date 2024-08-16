import React, { useEffect, useState } from 'react'
import { Outlet, useNavigate } from 'react-router-dom'
import './UserLayout.css'
import axios from 'axios'

const UserLayout = ({form, setForm}) => {
  const[cateList, setCateList] = useState([])
  const navigate= useNavigate()
  
  useEffect(()=>{
    axios
    .get(`/api-admin/cateList`)
    .then((res)=>{
      setCateList(res.data)
    })
    .catch((error)=>{})
  },[form])


  return (
    <div>
      <div className='user-menu-div'>
        <ul className='page-menu'>
          <li>
            <span onClick={(e)=>{
              setForm(0)
              console.log(form)
              navigate(`/list`)}
              }>전체상품</span>
          </li>
          {
            cateList.map((cateOne,i)=>{
              return(
                <li key={i}>
                  <span onClick={(e)=>{
                    setForm(cateOne.cateCode)
                    console.log(form)
                    }}>{cateOne.cateName}</span>
                </li>
              )
            })
          }
        </ul>
      </div>
      <Outlet/>
    </div>
  )
}

export default UserLayout
