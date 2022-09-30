import java.util.Scanner;
//Ehsan Shahbazi

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            String input = scanner.next();
            String[] data = new String[n];

            int sum = 0;
            for(int i = 0; i < n; i++) {
                data[i] = scanner.next();
                sum += index(data[i], String.valueOf(input.charAt(i)));
            }

            System.out.print(sum);
        }
    }

    public static int index(String input, String ch) {
        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            if (String.valueOf(input.charAt(i)).equals(ch)) {
                result = i;
            }
        }
        if (result > 4) {
            result = 9 - result;
        }
        return result;
    }
}

// </Ctrl+Z>
