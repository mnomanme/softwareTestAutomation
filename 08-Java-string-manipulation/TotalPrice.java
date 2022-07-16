import java.util.Scanner;

public class TotalPrice {
  public static void main(String[] args) {
    System.out.println("Buy two shirt and 1 sharee you get 400TK discount");

    int shirtQuantity, shirtPrice = 1200;
    int shareeQuantity, shareePrice = 3500;
    int discountPrice = 400;
   
    Scanner input = new Scanner(System.in);
     System.out.println("Enter your shirt quantity");
     shirtQuantity = input.nextInt();
     System.out.println("Enter your Sharee quantity");
     shareeQuantity = input.nextInt();

     int totalShirtPrice = shirtQuantity * shirtPrice;
     int totalShareePrice = shareeQuantity * shareePrice;
     int orginalPrice = totalShirtPrice + totalShareePrice;

    if (shirtQuantity == 2 && shareeQuantity == 1) {
     int totalPrice = orginalPrice - discountPrice;
     System.out.println("Discount Total cost: " + totalPrice);
    }
    else{
      System.out.println("Orginal cost: " + orginalPrice);
    }
    input.close();
  }
}
