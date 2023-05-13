import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
// import App from './App';
import MyComponentStateless from './components/Stateless';
import MyComponentStateful from './components/Stateful';
import HolaMundoExtend from './components/CompHolaMundoExtend';
// import MyComponentGetGreeting from './components/GetGreeting';
import  ComponentButton  from './components/Button';
import ComponentPropertiesButton from './components/Button1';
import UsandoComponeneteReusable from './components/PaginaConComponenteReubsable';
import ComponenteTodoPage from './components/TodoPage';
import ComponentGetGreetingLoading from './components/GetGreetingLoading';
import reportWebVitals from './reportWebVitals';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <MyComponentStateless />
    <MyComponentStateful />
    <HolaMundoExtend />
    <ComponentPropertiesButton text = 'Soy un boton reusable' 
                               urlProduct="https://definicion.de/wp-content/uploads/2009/06/producto.png"
                               />
    <ComponentPropertiesButton text = 'Soy un boton reusable 2' 
                               urlProduct="https://definicion.de/wp-content/uploads/2009/06/producto.png"
                               />
    <ComponentButton/>                         
    <UsandoComponeneteReusable/>
    <ComponenteTodoPage/>
    <ComponentGetGreetingLoading/>
    {/* <ComponentButton></ComponentButton> */}
    {/* <MyComponentGetGreeting /> */}

  </React.StrictMode>
);


reportWebVitals();
