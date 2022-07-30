// Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee, then 400 tk will be discounted. After your purchase what will be your total cost

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

  }
}
