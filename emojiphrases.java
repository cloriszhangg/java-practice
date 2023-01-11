import java.util.Scanner;
public class Test{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int intHappy = 0, intSad = 0;
String strSen = input.nextLine();
for(int i = 0; i < strSen.length() - 2; i++){
if(strSen.charAt(i) == ':'){
if(strSen.substring(i, i+3).equals(":-)")) intHappy++;
else if(strSen.substring(i, i+3).equals(":-(")) intSad++;
}
}
if (intHappy > intSad)System.out.println("happy");
else if(intSad > intHappy) System.out.println("sad");
else if((intHappy > 0 || intSad > 0) && (intHappy == intSad)) System.out.println("unsure");
else System.out.println("none");
}
}