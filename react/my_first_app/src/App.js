import React from 'react';
import { ToastContainer, toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
import Home from './components/Home';
import Course from './components/Course';

function App() {
  const notify = () => toast.success("🚀 Hello from Toast!");

  return (
    <div className="container mt-4">
     

      <ToastContainer position="top-center" autoClose={3000} theme="colored" />
      
      <Home />
      <Course course={{title: "Java Course", description: "This is java course."}} />
    </div>
  );
}

export default App;
