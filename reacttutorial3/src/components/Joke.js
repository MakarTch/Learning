import React from "react";
import ReactDOM from "react-dom";

function Joke(props){
    if(props.fullJoke.question == undefined){
        console.log("inside if statement");
        return(null);
    }
    //What the display shit does is that if there is not question then nothing in the line is displayed, this is for jokes that are one liners
    return(
        <div>
        <p style={{display:props.fullJoke.question ? "block" : "none"}}>"{props.fullJoke.question}"" is the question and </p>  
        <p style={{color:"red"}}>"{props.fullJoke.answer}"" is the answer.</p>
        </div>
    )
};

export default Joke;