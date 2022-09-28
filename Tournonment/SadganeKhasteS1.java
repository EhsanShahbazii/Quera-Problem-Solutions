import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            String input1 = scanner.nextLine();
            String input2 = scanner.nextLine();

            String num1 = reverse(input1);
            String num2 = reverse(input2);

            if (num1.equals(num2))
                System.out.print(input2 + " = " + input1);
            else if (Integer.parseInt(num1) > Integer.parseInt(num2))
                System.out.print(input2 + " < " + input1);
            else
                System.out.print(input1 + " < " + input2);
        }
    }

    public static String reverse(String input) {
        String reverse = "";

        for(int i = 0; i < input.length(); i++) {
            reverse = reverse.concat(String.valueOf(input.charAt(input.length() - (i+1))));
        }

        return reverse;
    }
}

// <Ctrl+Z>
