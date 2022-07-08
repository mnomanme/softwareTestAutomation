    // Write a program to check balance and withdraw money from ATM booth using if else or switch case

import java.util.Scanner;

public class BoothCollection {
  public static void main(String[] args) {
    System.out.println("Welcome to your booth collection");

    double amount = 5000.50, newAmount = 0.00, deposit = 0.00, withdraw = 0.00;
    
    System.out.println("Menu");
    System.out.println("1. Check Balance");
    System.out.println("2. Withdraw Balance");
    System.out.println("3. Deposit Balance");
    System.out.println("4. Exit");
    System.out.println("Enter your choice");

    Scanner scanner = new Scanner(System.in);
    int choice = scanner.nextInt();

    if (choice == 1) {
      System.out.println("Your current balance is:" + " " + amount);
    } else if (choice == 2) {
      System.out.println("Your current balance is:" + " " + amount);
      System.out.println("Enter your withdraw amount:" + " ");

      withdraw = scanner.nextDouble();

      System.out.println("your withdraw amount" + " " + withdraw);

      if (withdraw > amount) {
        System.out.println("You don't have sufficient balance");
      } else {
        newAmount = amount - withdraw;
        System.out.println("Your current balance is:" + " " + newAmount);
      }
    } else if (choice == 3) {
      System.out.println("Enter the amount you want to deposit:");
      deposit = scanner.nextDouble();
      System.out.println("your deposit amount is:" + " " + deposit);
      amount += deposit;
      System.out.println("Your current balance is:" + " " + amount);
    } else if (choice == 4) {
      System.out.println("Thank you for using our service");
    } else {
      System.out.println("Enter correct choice and try again");
    }
    scanner.close();
  }
}