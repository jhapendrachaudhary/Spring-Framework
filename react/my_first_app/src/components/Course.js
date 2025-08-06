import React from "react";
import {Card, CardBody, CardTitle, CardText, Button, Container} from "reactstrap";

const Course=({course})=>{
    return (
        <Card>
            <CardBody className="text-center">
                <CardTitle tag="h2" >{course.title}</CardTitle>
                <CardText >{course.description}</CardText>
                <Container className="d-flex justify-content-center">
                    <Button color="primary" outline className="mx-2">Delete</Button>
                    <Button color="primary" outline className="mx-2">Update</Button>
                    </Container>
                
            </CardBody>
        </Card>

    )
}
export default Course;