import axios from 'axios'
import React, { useEffect, useState } from 'react'

const Sales = () => {
  const [salesList, setSalesList]= useState([])
  useEffect(()=>{
    axios
    .get('/sales/allList')
    .then((res)=>{
      console.log(res.data)
      setSalesList(res.data)
    })
    .catch((error)=>{})
  }, [])
  return (
    <div className='sales-div'>
      <table>
        <thead>
          <tr>
            <td rowSpan={2}>NO.</td>
            <td colSpan={4}>구매자정보</td>
            <td colSpan={2}>차량정보</td>
          </tr>
          <tr>
            <td>구매자명</td>
            <td>연락처</td>
            <td>구매일</td>
            <td>색상</td>
            <td>모델명</td>
            <td>금액</td>
          </tr>
        </thead>
        <tbody>
          {
            salesList.map((sales, i)=>{
              console.log(sales)
              return(
                <tr key={i}>
                  <td>{sales.salesNum}</td>
                  <td>{sales.salesName}</td>
                  <td>{sales.salesTel}</td>
                  <td>{sales.salesDate}</td>
                  <td>{sales.color}</td>
                  <td>{sales.carVO[sales.modelNum].modelName}</td>
                  <td>{sales.carVO[sales.modelNum].price}</td>
                </tr>
              )
            })
          }
        </tbody>
      </table>
    </div>
  )
}

export default Sales
