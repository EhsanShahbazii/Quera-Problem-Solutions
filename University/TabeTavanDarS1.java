import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            double x = scanner.nextDouble();
            int y = scanner.nextInt();

            System.out.format("%.3f", Math.pow(x, y));
        }
    }

}
