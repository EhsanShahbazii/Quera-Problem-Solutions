import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int p = scanner.nextInt();
            int d = scanner.nextInt();
            double remain = 0;
            int i = 1;

            while(true) {
                remain = (d*i)%p;
                if (remain >= 0 && remain <= p/2) {
                    System.out.print(d*(i));
                    break;
                }
                i++;
            }
        }
    }
}

// </Ctrl+Z>
