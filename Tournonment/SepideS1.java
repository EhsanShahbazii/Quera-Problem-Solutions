import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int remain = n % m;
        int people = (int) n/m;
        if (remain == 0)
            System.out.print(people);
        else
            System.out.print(people+1);
    }
}

// </Ctrl+Z>
