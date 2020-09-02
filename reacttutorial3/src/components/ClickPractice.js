import React from "react"
import ReactDOM from "react-dom"


class ClickPractice extends React.Component{
    constructor(){
        super()
        this.state={
            count:0
        }
        this.clickFunction = this.clickFunction.bind(this)
    }

    clickFunction(){
        this.setState(prevState =>{
            return{
                count: prevState.count + 1
            }
        })
    }

    render(){
        return(
            <div>
                <p>{this.state.count}</p>
                <button onClick={this.clickFunction}>Click</button>
            </div>
        )
    }
}

export default ClickPractice;