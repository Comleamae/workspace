import axios from 'axios'
import React, { useEffect, useState } from 'react'

const Mange = () => {
  const [carList, setCarList] = useState([])
  const [newCar, setNewCar] = useState({
    maker : '현대'
  })

  useEffect(()=>{
    axios
    .get('/car/list')
    .then((res)=>{setCarList(res.data)})
    .catch((error)=>{}, [])})

  function regData(){
    axios
    .post('/car/reg', newCar)
    .then((res)=>{
      alert('등록성공')

    })
    .catch((error)=>{}, [])
  }
  function changeData(e){
    setNewCar({
      ...newCar,
      [e.target.name]:e.target.value
    })
  }

  return (
    <div className='mange'>
      <div className='regCar'>
        <p>-차량등록</p>
        <div className='mange-regData'>
          <div>
            제조사 
            <select name='maker' onChange={(e)=>{changeData(e)}}>
              <option>현대</option>
              <option>기아</option>
              <option>쌍용</option>
            </select>
          </div>
          <div>
            모델명
            <input type='text' name='modelName' onChange={(e)=>{changeData(e)}}/>
          </div>
          <div>
            차량가격
            <input type='text' name='price' onChange={(e)=>{changeData(e)}}/>
          </div>
        </div>
        <button type='button' onClick={()=>{regData()}}>등록</button>
      </div>
      <div className='listCar'>
        <p>-차량목록</p>
        <table>
          <thead>
            <tr>
              <td>모델번호</td>
              <td>모델명</td>
              <td>제조사</td>
            </tr>
          </thead>
          <tbody>
            {
              carList.map((car,i)=>{
                return(
                  <tr key={i}>
                    <td>{car.modelNum}</td>
                    <td>{car.modelName}</td>
                    <td>{car.maker}</td>
                  </tr>
                )
              })
            }
          </tbody>
        </table>
      </div>
    </div>
  )
}

export default Mange
