import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int n = scanner.nextInt();
            int m = scanner.nextInt();

            int[][] matrix = new int[n][n];
            int[][] data = new int[m][2];

            for (int i = 0; i < m; i++) {
                data[i][0] = scanner.nextInt();
                data[i][1] = scanner.nextInt();
            }

            for (int i = 0; i < m; i++) {
                matrix[data[i][0]-1][data[i][1]-1] = 1;
                matrix[data[i][1]-1][data[i][0]-1] = 1;
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] != 1)
                        matrix[i][j] = 0;
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j]);
                }
                System.out.println("");
            }
        }
    }
}

// </Ctrl+Z>
