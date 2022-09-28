import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            String input = scanner.next();

            for (int i = 0; i < input.length(); i ++) {
                for(int k = 0; k < i; k++) {
                    System.out.print(input.charAt(i));
                }
                for (int j = i; j < input.length(); j++) {
                    System.out.print(input.charAt(j));
                }
                System.out.println("");
            }
        }
    }
}

// </Ctrl+Z>
