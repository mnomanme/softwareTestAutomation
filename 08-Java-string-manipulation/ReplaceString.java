import java.util.Scanner;

public class ReplaceString {
  public static void main(String[] args) {
    System.out.println("Input this text: \nRatul and Rahim lives in Rangpur");

    System.out.println("Enter given text: ");

    Scanner input = new Scanner(System.in);

    String oldString = input.nextLine();

    String replaceString = oldString.replace("Rahim", "Fahim");

    System.out.println(replaceString);

    input.close();
  }

}
