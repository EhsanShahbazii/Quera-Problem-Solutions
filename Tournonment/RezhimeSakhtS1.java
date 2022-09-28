import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            String input = scanner.nextLine();
            // R, Y, G
            int[] points = {0, 0, 0};

            for (int i = 0; i < input.length(); i++) {
                switch(input.charAt(i)) {
                    case 'R':
                        points[0]++;
                        break;
                    case 'Y':
                        points[1]++;
                        break;
                    case 'G':
                        points[2]++;
                }
            }

            if (points[0] >= 3)
                System.out.print("nakhor lite");
            else if (points[0] >= 2 && points[1] >= 2)
                System.out.print("nakhor lite");
            else if (points[1] == 5 || points[0] == 5)
                System.out.print("nakhor lite");
            else if (points[0] == 1 && points[1] == 4)
                System.out.print("nakhor lite");
            else
                System.out.print("rahat baash");
        }
    }
}

// </Ctrl+Z>
