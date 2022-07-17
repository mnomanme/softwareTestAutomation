public class TransactionID {
  public static void main(String[] args) {
    String htmlBody = "<html> + ' ' + <title> + ' ' + Test + ' ' + </title> + ' ' + <body> + ' ' + Your trnx is successful. + ' ' + Trnx Id is: TXN123456 + ' ' + </body> + ' ' + </html>";

    int findIndex = htmlBody.indexOf("TXN");

    System.out.println(htmlBody.substring(findIndex, 130));

  }
}
