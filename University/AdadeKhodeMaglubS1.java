import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            String number = scanner.nextLine();
            String reverse = "";

            for(int i = 0; i < number.length(); i++) {
                reverse = reverse.concat(String.valueOf(number.charAt(number.length() - (i+1))));
            }

            if (reverse.equals(number))
                System.out.print("YES");
            else
                System.out.print("NO");

        }
    }
}

// </Ctrl+Z>
