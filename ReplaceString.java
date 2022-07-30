// Write a program that will count how many vowels in the given string

import java.util.Scanner;
public class ReplaceString {
  public static void main(String[] args) {
    // System.out.println("Input this text: \nRatul and Rahim lives in Rangpur");

    // System.out.println("Enter given text: ");

    String nameString ="Ratul and Rahim lives in Rangpur";
        char[] chars= nameString.toCharArray();
        chars[10]='F';

        StringBuilder newString = new StringBuilder();

        for(int i = 0; i < chars.length; i++)
        {
            newString.append(chars[i]);
        }

        System.out.println(newString);

    /* 
    Scanner input = new Scanner(System.in);

    String oldString = input.nextLine();

    String replaceString = oldString.replace("Rahim", "Fahim");

    System.out.println(replaceString);

    input.close();
    */
  }

}
