import { useNavigate } from "react-router-dom"

const Book = ({e}) => {
  // navigate 는 함수 
  // navigate('이동할 url')
  // navigate(-1) 한 페이지 뒤로 가기
  // navigate(-2) 두 페이지 뒤로 가기
  // navigate(1) 한 페이지 앞로 가기
  const navigate = useNavigate();


  return(
    <div className='item'>
      <img onClick={(eve)=>{
        navigate(`/detail/${e.itemNum}`)
      }} src={process.env.PUBLIC_URL +'/'+ e.imgName}></img>
      <h3>{e.itemName}</h3>
      <p>{e.price}</p>
    </div>
  )
}

export default Book