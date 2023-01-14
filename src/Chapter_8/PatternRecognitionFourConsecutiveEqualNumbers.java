package Chapter_8;
import java.util.Scanner;

public class PatternRecognitionFourConsecutiveEqualNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int m = input.nextInt();
        int[][] array = new int[n][m];
        fillArray(array);
        printArray(array);
        if(!isConsecutiveFour(array)){
            System.out.println("Array doesn't have four consecutive numbers");
        }

    }
    public static boolean isConsecutiveFour(int[][] values){
        for (int i = 0; i < values.length-3; i++) {
            for (int j = 0; j < values[0].length-3; j++) {
                if(values[i][j] == values[i][j+1] && values[i][j] == values[i][j+2] &&
                        values[i][j] == values[i][j+3]){
                    System.out.println("Array has four consecutive numbers from " + i + "-row, " + j+ "-column to " +
                            i + "-row, " + j+3 + " column: " + values[i][j]);
                    return true;
                }else if(values[j][i] == values[j][i+1] && values[j][i] == values[j][i+2] &&
                        values[j][i] == values[j][i+3]){
                    System.out.println("Array has four consecutive numbers from " + j + "-row, " + i + "-column to " +
                            j + "-row, " + (i+3) + " column: " + values[j][i]);
                    return true;
                } else if (values[i][j] == values[i+1][j+1] && values[i][j] == values[i+2][j+2] &&
                        values[i][j] == values[i+3][j+3]) {
                    System.out.println("Array has four consecutive numbers from " + i + "-row, " + j+ "-column to " +
                            i+3 + "-row, " + (j+3) + " column: " + values[i][j]);
                    return true;
                }
            }

        }
        for (int i = 0; i < values.length-3; i++) {
            for (int j = values[0].length-1; j > 2 ; j--) {
                if (values[i][j] == values[i+1][j-1] && values[i][j] == values[i+2][j-2] &&
                        values[i][j] == values[i+3][j-3]) {
                    System.out.println("Array has four consecutive numbers from " + i + "-row, " + j+ "-column to " +
                            i+3 + "-row, " + (j-3) + " column: " + values[i][j]);
                    return true;
                }
            }
        }
        return false;

    }
    public static void fillArray(int[][] values){
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[0].length; j++) {
                values[i][j] =  1 + (int)(Math.random()*9);
            }
        }
    }
    public static void printArray(int[][] values){
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[0].length; j++) {
                System.out.printf("%3d", values[i][j]);
            }
            System.out.println();
        }

    }
}
