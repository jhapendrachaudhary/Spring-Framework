import React, { useState } from 'react';
import { useNavigate, useParams } from 'react-router-dom';
import { useEffect } from 'react';


const UpdateUser = () => {
    const {id} = useParams(); 
    const navigate = useNavigate();
    // Assuming you are using react-router-dom to get the ID from the URL
  // State variables for form fields
  const [name, setName] = useState('');
  const [email, setEmail] = useState('');
  const [phone, setPhone] = useState('');
  const [department, setDepartment] = useState('');
  const [errors, setErrors] = useState({});


  useEffect(() => {
    const fetchEmployee = async () => {
        try {
            const response = await fetch(`http://localhost:8080/api/employee/${id}`);
            const data = await response.json();
            setDepartment(data.department);
            setEmail(data.email);
            setName(data.name);
            setPhone(data.phone);

            // Check if the response is successful
            if (!response.ok) {
                throw new Error('Failed to fetch employee data');
            }
        } catch (error) {
            console.error('Error fetching employee data:', error);
            
        }
        
  }
    fetchEmployee();
  }, [id]); // Fetch employee data when the component mounts or when the ID changes
  // Handle form submission
  const handleSubmit = async (e) => {
    e.preventDefault();

    try {
        const response = await fetch(`http://localhost:8080/api/employee/${id}`,{
            method: "PATCH",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify({ name, email, phone, department })
        });

        const data = await response.json();
        console.log(data);

        navigate("/");
        
    }catch (error) {
        console.error("Error:", error);
        // Handle error (e.g., show an error message)
        
    }

    // Validate form fields
    const validationErrors = {};
    if (!name) validationErrors.name = 'Name is required';
    if (!email) validationErrors.email = 'Email is required';
    if (!phone) validationErrors.phone = 'Phone number is required';
    if (!department) validationErrors.department = 'Department is required';

    // If there are validation errors, show them
    if (Object.keys(validationErrors).length > 0) {
      setErrors(validationErrors);
      return;
    }

    // If no errors, handle form submission logic
    console.log('Form submitted successfully!');
    console.log({ name, email, phone, department });

    // Clear form after submission (optional)
    setName('');
    setEmail('');
    setPhone('');
    setDepartment('')
};
return (
    <div className="container">
      <h2>Update Employee</h2>
      <form onSubmit={handleSubmit}>
        <div className="mb-3">
          <label htmlFor="name" className="form-label">
            Name
          </label>
          <input
            type="text"
            id="name"
            className="form-control"
            value={name}
            onChange={(e) => setName(e.target.value)}
            placeholder="Enter your name"
          />
          {errors.name && <div className="text-danger">{errors.name}</div>}
        </div>

        <div className="mb-3">
          <label htmlFor="email" className="form-label">
            Email
          </label>
          <input
            type="email"
            id="email"
            className="form-control"
            value={email}
            onChange={(e) => setEmail(e.target.value)}
            placeholder="Enter your email"
          />
          {errors.email && <div className="text-danger">{errors.email}</div>}
        </div>

        <div className="mb-3">
          <label htmlFor="phone" className="form-label">
            Phone
          </label>
          <input
            type="text"
            id="phone"
            className="form-control"
            value={phone}
            onChange={(e) => setPhone(e.target.value)}
            placeholder="Enter your phone number"
          />
          {errors.phone && <div className="text-danger">{errors.phone}</div>}
        </div>

        <div className="mb-3">
          <label htmlFor="department" className="form-label">
            Department
          </label>
          <select
            id="department"
            className="form-control"
            value={department}
            onChange={(e) => setDepartment(e.target.value)}
          >
            <option value="">Select Department</option>
            <option value="HR">HR</option>
            <option value="Engineering">Engineering</option>
            <option value="Sales">Sales</option>
            <option value="Marketing">Marketing</option>
          </select>
          {errors.department && <div className="text-danger">{errors.department}</div>}
        </div>

        <button type="submit" className="btn btn-primary">
          Submit
        </button>
      </form>
    </div>
  );

}
export default UpdateUser;