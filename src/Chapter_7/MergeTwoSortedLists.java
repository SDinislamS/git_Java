package Chapter_7;
import java.util.Scanner;

public class MergeTwoSortedLists {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of first list: ");
        int n1 = input.nextInt();
        System.out.print("Enter the size of second list: ");
        int n2 = input.nextInt();
        int[] array1 = new int[n1];
        int[] array2 = new int[n2];
        fillArray(array1);
        fillArray(array2);
        System.out.print("First array: ");
        printArray(array1);
        System.out.print("Second array: ");
        printArray(array2);
        int[] array3 = merge(array1, array2);
        System.out.print("The merged  sorted list is: ");
        printArray(array3);


    }
    public static void fillArray(int[] list){
        for (int i = 0; i < list.length; i++) {
            list[i] = (int)(Math.random()*100);
        }
    }
    public static void printArray(int[] list){
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
    public static int[] merge(int[] list1, int[] list2){
        int[] mergeArray = new int[list1.length + list2.length];
        for (int i = 0; i < mergeArray.length; i++) {
            if(i < list1.length)
                mergeArray[i] = list1[i];
            else
                mergeArray[i] = list2[i - list1.length];
        }
        selectionSort(mergeArray);
        return mergeArray;
    }
    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
// Find the minimum in the list[i..list.length−1]
            int currentMin = list[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
// Swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}
