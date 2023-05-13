import React from "react";
function Button1(props){
    return (
        <div>
            <button key={props.text} type="Button">{props.text}</button>
            <img src={props.urlProduct} alt="" width="50px" height="50px"></img>
        </div>
    )
};
export default Button1;