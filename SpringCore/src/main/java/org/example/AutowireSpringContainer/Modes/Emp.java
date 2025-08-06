package org.example.AutowireSpringContainer.Modes;

public class Emp {
    private Address employee;

    public Address getEmployee() {
        return employee;
    }

    public void setEmployee(Address employee) {
        this.employee = employee;
        System.out.println("Invoked Setter method");
    }
public  Emp(){
        super();
}
    public Emp(Address employee) {
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
