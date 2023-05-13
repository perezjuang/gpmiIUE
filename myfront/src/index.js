import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
//import App from './App';
import MyComponentStateless from './components/Stateless';
import MyComponentStateFul from './components/Stateful';
import MyCompHolaMundoExtend  from './components/CompHolaMundoExtend';
import MyCompGetGreeting from './components/GetGreeting';
import ComponentPropertiesButton from './components/button1';
import UsandoComponenteReusable from './components/PaginaConComponenteReusable';
import ComponentButton from './components/Button';
import ComponentTodoPage from './components/TodoPage';
import MyCompGetGreetingLoading from './components/GetGreetingLoading';
import reportWebVitals from './reportWebVitals';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <MyComponentStateless />
    <MyComponentStateFul />
    <MyCompHolaMundoExtend />
    <MyCompGetGreeting />
    <ComponentPropertiesButton text="Soy un boton reusable 1"
                  urlProduct="https://definicion.de/wp-content/uploads/2009/06/producto.png" 
                  />
    <ComponentPropertiesButton text="Soy un boton reusable 2"
                  urlProduct="https://definicion.de/wp-content/uploads/2009/06/producto.png" 
                  />
    <ComponentButton/>
    <ComponentTodoPage/>
    
    <UsandoComponenteReusable/>
    <MyCompGetGreetingLoading/>
  </React.StrictMode>
);

reportWebVitals();
