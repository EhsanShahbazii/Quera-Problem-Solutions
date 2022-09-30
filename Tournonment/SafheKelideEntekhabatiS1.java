import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int n = scanner.nextInt();

            String[] data = new String[n];

            for (int i = 0; i < n; i++) {
                data[i] = scanner.next();
            }

            int flag = -1;
            String result = "";

            for (int i = 0; i < n; i++) {
                if (data[i].equals("CAPS")) {
                    flag *= -1;
                }
                if (flag == 1 && !data[i].equals("CAPS")) {
                    result = result.concat(data[i].toUpperCase());
                }else if (!data[i].equals("CAPS")){
                    result = result.concat(data[i]);
                }
            }

            System.out.print(result);
        }
    }
}

// </Ctrl+Z>
