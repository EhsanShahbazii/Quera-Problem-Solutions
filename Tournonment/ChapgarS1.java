import java.util.Scanner;
public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();


        for (int i = 0; i < n; i++) {
            print("X", m);
            print(".", m);
            print("X", m);
            System.out.println("");
        }

        for (int i = 0; i < n; i++) {
            print(".", m);
            print("X", m);
            print(".", m);
            System.out.println("");
        }

        for (int i = 0; i < n; i++) {
            print("X", m);
            print(".", m);
            print("X", m);
            if (i+1 != n)
                System.out.println("");
        }
    }

    public static void print(String point, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(point);
        }
    }
}

// </Ctrl+Z>
