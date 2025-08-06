package org.example.Reference;

public class ClassB {
    private int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x= x;
    }

    @Override
    public String toString() {
        return "ClassB{" +
                "x=" + x +
                '}';
    }
}
