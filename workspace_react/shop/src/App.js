import logo from './logo.svg';
import './App.css';
import data from './data';
import Item from './Item';
import axios from 'axios';

function App() {
  //상품 목록 데이터
  //const item_list = data
  let item_list = []

  axios.get('/test1')
      .then((res)=>{
        console.log(res.data)
      });
  
  axios.get('/test2')
      .then((res)=>{
        console.log(res.data)
      })

  let arr = []

  axios.get('/test3')
      .then((res)=>{
        console.log(res.data)
        arr = res.data //가져온 res.data를 사용할 수 있도록 arr에 넣음
      })

 
  //실행시 데이터 받아오는게 늦어 후순위로 밀림
  axios.get('/test4')
      .then((res)=>{
        console.log(res.data)
        item_list = res.data
      })
  
  //구조분해할당

  //1)배열
  const arr1 =[1, 2, 3]
  const [a, b, c] = arr1 ///[1, 2, 3] 배열이므로 순서에 따라

  //2)객체
  const obj ={
    stuNum : 1,
    stuName : 'hong'
  }
  const {stuNum, stuName} = obj // 객체 이기에 key에 맞춰 값을 넣어줌

  //3)
  const member = {
    no:1,
    name:'kim',
    addr:'울산',
    score:80
  }//no=1, score=80
  
  abc(member);

  function abc({name, addr}){
    name; //'kim'
    addr;//'울산'
  }//const {name, addr} = memeber
  //{kim, '울산'}

  return (
    <div className="App">
     <div className='header'>
      Book Shop
     </div>
     <div className='banner'>
                {/* public 폴더에 있는 파일을 불러오기위한 */}
      <img src={process.env.PUBLIC_URL + '/header.jpg'}/>
     </div>
     <Item item_list={item_list}/>
     <Test name={'홍길동'} age={20}/>
    </div>
  );
}

const Test = ({name, age}) => {
  console.log(name)
  console.log(age)
  return (
    <div>sds</div>
  );
}

export default App;
