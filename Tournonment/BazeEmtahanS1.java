import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int s = scanner.nextInt();
            int f = scanner.nextInt();
            int l = scanner.nextInt();
            int x = scanner.nextInt();

            if (x < s) {
                System.out.println("exam did not started!");
            }else if (x >= f) {
                System.out.println("exam finished!");
            }else if (f - x > l){
                System.out.println(l);
            }else {
                System.out.println(f - x);
            }
        }
    }
}

// </Ctrl+Z>
