import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int[] data = new int[12];
            for (int i = 0; i < 12; i++) {
                data[i] = scanner.nextInt();
            }

            int result = max(data);

            if (result <= 2)
                System.out.print(1);
            else if (result <= 5)
                System.out.print(2);
            else if (result <= 8)
                System.out.print(3);
            else
                System.out.print(4);
        }
    }

    public static int max(int[] t) {
        int maximum = t[0], index = 0;
        for (int i=1; i<t.length; i++) {
            if (t[i] > maximum) {
                maximum = t[i];  
                index = i;
            }
        }
        return index;
    }
}

// </Ctrl+Z>
