import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int n = scanner.nextInt();

            while (n > 8) {
                n -= 8;
            }

            switch (n) {
                case 1:
                case 5:
                    System.out.print("c");
                    break;
                case 2:
                    System.out.print("o");
                    break;
                case 3:
                    System.out.print("d");
                    break;
                case 4:
                    System.out.print("e");
                    break;
                case 6:
                    System.out.print("u");
                    break;
                case 7:
                    System.out.print("p");
                    break;
                case 8:
                    System.out.print("6");
                    break;
            }
        }
    }
}

// </Ctrl+Z>
