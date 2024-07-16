//가장 나중에 실행
//컴포넌트의 생애주기에 따라 기능을 구현
//생애주기
//mount(컴포넌트 생성)
//update(컴포넌트 재랜더링)
//unmount(컴포넌트 제거)
const [age, setAge] = useState(0)
const [addr, setAddr] = useState('')

useEffect(()=>{}) //마운트 +업데이트
useEffect(()=>{}, []) //마운트 
useEffect(()=>{}, [age]) //마운트 + age라는 변수의 값이 업데이트 될때  
useEffect(()=>{}, [age, addr]) //마운트 + age, addr라는 변수의 값이 업데이트 될때  


 //게시글 목록을 저장할 state 변수
 const [boardList, setBoardList] = useState([])
 //게시글 목록 데이터 받기
 //useEffect 안의 내용은 마지막에 실행
 useEffect(()=>{
   //서버에서 데이터 받기
   axios
   //데이터를 가져올 url
   .get('/boardList') 
   //데이터 조회 후 실행할 내용 
   //res: 통신 결과 모든 정보가 담긴 객체
   //res.data: 조회한 데이터
   .then((res)=>{
     console.log('조회 성공')
     setBoardList(res.data)
   }) 
   //오류 발생 시 실행 할 내용(오류 발생 시에만 실행) 
   //error: 오류에 대한 모든 정보가 담긴 객체
   .catch((error)=>{
     console.log('axios 통신 중 오류 발생!!')
     console.log(error)
   }) 
 }, [])