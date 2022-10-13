import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       long number = scanner.nextLong();

       long sum = 0, n = 1, m;
       boolean flag = true;

       while (flag) {
           m = (n*(n+1))/2;
           for (int i = 1; i <= m; i++) {
               if (m % i == 0) {
                   sum++;
               }
           }
           if (number <= sum) {
               System.out.print(m);
               flag = false;
           }
           sum = 0;
           n++;
       }
    }
}
