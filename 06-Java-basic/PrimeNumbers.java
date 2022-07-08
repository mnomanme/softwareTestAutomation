//  Write a program to print prime numbers from 2 to n

import java.util.Scanner;

public class PrimeNumbers {
  public static void main(String[] args) {
    System.out.println("Find only prime number program");

    try {
    int i = 0, num = 0;
    String primeNumbers = "";

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number:");

    int n = scanner.nextInt();
    scanner.close();

    for (i = 2; i <= n; i++) {
      int counter = 1;
      for (num = i; num >= 2; num--) {
        if (i % num == 0) {
          counter += 1;
        }
      }
      if (counter == 2) {
        primeNumbers += i + " ";
      }
    }

    System.out.println(primeNumbers);
    } catch (Exception e) {
    System.out.println("Enter valid numbres");    }
  }
}