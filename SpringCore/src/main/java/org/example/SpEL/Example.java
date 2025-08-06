package org.example.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Example {
    @Value("#{7>9?8:9}")
    private int x;
    @Value("#{20+25}")
    private int y;
    @Value("#{T(java.lang.Math).sqrt(144)}")
    private double z;
    @Value("#{new java.lang.String('Hello!, World.')}")
    private String name;
    @Value("#{5>2}")
    private boolean notBath;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public boolean isNotBath() {
        return notBath;
    }

    public void setNotBath(boolean notBath) {
        this.notBath = notBath;
    }

    @Override
    public String toString() {
        return "Example{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", notBath=" + notBath +
                '}';
    }
}
