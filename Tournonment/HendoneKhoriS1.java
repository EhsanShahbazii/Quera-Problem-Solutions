import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int count = scanner.nextInt();
            int[] data = new int[count];
            int[] sorted = new int[count];

            for (int i = 0; i < count; i++) {
                data[i] = scanner.nextInt();
                sorted[i] = data[i];
            }

            Arrays.sort(data);
            int max = data[data.length - 1];

            for (int i = 0; i < count; i++) {
                if (max == sorted[i]) {
                    System.out.print(i+1);
                }
            }
        }
    }
}

// </Ctrl+Z>
