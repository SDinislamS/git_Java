package Chapter_8;
import java.util.Scanner;

public class GamePlayATicTacToeGame {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[][] tab = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tab[i][j] = " ";
            }
        }
        fillTab(tab);
        int count = 0;
        for (int i = 0; i < 9; i++) {
            if ((tab[0][0].equals("X") && tab[0][1].equals("X") && tab[0][2].equals("X")) || (tab[1][0].equals("X") && tab[1][1].equals("X") && tab[1][2].equals("X")) ||
                    (tab[2][0].equals("X") && tab[2][1].equals("X") && tab[2][2].equals("X")) || (tab[0][0].equals("X") && tab[1][0].equals("X") && tab[2][0].equals("X")) ||
                    (tab[0][1].equals("X") && tab[1][1].equals("X") && tab[2][1].equals("X")) || (tab[0][2].equals("X") && tab[1][2].equals("X") && tab[2][2].equals("X")) ||
                    (tab[0][0].equals("X") && tab[1][1].equals("X") && tab[2][2].equals("X")) || (tab[2][0].equals("X") && tab[1][1].equals("X") && tab[0][2].equals("X"))) {
                System.out.println("X Player won!");
                break;
            } else if ((tab[0][0].equals("O") && tab[0][1].equals("O") && tab[0][2].equals("O")) || (tab[1][0].equals("O") && tab[1][1].equals("O") && tab[1][2].equals("O")) ||
                    (tab[2][0].equals("O") && tab[2][1].equals("O") && tab[2][2].equals("O")) || (tab[0][0].equals("O") && tab[1][0].equals("O") && tab[2][0].equals("O")) ||
                    (tab[0][1].equals("O") && tab[1][1].equals("O") && tab[2][1].equals("O")) || (tab[0][2].equals("O") && tab[1][2].equals("O") && tab[2][2].equals("O")) ||
                    (tab[0][0].equals("O") && tab[1][1].equals("O") && tab[2][2].equals("O")) || (tab[2][0].equals("O") && tab[1][1].equals("O") && tab[0][2].equals("O"))) {
                System.out.println("O Player won!");
                break;
            }
            if (i % 2 == 0) {
                System.out.println("Enter a row (0, 1, or 2) for player X: ");
                int n = input.nextInt();
                System.out.println("Enter a column (0, 1, or 2) for player X: ");
                int m = input.nextInt();
                tab[n][m] = "X";
                fillTab(tab);
                count = 1;
            } else {
                System.out.println("Enter a row (0, 1, or 2) for player O: ");
                int n = input.nextInt();
                System.out.println("Enter a column (0, 1, or 2) for player O: ");
                int m = input.nextInt();
                tab[n][m] = "O";
                fillTab(tab);
                count = 2;
            }
        }
    }
    public static void fillTab(String list[][]){
        System.out.println("---------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" | " + list[i][j]  );
            }
            System.out.println(" |");
            System.out.println("---------------");
        }
    }
}
