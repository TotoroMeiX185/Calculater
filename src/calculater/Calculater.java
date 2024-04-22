/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculater;

import java.util.Locale;
import java.util.Scanner;


public class Calculater {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double num1, num2;
        double result = 0;
        int choice;
        
        System.out.println("Simple Calculator");
        System.out.println("Choose an operation");
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
        System.out.println("5: Exit");
        
        do {
            System.out.println("Enter choice (1/2/3/4/5):");
        choice = sc.nextInt();
        
        if (choice == 5){
            System.out.println("Existing Program.");
            break;
        }
        System.out.println("Enter first number: ");
        num1 =sc.nextDouble();
        
        System.out.println("Enter second number: ");
        num2 = sc.nextDouble();
        
        switch(choice){
            case 1 :
                result = num1 + num2;
                System.out.printf("Result: %.2f\n", result);
                break;
            case 2 :
                result = num1 - num2;
                System.out.printf("Result: %.2f\n", result);
                break;
            case 3 :
                result = num1 * num2;
                System.out.printf("Result: %.2f\n", result);
                break;
            case 4 :
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.printf("Result: %.2f\n", result);
                    } else {
                    System.out.println("Division by zero is not allowed.");
                    }
                break;
            default:
                System.out.println("Invalid choice. Please select a valid oprtaion.");
                
        }
        } while (choice != 5);
        
        sc.close();
        }
    
}
