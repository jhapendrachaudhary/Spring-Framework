package org.example.BeanLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class UsingAnnotation {
    private String interest;

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    @Override
    public String toString() {
        return "UsingAnnotation{" +
                "interest='" + interest + '\'' +
                '}';
    }
    @PostConstruct
    public void init() {
        System.out.println("Initializing UsingAnnotation bean.");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Destroying UsingAnnotation bean.");
    }


}
