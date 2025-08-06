import React from 'react';
import { Button,Container } from 'reactstrap';

const Home = () => {
  return (
    <Container className="p-4 bg-light rounded shadow-sm text-center">
      <h1 className="text-primary" >Hello, World!</h1>
      <p className="lead">I am learning the React library with Bootstrap and Toastify.</p>
      <Button color='info' outline>Start using</Button>
    </Container>
  );
};

export default Home;
