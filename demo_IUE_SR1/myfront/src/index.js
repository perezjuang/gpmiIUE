import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
//import App from './App';
import MyComponentStateless from './components/Stateless'
import MyComponentStateful from './components/Stateful'
import HolaMundoExtend from './components/CompHolaMundoExtend'
import ComponentPropertiesButton from './components/Button1';
import UsandoComponenteReusable from './components/PaginaConComponenteReusable';

import reportWebVitals from './reportWebVitals';
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <MyComponentStateless />
    <MyComponentStateful />
    <HolaMundoExtend/>
    <ComponentPropertiesButton text="Soy un boton reusable 1"
                    urlProduct="https://definicion.de/wp-content/uploads/2009/06/producto.png" 
                    />
    <ComponentPropertiesButton text="Soy un boton reusable 2"
                    urlProduct="https://definicion.de/wp-content/uploads/2009/06/producto.png" 
                    />
    <UsandoComponenteReusable/>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();