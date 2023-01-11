import java.util.Scanner;
public class Test{
    public static void main(String [] args){
     Scanner input = new Scanner(System.in);
     String str1 = input.nextLine();
     String str2 = input.next();
     int intCount = str1.indexOf(str2);
     while(intCount >= 0){
         str1 = str1.substring(0, intCount) + str1.substring(intCount + str2.length());
         intCount = str1.indexOf(str2);
     }
     System.out.println(str1);
    }
    }