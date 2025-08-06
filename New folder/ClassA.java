public class ClassA {
    private int age;
    void display(){
        System.out.println(this.age);}

    public void setAge(int age) {
        if (age<= 0){
            System.out.println("Please enter the valid age");
        }
        else {
            this.age = age;
            System.out.println(age);
        }
    }
    public int getAge(){
    return age;
    }

    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.setAge(-1);

    }
}
