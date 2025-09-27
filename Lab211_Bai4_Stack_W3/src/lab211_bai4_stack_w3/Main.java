/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab211_bai4_stack_w3;

/**
 *
 * @author dinhh
 */
public class Main {
    public static void main(String[] args) {
        Validator val = new Validator();
        Stack_Assigment stack = new Stack_Assigment();

        while (true) {
            System.out.println("\n--- STACK MENU ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Get (peek)");
            System.out.println("4. Display stack");
            System.out.println("0. Exit");
            int choice = val.getInt("Choose: ");

            switch (choice) {
                case 1 -> stack.push(val.getInt("Enter number to push: "));
                case 2 -> stack.pop();
                case 3 -> {
                    Integer top = stack.get();
                    if (top != null) System.out.println(">> Top element: " + top);
                }
                case 4 -> stack.display();
                case 0 -> {
                    System.out.println("Exit program!");
                    return;
                }
                default -> System.out.println(">> Invalid choice, try again!");
            }
        }
    }
}