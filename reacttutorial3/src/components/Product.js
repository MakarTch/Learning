import React from "react"
import ReactDOM from "react-dom"
import products from "./vschoolProducts"

function Product(props){
    return(
        <div>
        <input type="checkbox"/>
        <p>{props.product.description}</p>
        </div>
    )
}

export default Product;