// Write a program that will count how many vowels in the given string

public class ReplaceString {
  public static void main(String[] args) {
    String nameString ="Ratul and Rahim lives in Rangpur";
        char[] chars= nameString.toCharArray();
        chars[10]='F';

        StringBuilder newString = new StringBuilder();

        for(int i = 0; i < chars.length; i++)
        {
            newString.append(chars[i]);
        }

        System.out.println(newString);
  }
}
