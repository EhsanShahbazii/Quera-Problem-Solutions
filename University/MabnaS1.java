import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            String a = scanner.next();
            int c = scanner.nextInt();

            String result = Integer.toString(Integer.parseInt(a, 10), c);

            int sum1 = 0, sum2 = 0;
            for (int i = 0; i < result.length(); i++) {
                int num = Integer.parseInt(String.valueOf(result.charAt(i)));
                if (i % 2 == 0) {
                    sum1 += num;
                }else {
                    sum2 += num;
                }
            }
            if (sum1 == sum2) {
                System.out.print("Yes");
            }else {
                System.out.print("No");
            }
        }
    }
}
