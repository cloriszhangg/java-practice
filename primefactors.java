import java.util.Scanner;
public class Test{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int intN = input.nextInt();
    int counter = 2;
    while(counter <= intN){
      if(intN % counter == 0){
        System.out.print(counter + " ");
        intN = intN / counter;
      }
      else{
        counter = counter + 1;
      }
    }
    System.out.println("");
  }
}