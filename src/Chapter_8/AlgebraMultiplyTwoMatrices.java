package Chapter_8;

import java.util.Scanner;

public class AlgebraMultiplyTwoMatrices {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double[][] matrix2 = new double[3][3];
        double[][] matrix1 = new double[3][3];
        System.out.print("Enter first matrix: ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1[i][j] = input.nextDouble();
            }
        }
        System.out.print("Enter second matrix: ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1[i][j] = input.nextDouble();
            }
        }
        double[][] matrix3 = multiplyMatrix(matrix1, matrix2);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            if(i == 1)
                System.out.print("  *  ");
            else
                System.out.print("    ");

            for (int j = 0; j < 3; j++) {
                System.out.print(matrix2[i][j] + " ");
            }

            if(i == 1)
                System.out.print("  =  ");
            else
                System.out.print("    ");
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();

        }
    }
    public static double[][] multiplyMatrix(double[][] a, double[][] b){
        double[][] c = new double[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                for (int k = 0; k < a[i].length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }
}
/*0 2 4 1 4,5 2,2 1,1 4,3 5,2*/
