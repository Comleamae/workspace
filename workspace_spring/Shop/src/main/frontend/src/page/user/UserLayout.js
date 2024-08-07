import React from 'react'
import { Outlet } from 'react-router-dom'
import './UserLayout.css'

const UserLayout = () => {
  return (
    <div>
      <div>
        <ul className='page-menu'>
          <li>
            <span>전체상품</span>
          </li>
          <li>
            <span>인터넷/IT</span>
          </li>
          <li>
            <span>소설</span>
          </li>
          <li>
            <span>자기계발</span>
          </li>
        </ul>
      </div>
      <Outlet/>
    </div>
  )
}

export default UserLayout
