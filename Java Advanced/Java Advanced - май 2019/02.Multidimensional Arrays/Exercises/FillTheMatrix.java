import java.sql.SQLOutput;
import java.util.Scanner;


public class FillTheMatrix {

    public  static  void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int size = Integer.parseInt(input[0]);
        String pattern = input[1];

        int[][] array ;

        if(pattern.equals("A")){
            array = generateAraryWithPatternA(size);
        }else{
            array = generateAraryWithPatternB(size);
        }

        printArray(array);

    }


    private static int[][] generateAraryWithPatternA(int size){
        int[][] matrix = new int[size][size];

        int value = 1;
        for (int col = 0;  col<size ; col++) {
            for (int row = 0; row <size ; row++) {
                matrix[col][row] = value;
                value++;
            }
        }
        return matrix;
    }


    private static int[][] generateAraryWithPatternB(int size){

        int[][] matrix = new int[size][size];

        int value = 1;
        for (int col = 0;  col<size ; col++) {
            if(col % 2 ==0) {
                for (int row = 0; row < size; row++) {
                    matrix[row][col] = value;
                    value++;
                }
            }else {
                for (int row = size - 1; row >=0 ; row--) {
                    matrix[row][col] = value;
                    value++;
                }
            }
        }
        return matrix;

    }


    private static void printArray(int[][] array){
        for (int i = 0; i <array.length;  i++) {
            for (int j = 0; j <array[i].length ; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}
