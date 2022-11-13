package Chapter_8;
import java.util.Scanner;

public class SumElementsRowByRow {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = 3;
        int m = 4;
        double[][] array = new double[n][m];
        fillArray(array);
        printArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Sum of elements of row " + i + " is: " + sumRow(array, i));

        }


    }
    public static void fillArray(double[][] list){
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                list[i][j] = (int)(Math.random()*100);
            }
        }
    }
    public static void printArray(double[][] list){
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static double sumRow(double[][] m, int rowIndex){
        double sumOfRow = 0;
        for (int i = 0; i < m[rowIndex].length; i++) {
            sumOfRow += m[rowIndex][i];
        }
        return sumOfRow;

    }
}
