import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        Map<Double, Integer> result = new LinkedHashMap<>();


        for (Double number : input) {
            if (!result.containsKey(number)) {
                result.put(number, 1);
            } else {
                result.put(number, result.get(number) + 1);
            }
        }

        for (Double key : result.keySet()) {

            System.out.println(key + " -> " + result.get(key));

        }
    }
}
