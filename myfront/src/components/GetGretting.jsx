import React, {useState, useEffect} from "react";
import axios from 'axios';

const GetGretting = () => {
    const apiUrl = "http://localhost:8080/";

    const GreetingData = [
        {id: 1, content: "Sin contenido"}
    ];

    const [greeting, setGreeting] = useState(GreetingData);
    const [showLoading, setShowLoading] = useState(true);

    useEffect(() => {
        const fetchData = async () => {
            const result = await axios(apiUrl + "greeting?name=Juan");
            setGreeting(result.data);
        };
    }, []);
    
    return (
        <div className="Container">
            <h1>{greeting.content}</h1>
        </div>
    );
};
export default GetGretting;