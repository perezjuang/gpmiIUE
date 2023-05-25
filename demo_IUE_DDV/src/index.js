import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import MyComponentStateless from './components/Stateless';
import MyComponentStateful from './components/Stateful';
import CompHolaMundoExtend from './components/CompHolaMundoExtend';
import ComponentsPropiertiesButton from './components/Button1'
import PaginaConComponenteReusable from './components/PaginaConComponenteReusable';
import reportWebVitals from './reportWebVitals';
import GetGreeting from './components/GetGreeting';
import GetGreetingLoading from './components/GetGreetingLoading';
import TodoPage from './components/TodoPage';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <MyComponentStateless />
    <MyComponentStateful />
    <CompHolaMundoExtend />
    <ComponentsPropiertiesButton text="soy un boton reusable 1"
                  urlProduct="https://definicion.de/wp-content/uploads/2009/06/producto.png"
    />
    <ComponentsPropiertiesButton text="soy un boton reusable 2"
                  urlProduct="https://definicion.de/wp-content/uploads/2009/06/producto.png"
    />
    <PaginaConComponenteReusable/>
    <GetGreeting/>
    <GetGreetingLoading/>
    <TodoPage/>
  </React.StrictMode>
);
ReactDOM.render(
  <App />,  
   document.getElementById("root")
);


// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
