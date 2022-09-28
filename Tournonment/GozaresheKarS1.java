import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            String input = scanner.nextLine();
            String[] splits = input.split(" ");
            int finalVolume = Integer.parseInt(splits[1]);
            int volume = 0;

            boolean flag = true;

            for(int i = 0; i < Integer.parseInt(splits[0]); i++) {
                volume += scanner.nextInt();
                if (volume >= finalVolume) {
                    flag = false;
                }
            }

            if (flag)
                System.out.print("NO");
            else
                System.out.print("YES");
        }
    }
}

// </Ctrl+Z>
