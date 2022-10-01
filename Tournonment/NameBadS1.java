import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int count = 1;
        boolean flag = false;
        for (int i = 0; i < input.length()-1; i++) {
            if (input.charAt(i) == input.charAt(i+1)) {
                count++;
            }else {
                if (count % 2 != 0) {
                    System.out.print("bad");
                    flag = true;
                    break;
                }
                count = 1;
            }
            if (i == input.length()-2 && count % 2 != 0) {
                System.out.print("bad");
                flag = true;
            }
        }
        if (input.length() == 1)
            System.out.print("bad");
        else if (!flag)
            System.out.print("khoob");
    }
}

// </Ctrl+Z>
