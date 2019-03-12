package Guleri;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please choose what you want to do with any two numbers:" +
                "\n1. addition\n" +
                "2. subtract\n" +
                "3. multiply\n" +
                "4. division\n");

        int choice = input.nextInt();

        System.out.println(choice);
        if (choice > 0 && choice < 5) {
            System.out.println("\nenter the felseirst number");
            int num1 = input.nextInt();
            System.out.println("enter the second number");
            int num2 = input.nextInt();
            switch (choice) {
                case 1:
                    int Add = num1 + num2;
                    System.out.println(num1 + "+" + num2 + "=" + Add);
                    break;
                case 2:
                    int Sub = num1 - num2;
                    System.out.println(num1 + "-" + num2 + "=" + Sub);
                    break;
                case 3:
                    int Mul = num1 * num2;
                    System.out.println(num1 + "*" + num2 + "=" + Mul);
                    break;
                case 4:
                    double Div = (double)num1 / (double)num2;
                    System.out.println(num1 + "/" + num2 + "=" + Div);
                    break;
                default:
                    System.out.println("Invalid Value");
                    break;
            }
        } else {
            System.out.println("Invalid Value");
        }


    }
}
