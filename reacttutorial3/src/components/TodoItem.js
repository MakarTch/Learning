import React from "react"

function TodoItem(props){
    let completedStyle ={
        fontStyle:"italic",
        color:"grey",
        textDecoration:"line-through"
    }


    return(
        <div>
            <input
                type="checkbox"
                checked ={props.item.completed?"checked":null}
                onChange={() => props.handleChange(props.item.id)}
            /> 
            <span style={props.item.completed ? completedStyle:null}>{props.item.text}</span>
        </div>
    )
}

export default TodoItem