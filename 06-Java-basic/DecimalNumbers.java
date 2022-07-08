//  Input 2 decimal numbers and check if they are both same or different up to two decimal places

import java.util.Scanner;

public class DecimalNumbers {
  public static void main(String[] args) {
    System.out.println("Two decimal numbers check");

    try {
      Scanner scanner = new Scanner(System.in);
      double number1, number2;

      System.out.println("Enter first number");
      number1 = scanner.nextDouble();

      System.out.println("Enter second number");
      number2 = scanner.nextDouble();

      if (number1 == number2) {
        System.out.println("They are both same");
      } else {
        System.out.println("They are different up to two decimal places");
      }
      scanner.close();

    } catch (Exception e) {
      System.out.println("Enter valid number");
    }

  }
}