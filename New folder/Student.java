public class Student {
 private String name;
 private String address;
 private int age;
 private int number;

    public Student(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number < 0 || String.valueOf(number).length() != 10){
            System.out.println("error ");
        }
        this.number = number;
    }
 void display(){

 }
    public static void main(String[] args) {
        Student stu = new Student("sdds","efd",22);
        stu.setNumber(66);
        System.out.println(stu);
        System.out.println(stu.getNumber());
    }
}
