import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int n, i, j, space = 1, k = 0;
            n = scanner.nextInt();
            String[] line = new String[(n+1)/2];
            space = n - 1;
            for (j = 1; j <= (n+1)/2; j++)
            {
                line[k] = "";
                for (i = 1; i <= space; i=i+2)
                {
                    line[k] = line[k].concat(" ");
                }

                for (i = 1; i <= 2 * j - 1; i++)
                {
                    line[k] = line[k].concat("*");
                }

                for (i = 1; i <= space; i=i+2)
                {
                    line[k] = line[k].concat("  ");
                }

                for (i = 1; i <= 2 * j - 1; i++)
                {
                    line[k] = line[k].concat("*");
                }
                space -= 2;
                k++;
            }
            if ( n == 1) {
                System.out.print("*");
            }else {
                for (int m = 0; m < (n+1)/2; m++) {
                    System.out.println(line[m]);
                }

                for (int m = (n-1)/2 -1; m >= 0; m--) {
                    System.out.print(line[m]);
                    if (m != 0) {
                        System.out.println("");
                    }
                }
            }
        }
    }
}

// <Ctrl+Z>
