package Chapter_9;
import java.util.Scanner;

public class TheLocationClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns: ");
        int row = input.nextInt();
        int column = input.nextInt();
        double array[][] = new double[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = (100 + (int)(Math.random()*9999)) / 100.0 ;
            }
        }
        printArray(array);
        Location c = locateLargest(array);
        System.out.println("The location of the largest element is " + c.maxValue +  " at (" + c.row + "," + c.column + ")");
    }

    public static Location locateLargest(double[][] a){
        Location b = new Location();
        b.row = 0;
        b.column = 0;
        b.maxValue = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] > b.maxValue) {
                    b.maxValue = a[i][j];
                    b.row = i;
                    b.column = j;
                }
            }
        }
        return b;
    }
    public static void printArray(double[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
class Location{
    int row;
    int column;
    double maxValue;

}
