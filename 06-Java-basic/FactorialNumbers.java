//  Write  a program to find the factorial of a given number

import java.util.Scanner;

public class FactorialNumbers {
  public static void main(String[] args) {
    System.out.println("Find your factorial number");

    try {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the number: ");

      int number = scanner.nextInt();
      int i = 1, factorial = 1;

      for (i = 1; i <= number; i++) {
      factorial = factorial * i;
      scanner.close();
    }
      System.out.println(number + " " + "factorial number is:" + " " + factorial);
    } catch (Exception e) {
      System.out.println("Enter valid number");
    }

  }
}