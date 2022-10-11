import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int point = scanner.nextInt();

            if ((point + 1) % 4 == 0) {
                int n = (point + 1)/4;
                System.out.print(n + " " + n);
            }else if ((point) % 4 == 0) {
                int n = (point)/4;
                System.out.print((-1) * n + " " + n);
            }else if ((point - 1) % 4 == 0) {
                int n = (point - 1)/4;
                System.out.print((-1) * n + " " + (-1) * n);
            }else {
                int n = (point + 2)/4;
                System.out.print(n + " " + ((-1) * n + 1));
            }
        }
    }
}

// </Ctrl+Z>
