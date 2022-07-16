import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BazarList {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter your products name: ");

    String itemsName = input.nextLine();

    searchItem(itemsName);
    input.close();
  }

  public static void searchItem(String itemsName) {
    HashMap <String, Integer> itemsList = new HashMap<>();
    
    itemsList.put("alu", 35);
    itemsList.put("piyaj", 45);
    itemsList.put("begun", 30);
    itemsList.put("kacamorich", 25);

    int result = 0;
     
    if (itemsList.containsKey(itemsName))
    {
      result = itemsList.get(itemsName);
      System.out.println("Items price: " + result);
    }
    else
    {
        System.out.println("No items found");
    }
  }
}
