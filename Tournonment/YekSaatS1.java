import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = scanner.nextInt();
        int mins = scanner.nextInt();

        int hoursReal = 0, minsReal = 0;
        if (hours != 0) {
            hoursReal = 12 - hours;
        }

        if (mins != 0) {
            minsReal = 60 - mins;
        }

        if (hoursReal < 10) {
            System.out.print("0" + hoursReal + ":");
        }else {
            System.out.print(hoursReal + ":");
        }

        if (minsReal < 10) {
            System.out.print("0" + minsReal);
        }else {
            System.out.print(minsReal);
        }
    }
}

// </Ctrl+Z>
