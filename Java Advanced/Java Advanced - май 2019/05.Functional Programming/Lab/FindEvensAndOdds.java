import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class FindEvensAndOdds {
    public static void main(String[] args) {

        Predicate<Integer> filterEven = x -> x % 2 == 0;
        Predicate<Integer> filterOdd = x -> x % 2 != 0;

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String type = scanner.nextLine();

        int lowerBount = Integer.parseInt(input[0]);
        int upperBount = Integer.parseInt(input[1]);

        Predicate<Integer> byType = filterEven;

        if (type.equals("odd")){
            byType = filterOdd;
        }

        IntStream.rangeClosed(lowerBount,upperBount)
            .boxed()
            .filter(byType)
             .forEach(x -> System.out.print(x +" "));
    }
}
