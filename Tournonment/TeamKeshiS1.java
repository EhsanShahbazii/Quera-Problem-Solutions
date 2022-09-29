import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int[] data = new int[6];
            for (int i = 0; i < 6; i++) {
                data[i] = scanner.nextInt();
            }
            int max = 0;

            for (int i = 0; i < 6; i = i+2) {
                max += Math.min(data[i], data[i+1]);
            }

            System.out.print(max);
        }
    }
}

// </Ctrl+Z>
