import React from 'react'
import { useNavigate } from 'react-router-dom'
import './AdminSubLayout.css'
const AdminSubLayout = () => {
  const navigate = useNavigate()

  return (
    <div>
      <ul className='sub-menu'>
        <li>
          <span onClick={(e)=>{navigate('/admin/mangeItem')}}>상품관리</span>
        </li>
        <li>
          <span onClick={(e)=>{navigate('/admin/regItem')}}>상품등록</span>
        </li>
        <li>
          <span onClick={(e)=>{}}>카테고리 관리</span>
        </li>
      </ul>
    </div>
  )
}

export default AdminSubLayout
