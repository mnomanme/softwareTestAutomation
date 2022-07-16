public class PurchasePrice {
  public static void main(String[] args) {
    int laptopPrice = 76000;
    double discountPrice = laptopPrice * 0.10;
    int purchasePrice = laptopPrice - (int)discountPrice;

    System.out.println("Purchase price: " + purchasePrice);
  }
}
