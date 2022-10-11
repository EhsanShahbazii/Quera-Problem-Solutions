import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int side1 = scanner.nextInt();
            int side2 = scanner.nextInt();
            int side3 = scanner.nextInt();

            if (side1*side1 == side2*side2 + side3*side3)
                System.out.print("YES");
            else if (side2*side2 == side1*side1 + side3*side3)
                System.out.print("YES");
            else if (side3*side3 == side1*side1 + side2*side2)
                System.out.print("YES");
            else
                System.out.print("NO");
        }
    }
}

// </Ctrl+Z>
