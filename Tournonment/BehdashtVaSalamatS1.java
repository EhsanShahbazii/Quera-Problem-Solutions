import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int currentScore = scanner.nextInt();
            int tripDay = scanner.nextInt();
            int finalScore;

            if (tripDay == 7) {
                System.out.print(currentScore);
            }else if (tripDay == 0) {
                System.out.print(20);
            }else {
                finalScore = currentScore - tripDay;
                if (finalScore < 0)
                    System.out.print(0);
                else
                    System.out.print(finalScore);
            }
        }
    }
}

// <Ctrl+Z>
