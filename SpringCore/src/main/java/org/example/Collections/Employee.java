package org.example.Collections;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
    private String name;
    private List<Long> phoneNo;
    private Set<String> address;
    private Map<String,String> course;
    private Properties pro;

    public Set<String> getAddress() {
        return address;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    public Map<String, String> getCourse() {
        return course;
    }

    public void setCourse(Map<String, String> course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Long> getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(List<Long> phoneNo) {
        this.phoneNo = phoneNo;
    }
public Properties getPro(){
        return  pro;
}
public void setPro(Properties pro){
        this.pro = pro;
}
    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                ", name='" + name + '\'' +
                ", phoneNo=" + phoneNo +
                ", course=" + course +
                '}';
    }
}
