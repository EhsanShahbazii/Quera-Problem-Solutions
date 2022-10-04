import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int a = scanner.nextInt();

            double b = 0.315146743627720412;

            System.out.println(a*a*b);
        }
    }
}

// </Ctrl+Z>
