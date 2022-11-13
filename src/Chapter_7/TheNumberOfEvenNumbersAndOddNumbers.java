package Chapter_7;
import java.util.Scanner;
public class TheNumberOfEvenNumbersAndOddNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int[] array = new int[15];
        for (int i = 0; i < array.length ; i++) {
            array[i] = input.nextInt();
            if(array[i] ==0)
                break;
        }
        System.out.println("The number of odd numbers: " + countOddNum(array));
        System.out.println("The number of even numbers: " + countEvenNum(array));

    }

    public static int countEvenNum(int arr[]){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0)
                count++;
        }
        return count;
    }
    public static int countOddNum(int arr[]){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0)
                count++;
        }
        return count;
    }

}
