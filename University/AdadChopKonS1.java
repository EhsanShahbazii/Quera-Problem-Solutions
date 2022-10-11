import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            String string = scanner.nextLine();

            for (int i = 0; i < string.length(); i++) {
                System.out.print(string.charAt(i) + ": ");
                for (int j = 0; j < string.charAt(i) - 48; j++) {
                    System.out.print(string.charAt(i));
                }
                System.out.println("");
            }
        }
    }
}

// </Ctrl+Z>
