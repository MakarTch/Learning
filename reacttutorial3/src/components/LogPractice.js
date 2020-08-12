import React from "react"
import ReactDOM from "react-dom"

class LogPractice extends React.Component{
    constructor(){
        super()
        this.state={
            loggedIn:true
        }
    }
    render(){
        let loginStatus = (this.state.loggedIn) ? "in" : "out"
        return(
            <p>I am logged {loginStatus}</p>
        )
    }
}

export default LogPractice