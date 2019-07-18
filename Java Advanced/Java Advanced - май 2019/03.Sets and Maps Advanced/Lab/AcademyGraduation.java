import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class AcademyGraduation {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int count = Integer.parseInt(scanner.nextLine());

            Map<String, List<Double>> asd = new TreeMap<>();
            while (!(count-- == 0)) {
                String name = scanner.nextLine();
                List<Double> grades = Arrays.stream(scanner.nextLine().split("\\s+"))
                        .map(Double::parseDouble)
                        .collect(Collectors.toList());
                asd.putIfAbsent(name,new ArrayList<>());
                asd.get(name).addAll(grades);
            }

            DecimalFormat format = new DecimalFormat("#.##############");
            asd.forEach((name, grades) ->{
                double avg = grades.stream()
                        .mapToDouble(e -> e).sum() / grades.size();
                System.out.println(String.format(
                        "%s is graduated with %s",name,avg)
                );
            });
        }
}

