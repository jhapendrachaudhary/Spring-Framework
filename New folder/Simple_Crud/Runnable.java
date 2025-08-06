package Simple_Crud;

import java.util.Scanner;

public class Runnable {
    StudentServiceImpl service;
    Runnable(){
        Scanner sc = new Scanner(System.in);
        service = new StudentServiceImpl();
        int choice;

            System.out.println("\n--- Student CRUD Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    service.insert();
                    break;
                case 2:
                    service.read();
                    break;
                case 3:
                    service.update();
                    break;
                case 4:
                    service.delete();
                    break;
                case 5:
                    System.out.println("Exiting... Bye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
    }
public static void main(String[] args) {
Runnable run = new  Runnable();

}


}

