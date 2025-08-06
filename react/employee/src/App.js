
import './App.css';
import Header from "./pages/header/header";
import {Route, Routes } from "react-router-dom";
import Dashboard from "./pages/dashboard/dashboard";
import NoMatch from "./pages/nomatch/NoMatch";
import PostUser from './pages/employee/PostUser';
import Updateuser from './pages/employee/UpdateUser';

function App() {
  return (
    <>  
    <Header />
    <Routes>
    <Route path="/" element={<Dashboard />} />
    <Route path="/post" element={<PostUser />} />
    <Route path="/employee/:id" element={<Updateuser />} />
    <Route path="*" element={<NoMatch />} />
    </Routes>
    </>
  );
}

export default App;
