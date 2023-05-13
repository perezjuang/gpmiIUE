import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
//import App from './App';
import MyComponentStateless from './components/Stateless';
import MyComponentStatefull from './components/Stateless';
import HolaMundoExtend from './components/CompHolaMundoExtend';
import ComponentPropertiesButton from './components/Button1';
import UsandoComponenteReusable from './components/PaginaConComponenteReusable';
import GetGretting from './components/GetGretting';
import reportWebVitals from './reportWebVitals';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <MyComponentStateless />
    <MyComponentStatefull />
    <HolaMundoExtend />
    <ComponentPropertiesButton text="Soy un botón reusable 1" urlProduct="https://definicion.de/wp-content/uploads/2009/06/producto.png"/>
    <UsandoComponenteReusable />
    <GetGretting />
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
