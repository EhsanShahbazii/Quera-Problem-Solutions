import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            String count = scanner.nextLine();
            String input = scanner.nextLine();

            String[] word = input.split(" ");
            String result = "";

            for (int i = word.length - 1; i >= 0; i--) {
                result = result.concat(" " + word[i]);
            }

            System.out.print(result.substring(1));
        }
    }
}

// </Ctrl+Z>
