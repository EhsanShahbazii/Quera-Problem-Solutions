import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            long number = scanner.nextLong();
            long pow = 1;

            while (number >= pow) {
                pow *= 2;
            }

            System.out.print(pow);
        }
    }
}

// </Ctrl+Z>
