package org.example.ConstructorInjection;

import java.util.List;
import java.util.Map;

public class Person {
    private String name ;
    private int personId;
    private Documentation doc;
    private List<String> jobs;
    private Map<String,String> previousJobs;


    public Person(Documentation doc, List<String> jobs, String name, int personId, Map<String, String> previousJobs) {
        this.doc = doc;
        this.jobs = jobs;
        this.name = name;
        this.personId = personId;
        this.previousJobs = previousJobs;
    }

    @Override
    public String toString() {
        return "Person{" +
                "doc=" + doc +
                ", name='" + name + '\'' +
                ", personId=" + personId +
                ", jobs=" + jobs +
                ", previousJobs=" + previousJobs +
                '}';
    }
}
