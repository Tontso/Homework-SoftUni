import java.util.Scanner;

public class DiagonalDifference {

    public  static  void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        scanner.nextLine();

        int[][] matrix = new int [size][size];

        for (int row = 0; row <size; row++) {
            String[] line = scanner.nextLine().split("\\s+");
            for (int i = 0; i <line.length ; i++) {
                matrix[row][i] = Integer.parseInt(line[i]);
            }
        }

        int row = 0, col = 0;
        int primerySum = 0;
        while( row < size && col < size){
            primerySum += matrix[row][col];
            row++;
            col++;
        }

        row--;
        col = 0;
        int secondarySum = 0;
        while (row >=0 && col < size){
            secondarySum += matrix[row][col];
            row--;
            col++;
        }

        System.out.println(Math.abs(primerySum - secondarySum));
    }
}
