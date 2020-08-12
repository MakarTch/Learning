import React from "react";
import ReactDOM from "react-dom";
import JokeApp from "./JokeApp";
import Product from "./Product"
import products from "./vschoolProducts"

function ProductApp(){
    console.log(products);
    const productMap = products.map(product => <Product key={product.id} product={product}/>);
    console.log(productMap);
    return(
        {productMap}
    )
};

export default ProductApp;