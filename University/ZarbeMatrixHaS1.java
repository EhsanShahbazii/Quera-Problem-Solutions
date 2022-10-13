import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        byte row1 = input.nextByte();
        byte column = input.nextByte();
        byte column2 = input.nextByte();

        int [][]array1 = new int[101][101];
        int [][]array2 = new int[101][101];
        int [][]result = new int[101][101];

        for ( byte i=0 ; i < row1 ; i++){
            for ( byte j=0 ; j < column ; j++){
                array1[i][j] = input.nextInt();
            }
        }
        for ( byte i=0 ; i < column ; i++){
            for ( byte j=0 ; j < column2 ; j++){
                array2[i][j] = input.nextInt();
            }
        }

        for (int i=0 ; i < row1 ; i++){
            for (int j=0 ; j < column2 ; j++){
                for (int k=0 ; k < column ; k++){
                    result[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }
        for ( byte i=0 ; i < row1 ; i++){
            for ( byte j=0 ; j < column2 ; j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
