import React, {useState, useEffect} from "react";
//UseState: Declarar una variable de estado lo que permite al componente reaccionar a cambios y ser renderizado segun sea necesario
//useEffect: Ejecuta código en respuesta a cambios en el componente (solicitudes HTTP -- Componente se desmonta)
import axios from "axios";

const GetGreetingLoading = () => {
    const apiUrl = "http://localhost:8080/";
    const GreetingData = [{id: 1, content:"Sin contenido"},];
    const [greeting, setGreeting] = useState(GreetingData);
    //Permite declarar una variable de estado en un componente y proporciona una forma de actualizar este estado
    const [showLoading, setshowLoading] = useState(true);

    useEffect(() => {
        const fetchData = async () => {
            setshowLoading(true);
            const result = await axios(apiUrl + "greetingSleep?name=Gio");
            setGreeting(result.data);
            setshowLoading(false);
        };
        fetchData();
    },[]);
    if (showLoading){
        return <div class = "progress">
            greeting is loading...
        </div>
    }else{
        return <h1>{greeting.content}</h1>
    }
};
export default GetGreetingLoading;