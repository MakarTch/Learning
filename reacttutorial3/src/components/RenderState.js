import React from "react"
import ReactDOM from "react-dom"

class RenderState extends React.Component{

    constructor(){
        super()
        this.state = {
            name:"Mak",
            age:23
        }
    }

    render(){
        return(
            <p>{this.state.name}'s age is {this.state.age}.</p>
        )
    }
}

export default RenderState