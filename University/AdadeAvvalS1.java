import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int min = scanner.nextInt();
            int max = scanner.nextInt();
            boolean flag = true;
            if (min == 1)
                min++;

            for(int i = min; i <= max; i++) {
                for (int j = 2; j <= i/2; j++) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag == true)
                    System.out.println(i);

                flag = true;
            }
        }
    }
}

// </Ctrl+Z>
