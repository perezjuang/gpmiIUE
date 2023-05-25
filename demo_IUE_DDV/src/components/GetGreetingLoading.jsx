import React, {useState, useEffect } from "react";
import axios from "axios";
const GetGreetingLoading  = () => {
    const apiUrl = "http://localhost:8080/";
    const GreetingData = [{id: 1,content: "Sin Contenido"},];
    const [greeting, setGretting] = useState(GreetingData);
    const [showLoading, setShowLoading] = useState(true);
    useEffect(() => {
        const fetchData = async () => {
            setShowLoading(true);
            const result = await axios(apiUrl + "greetingSleep?name=Daniel");
            setGretting(result.data);
            setShowLoading(false);
        };
        fetchData();
    },[]);
    if (showLoading){
        return <div class="progress">
            greeting is Loading....
        </div> 
    }
    else {
        return <h1>{greeting.content}</h1>
    }
};
export default GetGreetingLoading;