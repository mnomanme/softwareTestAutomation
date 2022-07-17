// Writea program that will give following output: C8M

import java.util.Scanner;

public class CountryDivision {
  public static void main(String[] args) {
    System.out.println("Enter your district name: chattogram");

    Scanner input = new Scanner(System.in);
    String division;
    int index;

    System.out.println("Enter your district: ");
    division = input.nextLine();
 

    String firstIndex = String.valueOf(division.charAt(0)).toUpperCase();
    String secondIndex = String.valueOf(division.charAt(9)).toUpperCase();

    index = division.lastIndexOf('a');

    String result = firstIndex + index + secondIndex;

    System.out.println(result);

    input.close();

  }
}
