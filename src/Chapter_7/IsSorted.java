package Chapter_7;
import java.util.Scanner;
public class IsSorted {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list: ");
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length ; i++) {
            array[i] = input.nextInt();
        }
        if(isSorted(array))
            System.out.println("The list is already sorted");
        else
            System.out.println("The list is not sorted");


    }
    public static boolean isSorted(int[] list){
        for (int i = 0; i < list.length - 1; i++) {
            if(list[i] < list[i+1])
                return false;
        }
        return true;
    }
}
