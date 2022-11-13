package Chapter_8;
import java.util.Scanner;

public class ComputeTheWeeklyHoursForEachEmployee {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = 8;
        int m = 7;
        int[][] array = new int[n][m];
        fillArray(array);
        printArray(array);
        int[] sum = new int[8];
        for (int i = 0; i < array.length; i++) {
            sum[i] = sumRow(array, i);
        }
        for (int i = 0; i < sum.length; i++) {
            System.out.println(sum[i]);

        }
        System.out.println();
        System.out.println();
        sort(sum);
    }

    public static void printArray(int[][] list){
        System.out.println("             Su M  T  W  Th F  Sa ");
        for (int i = 0; i < list.length; i++) {
            System.out.print("Employee " + i + "   ");
            for (int j = 0; j < list[i].length; j++) {
                System.out.print(list[i][j] + "  ");
            }
            System.out.println();
        }

    }
    public static int sumRow(int[][] m, int rowIndex){
        int sumOfRow = 0;
        for (int i = 0; i < m[rowIndex].length; i++) {
            sumOfRow += m[rowIndex][i];
        }
        return sumOfRow;

    }
    public static void fillArray(int[][] list){
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                list[i][j] = 1 + (int)(Math.random()*9);
            }
        }
    }
    public static void sort(int[] list) {
        int[] indexList = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            indexList[i] = i;

        }
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

                int temp = indexList[currentMinIndex];
                indexList[currentMinIndex] = indexList[i];
                indexList[i] = temp;
            }
            System.out.println("Employee " + indexList[i] + "  " + list[i]);

        }
    }
}
