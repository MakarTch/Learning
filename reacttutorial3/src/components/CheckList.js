import React from "react";
import ReactDOM from "react-dom";
import ChecklistItem from "./ChecklistItem";

function CheckList(){
    return(
        <div>
            <ChecklistItem/>
            <ChecklistItem/>
            <ChecklistItem/>
            <ChecklistItem/>
        </div>
    )
}

export default CheckList;