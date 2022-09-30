import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        String st1 = scanner.next();
        String st2 = scanner.next();

        if (st1.charAt(0) == st2.charAt(st2.length()-1))
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}

// </Ctrl+Z>
