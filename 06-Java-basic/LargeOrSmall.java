//  Write a program to enter the numbers till the user wants and at the end, the program should display the largest and smallest numbers user entered

import java.util.Scanner;

public class LargeOrSmall {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int numbers, largeNumber = Integer.MIN_VALUE, smallNumber = Integer.MAX_VALUE;

    char choice;

    try {
        do {
        System.out.println("Enter the number:");
        numbers = scanner.nextInt();

        if (numbers > largeNumber) {
        largeNumber = numbers;
        }
        if (numbers < smallNumber) {
        smallNumber = numbers;
        }

        System.out.println("your enter number is:" + " " + numbers);
        System.out.println("Do you want to continue y/n?");
        choice = scanner.next().charAt(0);
    }
        while (choice == 'y' || choice == 'Y');
        System.out.println(largeNumber + " " + "is largest number");
        System.out.println(smallNumber + " " + "is smallest number");

        scanner.close();
    } catch (Exception e) {
        System.out.println("Enter valid number");
    }
  }
}