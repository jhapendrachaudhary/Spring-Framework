package org.example.StandaloneCollections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
    private List<String> students;
    private Map<String, String> courses;
    private Properties benefits;

    public Properties getBenefits() {
        return benefits;
    }

    public void setBenefits(Properties benefits) {
        this.benefits = benefits;
    }

    public List<String> getStudents() {
        return students;
    }

    public void setStudents(List<String> students) {
        this.students = students;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Person{" +
                "benefits=" + benefits +
                ", students=" + students +
                ", courses=" + courses +
                '}';
    }
}
