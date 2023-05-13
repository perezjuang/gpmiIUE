import React from "react";
const CompHolaMundoExtend = () => {
    const Hello = 'Hola Mundo!';
    const istrue = true;
    return (
        <div className="HolaMundo">
            <h1>{Hello}</h1>
            <h2>Curso escencial</h2>
            <img src="https://image.freepik.com/vector-gratis/fondo-tecnologia-cara-inteligencia-artificial-futurista_1017-18295.jpg" alt="react"/>
            {istrue ? <h4>Esto es verdad</h4> : <h5>Es falso</h5>}
            {istrue && <h4>Soy verdad</h4>}
        </div>
    )
}
export default CompHolaMundoExtend;