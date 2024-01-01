import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < input; i++) {
            if (input % i == 0) {
                sum += i;
            }
        }
        int z = 1;
        boolean flag = false;

        while (z <= sum) {
            if (z == sum) {
                flag = true;
            }
            z *= 2;
        }

        if (flag) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
