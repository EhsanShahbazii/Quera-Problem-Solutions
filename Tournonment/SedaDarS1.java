import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String input = scanner.nextLine();

            int counter = 0;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' ||
                        input.charAt(i) == 'o' || input.charAt(i) == 'u') {
                    counter++;
                }
            }
            System.out.println(counter);
        }
    }
}

// </Ctrl+Z>
