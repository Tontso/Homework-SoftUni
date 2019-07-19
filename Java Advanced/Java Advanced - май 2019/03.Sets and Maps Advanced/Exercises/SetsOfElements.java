import javax.sound.midi.Soundbank;
import java.util.*;

public class SetsOfElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();

        LinkedHashSet<Integer> firstSet = new LinkedHashSet<>();
        LinkedHashSet<Integer> secondSet = new LinkedHashSet<>();

        while(n-- > 0 ){
            int number = Integer.parseInt(scanner.nextLine());
            firstSet.add(number);
        }

        while (m-- > 0){
            int number = Integer.parseInt(scanner.nextLine());
            secondSet.add(number);
        }
        firstSet.retainAll(secondSet);

        firstSet.forEach(e -> System.out.print(e + " "));

    }
}
