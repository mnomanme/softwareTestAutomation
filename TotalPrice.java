// Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee, then 400 tk will be discounted. After your purchase what will be your total cost

import java.util.Scanner;

public class TotalPrice {
  public static void main(String[] args) {
    System.out.println("Buy two shirt and 1 sharee you get 400TK discount");

    String str="Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee, then 400 tk will be discounted. After your purchase what will be your total cost?";
    str = str.replaceAll("[^\\d]", " ");
    str = str.trim();
    str = str.replaceAll(" +", " ");
    String[] arr=(str.split(" "));

    int shirtQuantity = Integer.parseInt(arr[0]) ;
    int shirtPrice = Integer.parseInt(arr[2]) ;
    int shareeQuantity = Integer.parseInt(arr[1]); 
    int shareePrice = Integer.parseInt(arr[3]) ;
    int discountPrice = Integer.parseInt(arr[4]) ;

    int totalShirtPrice = shirtQuantity * shirtPrice;
    int totalShareePrice = shareeQuantity * shareePrice;
    int orginalPrice = (totalShirtPrice + totalShareePrice) - discountPrice;

    System.out.println("Total cost: " + orginalPrice);
    
    /* 
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
    */
  }
}
