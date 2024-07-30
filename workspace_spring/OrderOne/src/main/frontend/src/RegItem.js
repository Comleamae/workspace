import axios from "axios"
import { useState } from "react"
import { insertOne } from "./apis"
import { useNavigate } from "react-router-dom"

const RegItem = ()=>{

  const navigate = useNavigate()
  const [item, setItem] = useState({})

  const regOne = ()=>{
    insertOne(item)
    .then((res)=>{
      navigate('/main')
      alert('등록성공')
    })
    .catch((error)=>{
      alert('등록실패')
      console.log(error)
    })
  }

  const changeOne = (e)=>{
    setItem({...item,
    [e.target.name] : e.target.value})
  }

  return(
    <>
      <table>
        <tr>
          <td>상품명</td>
          <td>
            <input type="text" name="itemName" onChange={(e)=>{changeOne(e)}}></input>
          </td>
        </tr>
        <tr>
          <td>상품가격</td>
          <td>
            <input type="text" name="itemPrice" onChange={(e)=>{changeOne(e)}}></input>
          </td>
        </tr>
        <tr>
          <td>판매자</td>
          <td>
            <input type="text" name="seller" onChange={(e)=>{changeOne(e)}}></input>
          </td>
        </tr>
        <tr>
          <td>상품설명</td>
          <td>
            <textarea name="itemIntro" onChange={(e)=>{changeOne(e)}}></textarea>
          </td>
        </tr>
      </table>
      <button type="button" onClick={()=>{regOne()}}>등록</button>
    </>
  )
}
export default RegItem