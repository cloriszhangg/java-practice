import java.util.Scanner;
public class Test{
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
    int intISBN = input.nextInt();
    int intTemp = intISBN;
    int intSum = 0;
    for(int i = 1; i <= 9; i++){
      intSum = intSum + (intISBN % 10) * (i + 1);
      intISBN = intISBN / 10;
    }
    int intD1 = 11 - intSum % 11;
    if(intD1 == 10){
      System.out.println(intTemp + "X");
    }
    else{
      System.out.println(intTemp + ""+ intD1);
    }
}}