package org.example.BeanLifeCycle;

public class Books {
    private String name;
    private int price;

    public String getName() {

        return name;
    }

    public void setName(String name) {
        System.out.println("Hello, class");
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Books{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
    public void init(){
        System.out.println("This is init method");
    }
    public void  destroy(){
        System.out.println("This is destroy method");
    }

}

