import axios from 'axios'
import React, { useEffect, useState } from 'react'
import './MangeCategory.css'

const MangeCategory = () => {
  const[categoryList, setCategoryList] = useState([])

  const[newCategory, setNewCategory] = useState({})

  const[cnt, setCnt] = useState(0)

  function regCategory(){
    axios
    .post('/api-admin/regCategory', newCategory)
    .then((res)=>{
      setCnt(cnt-1)
    })
    .catch((error)=>{}, [])
  }
  useEffect(()=>{
    axios
    .get('/api-admin/cateList')
    .then((res)=>{
      setCategoryList(res.data)
      
    })
    .catch((error)=>{console.log(error)})
  },[cnt])

  function changeData(e){
    setNewCategory({
      ...newCategory,
      [e.target.name]:e.target.value
    })
  }

  function deleteCategory(cateCode){
    axios
    .delete(`/api-admin/deleteCategory/${cateCode}`)
    .then((res)=>{
      setCnt(cnt+1)
    })
    .catch((error)=>{})
  }

  return (
    <div className='mange-category-div'>
      {
        categoryList.map((category, i)=>{
          return(
            <div key={i}>
              <div>
                {category.cateName}
                <button type='button' onClick={(e)=>{deleteCategory(category.cateCode)}}>삭제</button>
              </div>
            </div>
          )
        })
      }
      <input type='text' name='cateName' onChange={(e)=>{changeData(e)}}/>
      <button className='btn btn-primary' type='button' onClick={(e)=>{regCategory()}}>추가</button>
    </div>
  )
}

export default MangeCategory
