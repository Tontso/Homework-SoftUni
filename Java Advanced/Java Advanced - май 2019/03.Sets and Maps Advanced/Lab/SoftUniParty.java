import java.util.HashSet;
        import java.util.Scanner;
        import java.util.TreeMap;
        import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        HashSet<String> vipGuest = new HashSet<>();
        HashSet<String> regularGuest = new HashSet<>();

        String input = scanner.nextLine();

        while (!"PARTY".equals(input)) {
            if (input.length() == 8) {
                if (Character.isDigit(input.charAt(0))) {
                    vipGuest.add(input);
                } else {
                    regularGuest.add(input);
                }

                input = scanner.nextLine();
            }
        }

        while ("END".equals(input = scanner.nextLine())){
            if (Character.isDigit(input.charAt(0))){
                vipGuest.remove(input);
            }else {
                regularGuest.remove(input);
            }
        }
        System.out.println(vipGuest.size() + regularGuest.size());
        vipGuest.forEach(System.out::println);
        regularGuest.forEach(System.out::println);
    }
}
