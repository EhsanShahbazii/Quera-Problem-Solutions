import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int n = scanner.nextInt();
            int count = 0;
            int[] data = new int[n];

            for (int i = 0; i < n; i++) {
                data[i] = scanner.nextInt();
            }

            for(int i = 0 ; i < n-1; i++) {
                if (data[i] != data[i+1])
                    count++;
            }

            System.out.print(count);
        }
    }
}

// </Ctrl+Z>
