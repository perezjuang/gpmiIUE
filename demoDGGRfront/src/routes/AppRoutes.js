import React from 'react';

import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";
import Layout from "../containers/app/LayoutPrincipal";
import Home from "../components/home/Home";
import Task from "../components/task/Task";
import NotFound from "../components/notfound/NotFound";

const AppRoutes = () => (
    <Router>
        <Layout>
            <Routes>
                <Route path='/' exact element={<Home/>} />
                <Route path='/Task' exact element={<Task/>} />
                <Route exact element={<NotFound/>} />
            </Routes>
        </Layout>
    </Router>
);
export default AppRoutes;