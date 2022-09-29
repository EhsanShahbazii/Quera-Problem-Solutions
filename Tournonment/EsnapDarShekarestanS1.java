import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int n = scanner.nextInt();
            int tripCount = scanner.nextInt();

            int[][] dataPrice = new int[n][n];
            for(int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    dataPrice[i][j] = scanner.nextInt();
                }
            }

            int price = 0;
            for (int i = 0; i < tripCount; i++) {
                    int x = scanner.nextInt();
                    int y = scanner.nextInt();
                    price += dataPrice[x-1][y-1];
            }

            System.out.print(price);
        }
    }
}

// </Ctrl+Z>
