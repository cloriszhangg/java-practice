import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   int [] intRandomArr = new int[10];
   for(int i = 0; i < 500; i++){
     intRandomArr[(int)(Math.random() * 10)]++;
   }

   System.out.println("Number\t\tOccurance");
   for(int i = 0; i < 10; i++){
    System.out.println(i +"\t\t\t" + intRandomArr[i]);
   }
    
   }
     
  }