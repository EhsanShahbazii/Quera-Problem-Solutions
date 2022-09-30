import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            int ax = scanner.nextInt();
            int ay = scanner.nextInt();

            int bx = scanner.nextInt();
            int by = scanner.nextInt();

            int cx = scanner.nextInt();
            int cy = scanner.nextInt();

            int[] d1 = new int[ay-ax];
            int[] d2 = new int[by-bx];
            int[] d3 = new int[cy-cx];

            for (int i = 0; i < ay-ax; i++) {
                d1[i] = i+ax;
            }

            for (int i = 0; i < by-bx; i++) {
                d2[i] = i+bx;
            }

            for (int i = 0; i < cy-cx; i++) {
                d3[i] = i+cx;
            }

            int min = Math.min(ax,Math.min(bx, cx));
            int max = Math.max(ay,Math.max(by, cy));

            int count = 0, sum = 0;
            for (int i = min; i < max; i++) {
                for (int j = 0; j < d1.length; j++) {
                    if (d1[j] == i) {
                        count++;
                        break;
                    }
                }
                for (int j = 0; j < d2.length; j++) {
                    if (d2[j] == i) {
                        count++;
                        break;
                    }
                }
                for (int j = 0; j < d3.length; j++) {
                    if (d3[j] == i) {
                        count++;
                        break;
                    }
                }

                switch (count) {
                    case 1:
                        sum += a;
                        break;
                    case 2:
                        sum += b*2;
                        break;
                    case 3:
                        sum += c*3;
                        break;
                }
                count = 0;
            }

            System.out.println(sum);
        }
    }
}

// </Ctrl+Z>
