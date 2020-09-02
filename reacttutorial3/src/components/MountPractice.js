import React from "react"
import ReactDOM from "react-dom"

class MountPractice extends React.Component{
    constructor(){
        super()
        this.state = {
            isLoading:true,
            unreadMessages:["a","b", "c"],
            loggedIn:true
        }
        this.buttonFunction=this.buttonFunction.bind(this)
    }

    buttonFunction(){
        this.setState(prevState => {
            return{
                loggedIn:!prevState.loggedIn
            }
        })
    }

    componentDidMount(){
        setTimeout(() => {
            this.setState({
                isLoading:false
            })
        },1500)
    }

    render(){
        let buttonDisplay = this.state.loggedIn? "Click to log out" : "Click to log in"
        return(
            <div>
                {this.state.isLoading ? <p>Loading...</p> : <p>Appear!</p>}
                {this.state.unreadMessages.length>0 &&<p>You have {this.state.unreadMessages.length} unread messages</p>}
                {this.state.loggedIn?<p>You are logged in</p>:<p>You are logged out</p>}
                <button onClick={this.buttonFunction}>{buttonDisplay}</button>
            </div>
        )
    }

}

export default MountPractice