import React from 'react'
import { Outlet } from 'react-router-dom'

const AdiminLayout = () => {
  return (
    <div>
      <div>관리자 전용 페이지</div>
      <Outlet/>
    </div>
  )
}

export default AdiminLayout
