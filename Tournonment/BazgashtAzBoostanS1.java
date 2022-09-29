import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.nextLine();
        String input2 = scanner.next();

        if (input1.charAt(0) >= input2.charAt(0))
            System.out.print("Left");
        else
            System.out.print("Right");
    }
}

// </Ctrl+Z>
