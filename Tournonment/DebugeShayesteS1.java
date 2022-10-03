import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();

            String input = "q";
            for (int i = 1; i < n; i++) {
                input = input.concat("a");
            }

            System.out.println(input);
        }
    }
}

// </Ctrl+Z>
