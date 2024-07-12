import logo from './logo.svg';
import './App.css';
import { Route, Router, Routes } from 'react-router-dom';
import data from './data';
import StuList from './StuList';

function App() {
  const stu_List = data
  return (
    <div className="App">
      <Router>
        <Route path='/' element={<StuList stu_List={stu_List}/>}></Route>
      </Router>
    </div>
  );
}

export default App;
