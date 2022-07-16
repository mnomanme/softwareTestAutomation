import java.util.Scanner;

public class AverageOddEven {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter the size of array:");

    int number = input.nextInt();

    double total = 0;
    double array[] = new double[number];

    System.out.println("Enter the elements one by one:");

    average(input, number, total, array);
    countEvenNumbers( array);
    countOddNumbers( array);
    
  }

  public static void average(Scanner input, int number, double total, double [] array) {

    for(int i = 0; i < array.length; i++)
    {
      array[i] = input.nextDouble();
    }

    for( int j = 0; j < array.length; j++)
    {
      total+= array[j]; 
    }

    double average = total / number;

    System.out.println("The average value is: " + average);

    input.close();
    
  }


  public static void countEvenNumbers(double [] array) {

    int evenCount = 0;

    for(int e = 0; e < array.length; e++)
    {
      if (array[e] % 2 == 0) 
      {
        evenCount++;
      }
    }
    System.out.println("even number " + evenCount);
    
  }

  public static void countOddNumbers(double [] array) {
    int oddCount = 0;

    for(int d = 0; d < array.length; d++)
    {
      if (array[d] % 2 != 0) 
      {
        oddCount++;
      }
    }
    System.out.println("odd number " + oddCount);
    
  }
}