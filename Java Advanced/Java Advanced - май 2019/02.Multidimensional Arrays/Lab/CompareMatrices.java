import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimentions = Arrays.stream(scanner.nextLine()
                .split("\\s++"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[][] firstMatrix = new int[dimentions[0]][];

        for (int i = 0; i < firstMatrix.length; i++) {
            int[] arr = Arrays.stream(scanner.nextLine()
                    .split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            firstMatrix[i] = arr;
        }

        //Second Array
        dimentions = Arrays.stream(scanner.nextLine()
                .split("\\s++"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[][] secondMatrix = new int[dimentions[0]][];

        for (int i = 0; i < secondMatrix.length; i++) {
            int[] arr = Arrays.stream(scanner.nextLine()
                    .split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            secondMatrix[i] = arr;
        }

        if (matricesAreEqual(firstMatrix,secondMatrix)){
            System.out.println("equal");
        }else{
            System.out.println("not equal");

        }
    }


    static boolean matricesAreEqual(int[][] firstMatrix, int[][] secondMatrix){
        if (firstMatrix.length != secondMatrix.length) {
            return false;
        }

        for (int row = 0; row < firstMatrix.length; row++) {
            if (firstMatrix[row].length != secondMatrix[row].length) {
                return false;
            }
            for (int col = 0; col < firstMatrix[row].length; col++) {
                if (firstMatrix[row][col] != secondMatrix[row][col]) {
                    return false;
                }
            }
        }
        return true;
    }



}
