import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] dimentions = Arrays.stream(scanner.nextLine()
                .split("\\s++"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[][] matrix = new int[dimentions[0]][];

        for (int i = 0; i < matrix.length; i++) {
            int[] arr = Arrays.stream(scanner.nextLine()
                    .split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[i] = arr;
        }

        int searchNumber = Integer.parseInt(scanner.nextLine());
        boolean isFound = false;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == searchNumber) {
                    System.out.println(row + " " + col);
                    isFound = true;
                }
            }
        }
        if(!isFound)
            System.out.println("not found");

    }
}
