import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int count = scanner.nextInt();
            String rightWord = scanner.next();
            String studentWord = scanner.next();
            int right = 0;

            for(int i = 0; i < count; i++) {
                if (rightWord.charAt(i) != studentWord.charAt(i))
                    right++;
            }
            System.out.print(right);
        }
    }
}

// </Ctrl+Z>
