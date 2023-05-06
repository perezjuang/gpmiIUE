import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
//import App from './App';
import MyComponentStateless from './components/Stateless';
import MyComponentStateFul from './components/Stateful';
import HolaMundoExtend from './components/CompHolaMundoExtend';
import reportWebVitals from './reportWebVitals';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
     <MyComponentStateless />
     <MyComponentStateFul />
     <HolaMundoExtend />
  </React.StrictMode>
);

reportWebVitals();
