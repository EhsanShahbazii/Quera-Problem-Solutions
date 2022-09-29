import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int day = scanner.nextInt();

            System.out.print("Hello CodeCup " + day + "!");
        }
    }
}

// </Ctrl+Z>
