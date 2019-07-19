import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        TreeSet<String> elements = new TreeSet<>();
        while (n-- > 0){
            String[] inputElement = scanner.nextLine().split("\\s+");

            elements.addAll(Arrays.asList(inputElement));
        }

        elements.forEach( element -> System.out.print(element + " "));
    }
}
