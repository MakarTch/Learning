import React from "react";
import ReactDOM from "react-dom";
import Joke from "./Joke";
import products from "./vschoolProducts"

function JokeApp(){

    return(
        <div>
            <p>Joke text</p>
            <Joke fullJoke={{question:"What is the scale of 3?", answer:"Yajirobe!"}}/>
            <Joke fullJoke={{question:"How do you start a Poland?", answer:"Turn it around til it stops by itself!"}}/>
        </div>
    )
};

export default JokeApp;