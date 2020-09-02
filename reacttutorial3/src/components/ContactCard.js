import React from "react";
import ReactDOM from "react-dom";

function ContactCard(props){
    return(
        <p>{props.name} is my name, my phone number is {props.phone} and my email is {props.email}.</p>
    )
}

export default ContactCard;