import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int[] data = new int[4];
            for (int i = 0; i < 4; i++) {
                data[i] = scanner.nextInt();
            }

            int[] chocolate = {0, 0, 0, 0};
            int index = 2, k = 0;
            while (true) {
                if (index % 2 == 0) {
                    data[0]--;
                }else {
                    data[2]--;
                }
                index++;

                chocolate[k]++;

                k++;
                if (k == 4) {
                    k = 0;
                }
                if (data[0] == 0 || data[2] == 0) {
                    break;
                }
            }

            for (int item: chocolate) {
                System.out.print(item + " ");
            }
        }
    }
}

// </Ctrl+Z>
