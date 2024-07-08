import { useState } from "react"

function Board(props){
  const copyCnt = [...props.likeCnts]
  
  return(
     <div>
        {props.titles.map((board, i)=>{
         return(
          <div key={i} className="content">
            {board}
            <div className="etc">
              <span onClick={(e)=>{
               copyCnt[i]=copyCnt[i]+1
               props.setCnts(copyCnt)
              }}>👍</span>
              {copyCnt[i]}
            </div>
            <button type="button" onClick={(e)=>{
              const copyTitle = [...props.titles]
              copyTitle.splice(i,1)
              console.log(copyTitle)
              props.setTitles(copyTitle)
            }}>삭제</button>
          </div>
         ) 
        })}
     </div>
    
  )
}
export default Board