// Core i 7 HP laptop price is 76000 tk and cash payment discount 10%. What will be the purchase price

public class PurchasePrice {
  public static void main(String[] args) {
    String str="Core i 7 HP laptop price is 76000 tk and cash payment discount 10%. What will be the purchase price?";
    str = str.replaceAll("[^\\d]", " ");
    str = str.trim();
    str = str.replaceAll(" +", " ");
    String[] arr=(str.split(" "));

    // int laptopPrice = 76000;
    // double discountPrice = laptopPrice * 0.10;

    int laptopPrice = Integer.parseInt(arr[1]);
    int discount = Integer.parseInt(arr[2]);
    double discountPrice = (laptopPrice * discount)  / 100;
    int purchasePrice = laptopPrice - (int)discountPrice;

    System.out.println("Purchase price: " + purchasePrice);
  }
}
