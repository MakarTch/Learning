import React from 'react'
import ReactDOM from "react-dom"

class AppAPI extends React.Component{
    constructor(){
        super()
        this.state={}
    }

    componentDidMount(){
        fetch("https://swapi.dev/api/people/1")
            .then(response => response.json())
            .then(data => {
                this.setState({character:data})
            })
    }

    render(){
        return(
            <div>
                Text
            </div>
        )
    }
}
export default AppAPI