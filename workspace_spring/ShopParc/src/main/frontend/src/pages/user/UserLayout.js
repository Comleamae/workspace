import React from 'react'
import { Outlet } from 'react-router-dom'

const UserLayout = () => {
  return (
    <div>
      <div>유저 전용 페이지</div>
      {/* <Oultlet />: Route안의 Route의 내용을 보여주는 위치를 설정하기 위해 사용함 */}
      <Outlet /> 
    </div>
    
  )
}

export default UserLayout
