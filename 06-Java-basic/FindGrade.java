//  Write a program to calculate GPA and find grade

import java.text.DecimalFormat;
import java.util.Scanner;

public class FindGrade {
  public static void main(String[] args) {
    System.out.println("Calculate GPA and find grade program");

    Scanner scanner = new Scanner(System.in);

    Integer totalScore = 0;
    Integer totalCredits = 0;
    Integer gradeValue = 0;

    boolean moreClasses = false;
    boolean validGrade = true;

    String grade = "";

    do {

      Integer credits = 0;
      boolean validCredits = true;
      do {
        validCredits = true;

        System.out.println("Enter number of credits:");
        String creditsString = scanner.nextLine();

        try {
          credits = Integer.parseInt(creditsString);
        } catch (NumberFormatException nfe) {
          System.out.println("Please enter a valid integer");
          validCredits = false;
        }
      }
      while (!validCredits);

      do {
        validGrade = true;

        System.out.println("Enter grade:");
        grade = scanner.nextLine();

        if (grade.equalsIgnoreCase("A")) {
          gradeValue = 4;
        } else if (grade.equalsIgnoreCase("B")) {
          gradeValue = 3;
        } else if (grade.equalsIgnoreCase("C")) {
          gradeValue = 2;
        } else if (grade.equalsIgnoreCase("D")) {
          gradeValue = 1;
        } else if (grade.equalsIgnoreCase("F")) {
          gradeValue = 0;
        } else {
          System.out.println("You didn't enter a valid grade");
          validGrade = false;
        }
      }
      while (!validGrade);

      Integer points = gradeValue * credits;

      totalScore += points;
      totalCredits += credits;

      System.out.println("Would you like to enter another class? (Y/N)");
      String moreClassesString = scanner.nextLine();

      moreClasses = moreClassesString.equalsIgnoreCase("Y");

    }
    while (moreClasses);

    DecimalFormat df = new DecimalFormat("0.00");

    Double gpa = Double.valueOf(totalScore) / Double.valueOf(totalCredits);

    System.out.println("Total Credits: " + totalCredits);
    System.out.println("Score: " + totalScore);
    System.out.println("GPA: " + df.format(gpa));

    if (gpa > 3 && gpa <= 4) {
      System.out.println("Your grade is: " + "A");
    } else if (gpa > 2 && gpa <= 3) {
      System.out.println("Your grade is: " + "B");
    } else if (gpa > 2 && gpa <= 3) {
      System.out.println("Your grade is: " + "C");
    } else if (gpa > 1 && gpa <= 2) {
      System.out.println("Your grade is: " + "D");
    } else {
      System.out.println("Your grade is: " + "F");
    }

    scanner.close();

  }
}