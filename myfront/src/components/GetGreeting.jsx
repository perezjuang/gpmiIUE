import React, {useState, useEffect} from "react"
import axios from "axios";

const GetGreeting = () => {
    const apiUrl = "http://localhost:8080";

    const GreetingData =[
        {id: 1, content: "sin contenido"},
    ];
    const[greeting, setGretting] = useState(GreetingData);
    //const[showLoading, setShowLoading] = useState(true);

    useEffect(() => {
        const fetchData =async () => {
            const result = await axios(apiUrl + "greeting?name=Daniel");
            setGretting(result.data);
        };
        fetchData();
    },[]);

    return (
        <div className="container">
            <h1>{greeting.content}</h1>
        </div>
    );
};

export default GetGreeting;