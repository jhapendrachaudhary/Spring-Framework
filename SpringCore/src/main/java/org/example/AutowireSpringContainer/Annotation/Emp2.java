package org.example.AutowireSpringContainer.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp2 {
    private Address employee;

    public Address getEmployee() {
        return employee;
    }

    @Autowired
    @Qualifier("address")
    public void setEmployee(Address employee) {
        this.employee = employee;
        System.out.println("Invoked Setter method");
    }
public Emp2(){
        super();
}

    public Emp2(Address employee) {
        this.employee = employee;
        System.out.println("Invoked Constructor");
    }

    @Override
    public String toString() {
        return "Emp{" +
                "employee=" + employee +
                '}';
    }
}
