import java.util.Arrays;
        import java.util.Scanner;

public class IntersectionOfTwoMatrices {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = Integer.parseInt(scanner.nextLine());
        int col = Integer.parseInt(scanner.nextLine());

        char[][] arrayA = new char[row][col];
        char[][] arrayB = new  char[row][col];


        // reading of array A
        for (int i = 0; i < row; i++) {
            String[] line = scanner.nextLine().split("\\s+");

            for (int j = 0; j <line.length;  j++) {
                arrayA[i][j] = line[j].charAt(0);
            }
        }

        // reading of array B
        for (int i = 0; i < row; i++) {
            String[] line = scanner.nextLine().split("\\s+");

            for (int j = 0; j <line.length;  j++) {
                arrayB[i][j] = line[j].charAt(0);
            }
        }


        char[][] arrayC = new char[row][col];
        for (int i = 0; i <arrayA.length ; i++) {
            for (int j = 0; j <arrayA[i].length ; j++) {
                if (arrayA[i][j] != arrayB[i][j]){
                    arrayC[i][j] = '*';
                }else {
                    arrayC[i][j] = arrayA[i][j];
                }
            }
        }

        for (char[] matrix : arrayC) {
            System.out.println(Arrays.toString(matrix).replaceAll("[\\[\\],]",""));
        }
    }
}
