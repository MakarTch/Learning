import React from "react";
import ReactDOM from "react-dom";
import ContactCard from "./ContactCard";


function ContactInfo(){
    return(
        <div>
        <ContactCard
        name= "Makar"
        email= "Makar.Tchekalenkov@gmail.com"
        phone="347-623-7243"
        />
        <ContactCard
        name="James"
        email="Email@google.com"
        phone="123-456-7895"
        />
        </div>
    )
};

export default ContactInfo;