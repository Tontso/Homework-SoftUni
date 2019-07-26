import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CustomComparator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] numbersString = scanner.nextLine().split("\\s+");

        Integer[] numbers = new Integer[numbersString.length];

        for (int i = 0; i <numbersString.length ; i++) {
            numbers[i] = Integer.parseInt(numbersString[i]);
        }


        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer f, Integer s) {
                int result;
                if(f % 2 == 0 && s % 2 != 0){
                    result = -1;
                }else if(s % 2 == 0 && f % 2 != 0){
                    result = 1;
                }else {
                    result = f - s;
                }
                return result;
            }
        };

        Arrays.sort(numbers,comparator);

        for (Integer number : numbers ) {
            System.out.print(number + " ");
        }
    }
}
