import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int count = scanner.nextInt();
            int[] data = new int[count];

            for(int i = 0; i < count; i++) {
                data[i] = scanner.nextInt();
            }

            for (int i = 0; i < count; i++) {
                if (data[i] > 3) {
                    System.out.print("*");
                }else if (data[i] == 3) {
                    System.out.print("***");
                }else if (data[i] == 2) {
                    System.out.print("**");
                }else {
                    System.out.print("*");
                }
                if (i != count-1) {
                    System.out.println("");
                }
            }
        }
    }
}

// </Ctrl+Z>
