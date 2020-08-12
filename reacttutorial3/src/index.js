import React from 'react';
import ReactDOM from 'react-dom';
import MyInfo from "./components/MyInfo";
import App from "./App";
import CheckList from "./components/CheckList";
import ContactInfo from "./components/ContactInfo";
import JokeApp from "./components/JokeApp";
import ProductApp from "./components/ProductApp"
import RenderApp from "./components/RenderApp"
import RenderState from "./components/RenderState"
import LogPractice from "./components/LogPractice"
import ClickPractice from "./components/ClickPractice"
import MountPractice from "./components/MountPractice"
import TodoApp from "./components/TodoApp"
import AppAPI from "./components/AppAPI"

import "./style.css"

// var element = React.createElement('h1', { className: 'greeting' }, 'Hello, world!');
// var element2 = React.createElement(<h1>Yoyo!</h1>, document.getElementById('root'));

let unorderedList = 
<ul>  
  <li>Item 1</li>
  <li>Item 2</li>
  <li>Item 3</li>
</ul>;

ReactDOM.render(unorderedList, document.getElementById('root'));//using just a variable

function MyApp(){
  return (
  <ul>
    <li style={{color:"red"}}>Item 1</li>
    <li>Item 2</li>
    <li>Item 3</li>
  </ul>
)};//peep how i did inline styling there, gota make an object with an object, some shit like that

ReactDOM.render(<MyApp/>, document.getElementById("root2"));//using a function

ReactDOM.render(<MyInfo/>, document.getElementById("root3"));//using a function from another file, export it, import it up top on this file

ReactDOM.render(<App/>,document.getElementById("root4"));

ReactDOM.render(<CheckList/>,document.getElementById("root5"));

const date = new Date();

ReactDOM.render(<p>The time is {date.toLocaleTimeString()}.</p>, document.getElementById("root6"));//You can use javascipt to create if else statements to add style, 1:09:23

ReactDOM.render(<ContactInfo/>, document.getElementById("root7"));

ReactDOM.render(<JokeApp/>, document.getElementById("root8"));

let arr1 = [1,2,3,4];
let x = arr1.map(add)

function add(num){
  return num+1
}

ReactDOM.render(<p>{x.toString()}</p>, document.getElementById("root9"));

//ReactDOM.render(<ProductApp/>, document.getElementById("root10")); //idk, shit with an array map, i dont uderstand

ReactDOM.render(<RenderApp/>, document.getElementById("root11"));

ReactDOM.render(<RenderState/>, document.getElementById("root12"))

ReactDOM.render(<LogPractice/>, document.getElementById("root13"))


ReactDOM.render(<ClickPractice/>, document.getElementById("root14"))

let hello = function(){
  return "inside function"
}
//console.log(hello())

ReactDOM.render(<MountPractice/>, document.getElementById("root15"))

ReactDOM.render(<TodoApp/>, document.getElementById("root16"))

ReactDOM.render(<AppAPI/>, document.getElementById("root16"))
