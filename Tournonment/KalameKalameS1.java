import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            String input = scanner.next();

            String[] words = {"a", "e", "i", "o", "u"};
            int pow = 1;

            for(int i = 0; i < input.length(); i++) {
                for (int j = 0; j < words.length; j++) {
                    if (String.valueOf(input.charAt(i)).equals(words[j]))
                        pow *= 2;
                }
            }
            System.out.print(pow);
        }
    }
}

// </Ctrl+Z>
