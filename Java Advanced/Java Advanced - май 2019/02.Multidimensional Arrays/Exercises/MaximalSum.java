import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {

    public  static  void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        scanner.nextLine();

        int[][] matrix = new int [rows][cols];

        for (int r = 0; r <rows ; r++) {
            matrix[r] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int maxSum = -1;
        int rowIndex = -1;
        int colIndex = -1;
        for (int row = 1; row < rows - 1; row++) {
            for (int col = 1; col <cols -1 ; col++) {
                int currentSum = getMatrixSum(matrix, row, col);
                if (currentSum > maxSum){
                    maxSum = currentSum;
                    rowIndex = row;
                    colIndex = col;
                }

            }
        }
        System.out.println("Sum = "+maxSum);
        printMatrix(rowIndex,colIndex,matrix);

    }


    private static int getMatrixSum(int[][] matrix, int row, int col) {
        int sum = 0;

        sum += matrix[row][col];
        sum += matrix[row - 1][col];
        sum += matrix[row + 1][col];
        sum += matrix[row][col - 1];
        sum += matrix[row][col + 1];
        sum += matrix[row - 1][col - 1];
        sum += matrix[row + 1][col + 1];
        sum += matrix[row - 1][col + 1];
        sum += matrix[row + 1][col - 1];

        return  sum;
    }


    private static void printMatrix(int rowIndex, int colIndex, int[][] matrix) {
        int beginRow =  rowIndex - 1;
        int beginCol = colIndex - 1;

        for (int i = beginRow; i < (3 + beginRow) ; i++) {
            for (int j = beginCol; j < (3 + beginCol); j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
