import java.util.Scanner;
public class Test{
    public static int bubbleSort(int []intArr){
        int intSwaps = 0;
        for(int i = 0; i < intArr.length; i++){
            for(int j = 0;  j < intArr.length - 1; j++){
                if(intArr[j] > intArr[j + 1]){
                    int intTemp = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = intTemp;
                    intSwaps++;
                }
            }
        }
        return intSwaps;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int intNTestCases = input.nextInt();
        for(int i = 0; i < intNTestCases; i++){
            int intNCars = input.nextInt();
            int [] intCarArr = new int[intNCars];
            for(int j = 0; j < intNCars; j++){
                intCarArr[j] = input.nextInt();
            }
            System.out.println("Optimal train swapping will take "+ bubbleSort(intCarArr) + " swap(s).");
        }
    }
}