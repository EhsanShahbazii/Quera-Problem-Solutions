import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int count = scanner.nextInt();

            int[][] data = new int[count][2];

            for (int i = 0; i < count; i++) {
                data[i][0] = scanner.nextInt();
                data[i][1] = scanner.nextInt();
            }

            for (int i = 0; i < count; i++) {
                if (i != count-1) {
                    System.out.println(donkey(data[i][0], data[i][1]));
                }else {
                    System.out.print(donkey(data[i][0], data[i][1]));
                }
            }
        }
    }

    public static int donkey(int x, int y) {
        if (x == y) {
            if (x % 2 == 0) {
                return 2*x;
            }else {
                return 2*x-1;
            }
        }else if (y == x-2) {
            if (x % 2 == 0) {
                return 2*(x-1);
            }else {
                return 2*x-3;
            }
        }else {
            return -1;
        }
    }
}

// </Ctrl+Z>
