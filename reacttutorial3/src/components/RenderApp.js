import React from "react"
import ReactDOM from "react-dom"
import { render } from "@testing-library/react"

class RenderApp extends React.Component{
    constructor(){
        super()
        this.state = {
            answer:"yes"
        }
    }

    render(){
        return(
            <div>
                <p>Is my thang working? {this.state.answer}</p>
            </div>
        )
    }
}

export default RenderApp