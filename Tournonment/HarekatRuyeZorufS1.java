vimport java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();

        double avg = (double) (a+b+c)/3;
        int count = 0;

        if (a == avg || b == avg || c == avg)
            count++;

        if (a == b && b == c) {
            System.out.print(0);
        }else if (count == 1)
            System.out.print(1);
        else
            System.out.print(2);
    }
}

// </Ctrl+Z>
