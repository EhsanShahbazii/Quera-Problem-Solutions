import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String string = "";

            while (true) {
                String content = scanner.next();
                if (Integer.parseInt(content) == 0)
                    break;
                string = string.concat(content + " ");
            }

            String[] array = string.split(" ");

            for (int i = 0; i < array.length; i++) {
                System.out.println(array[array.length - i-1 ]);
            }
        }
    }
}

// <Ctrl+Z>
