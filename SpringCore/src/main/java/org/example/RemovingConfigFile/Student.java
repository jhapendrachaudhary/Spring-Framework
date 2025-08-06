package org.example.RemovingConfigFile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Student {
    @Value("Hello, I am Student")
    private String description;
    private Paper paper;

    public Student(Paper paper) {
        paper.display();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Paper getPaper() {

        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    @Override
    public String toString() {
        return "Student{" +
                "description='" + description + '\'' +
                ", paper=" + paper +
                '}';
    }
}
