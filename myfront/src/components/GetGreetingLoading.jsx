import React, { useState, useEffect} from "react";
import axios from "axios";

const GetGreetingLoading = () => {
    const apiUrl = "http://localhost:8080/";
    const GreetingData = [{ id: 1, content: "Sin contenido"},];
    const [greeting, setGreeting] = useState(GreetingData);
    const [showLoading, setshowLoading] = useState(true);
    
    useEffect(()=> {
        const fetchData = async () => {
            setshowLoading(true);
            const result = await axios(apiUrl + "greetingSleep?name=mauro");
            setGreeting(result.data);
            setshowLoading(false);
        };
        fetchData();
    }, []);
    if (showLoading) {
        return <div class="progress">
            greeting is loading....
        </div>
    }
    else {
        return <h1>{greeting.content}</h1>
    }
};
export default GetGreetingLoading;

