import java.util.Scanner;

public class FindVowels {
  public static void main(String[] args) {
    System.out.println("Write roadtosdet your input field to check vowel: ");
    int count = 0;
    
    System.out.println("Enter your word: ");
    
    Scanner input = new Scanner(System.in);
    String words = input.nextLine();

    for (int i = 0; i < words.length(); i++) {
      char ch = words.charAt(i);

      if (ch == 'a'|| ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u'|| ch == ' ') {
        count++;
      }
    }
    System.out.println(count);
    input.close();
  }
}
