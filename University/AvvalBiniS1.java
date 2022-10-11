import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int min = scanner.nextInt();
            int max = scanner.nextInt();
            boolean flag = true;
            String result = "";

            for(int i = min + 1; i < max; i++) {
                for (int j = 2; j <= i/2; j++) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag)
                    result = result.concat(i + ",");

                flag = true;
            }

            if (result.length() > 1)
                System.out.print(result.substring(0, result.length() - 1));

        }
    }
}

// <Ctrl+Z>
