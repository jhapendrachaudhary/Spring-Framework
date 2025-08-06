package org.example.ConstructorInjection;

public class Documentation {
    private String BOC;
    private String NOC;

    public Documentation(String BOC, String NOC) {
        this.BOC = BOC;
        this.NOC = NOC;
    }

    @Override
    public String toString() {
        return "Documentation{" +
                "BOC='" + BOC + '\'' +
                ", NOC='" + NOC + '\'' +
                '}';
    }
}
