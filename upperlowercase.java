public class Main {
  public static void upper(String [] strWord){
    for(int i = 0; i < strWord.length; i++){
      strWord[i] = strWord[i].toUpperCase();
    }
  }
  public static void main(String [] args){
  String [] strFun = {"apple", "banana", "pineapple", "papaya"};
  upper(strFun);
  for(int i = 0; i < strFun.length; i++){
    System.out.print(strFun[i] + " ");
  }
  System.out.println("");
  }
}