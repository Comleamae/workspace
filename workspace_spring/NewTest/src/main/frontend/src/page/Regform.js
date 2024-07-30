import axios from 'axios'
import React, { useEffect, useState } from 'react'
import { useNavigate } from 'react-router-dom'

const Regform = () => {
  const[salesList, setSalesList] = useState([])
  const[salesOne, setSalesOne] = useState({})
  const navigate = useNavigate()

  useEffect(()=>{
    axios
    .get('/car/list')
    .then((res)=>{
      setSalesList(res.data)
    })
    .catch((error)=>{
      console.log(error)})
  }, [])

  function regOne(){
    axios
    .post('/sales/reg', salesOne)
    .then((res)=>{
      alert('등록완료')
      navigate('/sales')
    })
    .catch((error)=>{
      console.log(error)
    })
  }

  function changeData(e){
    setSalesOne({
      ...salesOne,
      [e.target.name]:e.target.value
    })
  }

  return (
    <div className='regForm'>
      <div className='salesName'>
        구매자명
        <input type='text' name='salesName' onChange={(e)=>{changeData(e)}}/>
      </div>
      <div className='reg-second-div'>
        <div>
          색상
          <select name='color'value={salesOne.color} onChange={(e)=>{changeData(e)}}>
            <option>블랙</option>
            <option>화이트</option>
            <option>실버</option>
            <option>레드</option>
          </select>
        </div>
        <div>
          모델
          <select name='modelNum' onChange={(e)=>{changeData(e)}}>
            {
              salesList.map((sales, i)=>{
                return(
                  <option key={i} value={sales.modelNum}>{sales.modelName}</option>
                )
              })
            }
          </select>
        </div>
      </div>
      <div>
        연락처
        <input type='text' name='salesTel' onChange={(e)=>{changeData(e)}}/>
      </div>
      <button type='button' onClick={(e)=>{regOne()}}>등록</button>
    </div>
  )
}

export default Regform
