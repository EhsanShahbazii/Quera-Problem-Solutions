import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int[] d = new int[count];

        for (int i = 0; i < count; i++) {
            d[i] = scanner.nextInt();
        }

        if (count == 1)
            System.out.print(d[0]+1 % 30);
        else if (count == 2)
            System.out.print(((d[0]*d[1]/gcd(d[0], d[1])) +1 )% 30);
        else if (count == 3)
            System.out.print(((d[0]*d[1]*d[2]/gcd(d[0], d[1])*gcd((d[0]*d[1])/gcd(d[0], d[1]), d[2])) +1 )% 30);
        else if (count == 4)
            System.out.print(((d[0]*d[1]*d[2]*d[3]/(gcd(d[0], d[1])*gcd(d[2], d[3])*gcd((d[0]*d[1])/gcd(d[0], d[1]), (d[2]*d[3])/gcd(d[2], d[3]))) +1 )% 30));
        else
            System.out.print((((d[0]*d[1]*d[2]*d[3]/(gcd(d[0], d[1])*gcd(d[2], d[3])*gcd((d[0]*d[1])/gcd(d[0], d[1]), (d[2]*d[3])/gcd(d[2], d[3])))*d[4])/gcd(d[0]*d[1]*d[2]*d[3]/(gcd(d[0], d[1])*gcd(d[2], d[3])*gcd((d[0]*d[1])/gcd(d[0], d[1]), (d[2]*d[3])/gcd(d[2], d[3]))), d[4])) +1 )% 30);
    }

    public static int gcd(int p, int q) {
        if (q == 0)
            return p;
        else
            return gcd(q, p % q);
    }
}

// </Ctrl+Z>
