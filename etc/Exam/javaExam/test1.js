//item_list는 현재 쇼핑몰에서 판매하고 있는 상품들의 목록 정보이다.
//아래 데이터를 참고하여 요구사항을 해결하시오.
//자바스크립트 내에서 배열과 리스트는 비슷한 특성을 가져 구분하지 않음

//배열 : 데이터 여러개 존재(반복문 사용) + 데이터 접근할 때 순번으로 접근
const item_list = [
  { //key : value => key 값은 중복 불가 만약 같은 key를 가지는 값의 경우 마지막에 입력된 값을 가지고 옴(price:30000)
    item_name : '여름 셔츠',
    price : 25000,
    //price : 30000,
    brand : 'java마켓',
    size : [90, 100, 110]
  },
  {
    item_name : '라운드 티',
    price : 20000,
    brand : 'java마켓',
    size : [90, 95, 100, 105, 110]
  },
  {
    item_name : '데님 청바지',
    price : 30000,
    brand : 'python마켓',
    size : [90, 100, 110, 120]
  },
  {
    item_name : '슬림 면바지',
    price : 35000,
    brand : 'python마켓',
    size : [90, 95, 100]
  }
];

//1. 'java마켓'에서 팔고 있는 상품들의 상품명과 가격을 각각 콘솔창에 출력하여라.
// //1)일반 for문
// for(let i = 0; i< item_list.length; i++){
//   if(item_list[i].brand == 'java마켓'){
//       console.log(`상품명 : ${item_list[i].item_name} / 가격 : ${item_list[i].price}`)
//   }
// }

// //2)forEach문 easy
// for(const e of item_list){
//   if(e.brand=='java마켓'){
//     console.log(`상품명 : ${e.item_name} / 가격 : ${e.price}`)
//   }
// }
//3)forEach문 hard
item_list.forEach(element => {
  if(element.brand == 'java마켓'){
    console.log(`상품명 :  ${element.item_name} / 가격 : ${element.price}`)
  }
});

//2. 95사이즈를 구매할 수 있는 상품들의 상품명을 콘솔창에 출력하시오.
item_list.forEach((e, i)=>{
  //95사이즈 상품을 빼내기
  const copy = [...e.size]
  
  copy.forEach((search, j)=>{
      if(search==95){
        console.log(e.item_name)
      }
  })
})
//3. '등록 및 출력' 버튼을 클릭하면 입력 내용 저장 후 콘솔창에 데이터를 출력하시오.
function addItem(){
  const title = document.querySelector('#itemName')
  const price = document.querySelector('#price')
  const brand = document.querySelector('#brand')
  const size = document.querySelectorAll('.size')
  const chkSize = document.querySelectorAll('.size:checked')
   
  const copySize = [...size]
  const newSize = []
  //추가할 객체
  const addData = {
          'item_name' : title.value,
          'price' : document.querySelector('#price').value,
          'brand' : brand.value,
          'size' : newSize
        }

  // copySize.forEach((e, i)=>{
  //   if(e.checked==true){
  //     newSize.push(e.value)
  //   }
  // })
  chkSize.forEach((e, i)=>{
    newSize.push(e.value)  
  })

  

  if(title.value==false){
    alert('상품명을 입력하세요')
  }
  else{
    item_list.push(addData)
  }
  
  console.log(item_list)
}
