import React from 'react';
import ComponetPropertiesButtom from '../components/Button1';

let item = ['Item 1', 'Item 2','Item 3', 'Item 4','Item 5'];
let itemList = [];
item.forEach((item, index) => {
    itemList.push(
        <ComponetPropertiesButtom id={index} text={item}
        urlProduct="https://definicion.de/wp-content/uploads/2009/06/producto.png" />
    )
})
function PaginaConComponenteReusable() {
    return (
        <div> 
            <h2>item</h2>
                {itemList}
        </div>
    );
}
export default PaginaConComponenteReusable;