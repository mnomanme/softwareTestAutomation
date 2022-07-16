//  Write a program to check if input letter is small or capital

import java.util.Scanner;

public class FindLetter {
  public static void main(String[] args) {
    System.out.println("Find your alphabet letter program");

    char myLetter;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter your favorite letter: ");
    myLetter = scanner.next().charAt(0);

    if (myLetter >= 'A' && myLetter <= 'Z') {
      System.out.println(myLetter + " " + "is capital letter");
    } else if (myLetter >= 'a' && myLetter <= 'z') {
      System.out.println(myLetter + " " + "is small letter");
    } else {
      System.out.println(myLetter + " " + "is not a letter");
    }

    scanner.close();

  }
}