import { useParams } from 'react-router-dom'
import './Detail.css'

const Detail = ({item_list})=>{

  // url로 전달되는 데이터 받기 =>객체로 받음 각각의 값을 얻기위해선 .요소

  //방식1)
  // const params = useParams()
  // console.log(params)
  // console.log(params.id)

  //방식2)구조분해할당
  const {id} = useParams()
  
  let findItem = null
  
        item_list.forEach((e, i)=>{
          if(e.itemNum == id){
            findItem = e
          }
        })

  return(
    <div className="detail">

        <div className="item-info">
            <img src={process.env.PUBLIC_URL+ '/'+ findItem.imgName}></img>
            <div className="selectOne">
              <p>{findItem.itemName}</p>
              <p>{findItem.price}</p>
              <button type="button">주문하기</button>
            </div>
        </div>
        <div className="intro">
          {findItem.intro}
        </div>
    </div>
      )

}

export default Detail