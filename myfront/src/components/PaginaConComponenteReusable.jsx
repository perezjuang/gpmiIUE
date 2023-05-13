import React from "react";
import ComponentPropertiesButton from './button1';

let items = ['Item 1', 'Item 2', 'Item 3', 'Item 4', 'Item 5'];
let itemList = [];
items.forEach((item, index) => {
    itemList.push(

        <ComponentPropertiesButton id={index} text={item}
        urlProduct="https://definicion.de/wp-content/uploads/2009/06/producto.png" />
    )
})
function PaginaConComponenteReusable() {
    return (
        <div>
            <h2>items</h2>
                {itemList}
        </div>
    );
}
export default PaginaConComponenteReusable;
 