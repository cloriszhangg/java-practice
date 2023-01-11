import java.util.Scanner;
public class Test{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int intN = input.nextInt();
    int intPrimeCounter = 0;
    for(int i = 1; i < intN; i++){
      int intFactors = 0;
      for(int j = 1; j <= i; j++){
        if(i % j == 0) intFactors++;
      }
      if(intFactors == 2)intPrimeCounter++;
    }
    System.out.println(intPrimeCounter);
  }
}