import React, { useState } from 'react'
import { Outlet, useNavigate } from 'react-router-dom'
import './AdminLayout.css'


const AdminLayout = () => {
  const navigate = useNavigate()

  // 사이드 메뉴 정보를 관리하는 state변수
  const[sideMenu, setSideMenu] = useState('mangeItem')

  // 사이드 메뉴를 화면에 그리는 함수
  function drawSideMenu(){
    if(sideMenu=='mangeItem'){
      return(
        <>
        <li>
          <span onClick={(e)=>{navigate('/admin/mangeItem')}}>
            상품관리
          </span>
          <span><i className="bi bi-chevron-right"></i></span>
        </li>
        <li>
          <span onClick={(e)=>{navigate('/admin/regItem')}}>
            상품등록
          </span>
          <span><i className="bi bi-chevron-right"></i></span>
        </li>
        <li>
          <span onClick={(e)=>{navigate('/admin/mangeCategory')}}>
            카테고리관리
          </span>
          <span><i className="bi bi-chevron-right"></i></span>
        </li>
        </>
      )
    }
    else if(sideMenu=='mangeSale'){
      return(
        <>
        <li>
          <span onClick={(e)=>{navigate()}}>
            이달의 구매내역
          </span>
          <span><i className="bi bi-chevron-right"></i></span>
        </li>
        <li>
          <span onClick={(e)=>{navigate()}}>
            구매정보 검색
          </span>
          <span><i className="bi bi-chevron-right"></i></span>
        </li>
        </>
      )
    }
    else if(sideMenu=='mangeUser'){
      return(
        <>
        <li>
          <span onClick={(e)=>{navigate()}}>
            유저검색
          </span>
          <span><i className="bi bi-chevron-right"></i></span>
        </li>
        <li>
          <span onClick={(e)=>{navigate()}}>
            유저정보 변경
          </span>
          <span><i className="bi bi-chevron-right"></i></span>
        </li>
        <li>
          <span onClick={(e)=>{navigate()}}>
            탈퇴유저 관리
          </span>
          <span><i className="bi bi-chevron-right"></i></span>
        </li>
        </>
      )
    }
    else if(sideMenu=='mangeRecord'){
      return(
        <>
        <li>
          <span onClick={(e)=>{navigate()}}>
            이달의 매출
          </span>
          <span><i className="bi bi-chevron-right"></i></span>
        </li>
        <li>
          <span onClick={(e)=>{navigate()}}>
            월별 매출
          </span>
          <span><i className="bi bi-chevron-right"></i></span>
        </li>
        <li>
          <span onClick={(e)=>{navigate()}}>
            카테고리별 매출
          </span>
          <span><i className="bi bi-chevron-right"></i></span>
        </li>
        </>
      )
    }
    
  }
  function setNowPage(data){
    setSideMenu(data)
    navigate(`/admin/${data}`)
  }

  return (
    <div>
      <div className='admin-menu-div'>
        <ul className='page-menu'>
          <li>
            <span onClick={(e)=>{setNowPage('mangeItem')}}>상품관리</span>
          </li>
          <li>
            <span onClick={(e)=>{setNowPage('mangeSale')}}>구매관리</span>
          </li>
          <li>
            <span onClick={(e)=>{setNowPage('mangeUser')}}>유저관리</span>
          </li>
          <li>
            <span onClick={(e)=>{setNowPage('mangeRecord')}}>매출관리</span>
          </li>
        </ul>
      </div>
      <div className='side-menu-div'>
      <ul className='sub-menu'>
        {
          drawSideMenu()
        }
      </ul>
        <Outlet/>
      </div>
    </div>
  )
}

export default AdminLayout



         
