import { useParams } from 'react-router-dom'
import './Detail.css'
import { useEffect, useState } from 'react'

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

  const [num, setNum] =  useState(0)  
  const [num1, setNum1] =  useState(0)  

  
  //해당 컴포넌트가 랜더링되면 마지막에 실행
  //==>mount(컴포넌트를 새로 읽을 때) + update(재댄더링) 되면 실행
  //useEffect의 두번째 매개변수가 없으면 mount + update 될때 실행
  useEffect(()=>{
    console.log(num)
  })
  //컴포넌트의 라이프싸이클 사이에 필요한 기능 추가

  //mount(컴포넌트를 새로 읽을 때) 실행 
  //*빈배열[]을 두번째 매개변수로 전달 할경우 mount 될때만 실행
  useEffect(()=>{
    console.log(num1)
  }, [])

  //두번째 매개변수에 배열형태로 state변수를 넣으면 
  //해당 useEffect는 mount + 배열에 넣은 state값이 변경되어 재랜더링 될때 실행
  useEffect(()=>{
    console.log(3)
  }, [num])
  useEffect(()=>{
    console.log(4)
  }, [num, num1])

  //unmount 되거나 컴포넌트가 끝날때 return문 안의 코드를 실행
  useEffect(()=>{
    console.log(5)
    //return 안의 내용은 mount 될 때 실행하지 않고
    //update 될때 가장 먼저 실행
    //unmount 될때 실행
    return () => {
      console.log(6)
    }
  }, [num])

  //언마운트 될때만 7 출력
  useEffect(()=>{
    return()=>{
      console.log(7)
    }
  }, [])




  return(
    <div className="detail">
      <button type='button' onClick={((e)=>{setNum(num+1)})}>num값 변경</button>
      <div>num={num}</div>

      <button type='button' onClick={((e)=>{setNum1(num1+1)})}>num1값 변경</button>
      <div>num1={num1}</div>

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