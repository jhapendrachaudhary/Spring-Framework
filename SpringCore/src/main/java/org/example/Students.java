package org.example;

public class Students {
    private String name;
    private int rollno;
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }


    public int getRollno() {
        return rollno;
    }
    public Students(String address, String name, int rollno) {
        this.address = address;
        this.name = name;
        this.rollno = rollno;
    }
    public Students(){
        super();
    }

    @Override
    public String toString() {
        return "Students{" +
                "address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", rollno=" + rollno +
                '}';
    }
}
