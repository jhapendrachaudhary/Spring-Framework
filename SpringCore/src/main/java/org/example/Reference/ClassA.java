package org.example.Reference;

public class ClassA {
    private int y;
    private ClassB obj;

    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
    public ClassB getObj(){
        return obj;
    }
    public void setObj(ClassB obj){
        this.obj=obj;
    }
    @Override
    public String toString(){
        return "ClassA() y = "+ y + "Object = " + obj ;
    }
}
