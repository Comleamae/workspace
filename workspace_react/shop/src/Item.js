import Book from "./Book"

const Item = ({item_list}) => {
  return(
    <div className='item-list'>
      {
        item_list.map((e, i)=>{
          return(
            <Book e={e} key={i}/>
          )
        })
      }
    </div>
  )
}
export default Item