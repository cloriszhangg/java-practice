import java.util.Scanner;
public class Test{
    public static void main(String [] args){
     Scanner input = new Scanner(System.in);
     String strFirst = input.next();
     String strLast = input.next();
     if(strLast.charAt(0) <= 'I' ){
         System.out.print("1");
     }
     else if(strLast.charAt(0) <= 'S' ){
         System.out.print("2");
     }
     else{
         System.out.print("3");
     }
    }}
