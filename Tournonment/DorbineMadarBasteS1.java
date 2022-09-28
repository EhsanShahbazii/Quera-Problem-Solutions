import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int[][] data = new int[3][2];

            for (int i = 0; i < 3; i++) {
                data[i][0] = scanner.nextInt();
                data[i][1] = scanner.nextInt();
            }

            if (data[0][0] != data[1][0] && data[0][1] != data[1][1]) {
                System.out.print((data[0][0] + data[1][0] - data[2][0]) + " " + (data[0][1] + data[1][1] - data[2][1]));
            }else if (data[1][0] != data[2][0] && data[1][1] != data[2][1]) {
                System.out.print((data[1][0] + data[2][0] - data[0][0]) + " " + (data[1][1] + data[2][1] - data[0][1]));
            }else {
                System.out.print((data[2][0] + data[0][0] - data[1][0]) + " " + (data[2][1] + data[0][1] - data[1][1]));
            }
        }
    }
}

// </Ctrl+Z>
