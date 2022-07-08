//  Write a program to sum of user input until users input ‘q’ from keyboard

import java.util.Scanner;

public class UserInput {
  public static void main(String[] args) {
    System.out.println("Sum of users program until users turn end");

    int i = 0;
    double num;
    double sum = 0;
    char choice = ' ';

    Scanner scanner = new Scanner(System.in);

    try {
      for (i = 1; i >= 1; i++) {

        System.out.println("Enter a number:" + " ");

        num = scanner.nextDouble();
        sum += num;
        i++;

        System.out.println("Do you want to exit? press q or continue press c");
        choice = scanner.next().charAt(0);
        if (choice == 'q') {
          break;
        } else if (choice == 'c') {
          continue;

        }
        scanner.close();
      }

    } catch (Exception e) {
      System.out.println("Please enter valid number or keyword");
    }
    // System.out.println("User enter total value is:" + " " + i);
    System.out.println("Sum of users" + " " + sum);

  }
}