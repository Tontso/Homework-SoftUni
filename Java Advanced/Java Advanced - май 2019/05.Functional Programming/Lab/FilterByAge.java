import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Consumer;


public class FilterByAge {
    public static void main(String[] args) {


        BiPredicate<Map.Entry<String,Integer>,Integer> youngerThan =
                (person,ageLimit) -> person.getValue() < ageLimit;

        BiPredicate<Map.Entry<String,Integer>,Integer> oldenThan =
                (person,ageLimit) -> person.getValue() >= ageLimit;

        Consumer<Map.Entry<String,Integer>> printName =
                person -> System.out.println(person.getKey());

        Consumer<Map.Entry<String,Integer>> printAge =
                person -> System.out.println(person.getValue());

        Consumer<Map.Entry<String,Integer>> printNameAndAge =
                person -> System.out.printf("%s - %d%n",person.getKey(), person.getValue());


        Scanner scanner = new Scanner(System.in);


        int peopleCount = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String,Integer> people = new LinkedHashMap<>();

        for (int i = 0; i <peopleCount ; i++) {
            String[] personData = scanner.nextLine().split(", ");
            people.put(personData[0],Integer.parseInt(personData[1]));
        }

        String comparison = scanner.nextLine();
        int ageLimit = Integer.parseInt(scanner.nextLine());
        String printType = scanner.nextLine();

        people.entrySet().stream()
            .filter(x -> comparison.equals("younger") ?
                youngerThan.test(x, ageLimit) :
                oldenThan.test(x, ageLimit)
            )
            .forEach(person -> {
                switch (printType){
                    case "age":
                        printAge.accept(person);
                        break;
                    case "name":
                        printName.accept(person);
                        break;
                    default:
                        printNameAndAge.accept(person);
                        break;
                }
          });
    }
}
