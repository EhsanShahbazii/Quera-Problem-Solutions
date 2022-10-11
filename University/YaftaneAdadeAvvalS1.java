import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            long number = scanner.nextLong();
            long sum = 0, count = 0, prime = 0, distance = number;
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
            if (distance == 1) {
                System.out.print(2);
            }else {
                boolean flag = false;
                while (count < sum) {
                    distance++;
                    for (int i = 2; i <= (distance + 1)/2; i++) {
                        if (distance % i == 0) {
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) {
                        count++;
                        prime = distance;
                    }
                    flag = false;
                }

                System.out.print(prime);
            }
        }
    }
}

// </Ctrl+Z>
