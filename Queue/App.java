package Queue;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        Queue list= new Queue();

        System.out.print("How many people do you want to add? : ");
        int count = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < count; i++) {

            System.out.println("\n--- " + (i+1) + ". contact information ---");

            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Department: ");
            String department = scanner.nextLine();

            list.enqueue(id, name, department);
        }

        System.out.println("\n--- Queue content ---");
        list.display();


        list.dequeue();

        list.display();

        list.peek();



    }
}
