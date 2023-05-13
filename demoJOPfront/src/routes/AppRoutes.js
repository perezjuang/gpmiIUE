import React from "react";

import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";

import Layout from '../container/LayoutPrincipal/LayoutPrincipal';
import Home from '../components/home/Home';
import State from '../components/state/State';
import NotFound from '../components/notfound/NotFound';

const AppRoutes = () => {
    <Router>
        <Layout>
            <Routes>
                <Route path="/" exact element={<Home/>}/>
                <Route path="/State" exact element={<State/>}/>
                <Route element= {<NotFound/>}/>
            </Routes>
        </Layout>
    </Router>
};

export default AppRoutes;