import React from 'react'
import { Outlet, useNavigate } from 'react-router-dom'
import './AdminLayout.css'
import AdminSubLayout from './AdminSubLayout'

const AdminLayout = () => {
  const navigate = useNavigate()
  return (
    <div>
      <div>
        <ul className='page-menu'>
          <li>
            <span onClick={(e)=>{navigate('/admin/mangeItem')}}>상품관리</span>
          </li>
          <li>
            <span>구매관리</span>
          </li>
          <li>
            <span>유저관리</span>
          </li>
          <li>
            <span>매출관리</span>
          </li>
        </ul>
      </div>
      <div className='admin-main'>
        <div><AdminSubLayout/></div>
        <div><Outlet/></div>
      </div>
    </div>
  )
}

export default AdminLayout
