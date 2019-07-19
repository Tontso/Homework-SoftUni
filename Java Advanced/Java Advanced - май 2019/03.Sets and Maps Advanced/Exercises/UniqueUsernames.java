import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<String> username = new LinkedHashSet<>();

        int n = Integer.parseInt(scanner.nextLine());

        while(n-- > 0){
            String userName = scanner.nextLine();

            username.add(userName);
        }

        for (String userName : username)
            System.out.println(userName);
    }
}
