const Book = ({e}) => {
  return(
    <div className='item'>
      <img src={process.env.PUBLIC_URL +'/'+ e.imgName}></img>
      <h3>{e.itemName}</h3>
      <p>{e.price}</p>
    </div>
  )
}



export default Book