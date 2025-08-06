import {useState,useEffect} from "react";
import { Table } from "react-bootstrap";
import React from 'react';
import { useNavigate } from "react-router-dom";

const Dashboard = () => {
    const navigate = useNavigate();
    const [employee, setEmployees] = useState([]);

    useEffect( () =>{
        const fetchEmployees = async () => {
            try {
                const response = await fetch('http://localhost:8080/api/employee');
                const data = await response.json();
                setEmployees(data);
            } catch (error) {
                console.error("Error fetching employees:", error);
            }
        };
        fetchEmployees();
    },[])

    const handleDelete = async (id) => {
        try {
            const response = await fetch(`http://localhost:8080/api/employee/${id}`, {
                method: 'DELETE',
            });
            if (response.ok) {
                setEmployees((prevEmployees) => prevEmployees.filter((employee) => employee.id !== id));
            } else {
                console.error('Failed to delete employee:', response.statusText);
            }
        } catch (error) {
            console.error('Error deleting employee:', error);
        }
    }

    const handleEdit = async (id) => {
        try {
           navigate(`/employee/${id}`);
           
        } catch (error) {
            console.error('Error editing employee:', error);
        }
    }

  return (
    <React.Fragment>

      <div className="container mt-5">
      <Table striped>
  <thead>
    <tr>
      <th>
        #
      </th>
      <th>
        Name
      </th>
      <th>
      Email
      </th>
      <th>
        Phone
      </th>
      <th>
        Department
      </th>
      <th>
        Action
      </th>
    </tr>
  </thead>
  <tbody>
  {employee.map((employee) => (
    <tr key={employee.id}>
      <th scope="row">
        {employee.id}
      </th>
      <td>
        {employee.name}
      </td>
      <td>
        {employee.email}
      </td>
      <td>
        {employee.phone}
      </td>
      <td>
        {employee.department}
      </td>
        <td className="d-flex gap-2">
            <button className="btn btn-danger" onClick={() => handleDelete(employee.id)}>Delete</button>
            <button className="btn btn-primary" onClick={() => handleEdit(employee.id)}>Edit</button>
        </td>
    </tr>
  ))}
    
  </tbody>
</Table>
      </div>
    </React.Fragment>
  );
};

export default Dashboard;
