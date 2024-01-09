import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextInt();

        for (long a = 1; a < n; a++) {
            for (long b = a; b < n; b++) {
                long c = n - a - b;
                if (a * a + b * b == c * c) {
                    ArrayList<Long> numbers = new ArrayList<>();
                    numbers.add(a);
                    numbers.add(b);
                    numbers.add(c);
                    Collections.sort(numbers);
                    System.out.println(numbers.get(0) + " " + numbers.get(1) + " " + numbers.get(2));
                    return;
                }
            }
        }
        System.out.println("Impossible");
    }
}
