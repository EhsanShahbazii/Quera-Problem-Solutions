import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte count = scanner.nextByte();
        String st = "";

        for (byte i = 1; i <= count; i++) {
            st = st.concat("o");
        }

        System.out.print("W"+ st + "w!");
    }
}

// </Ctrl+Z>
