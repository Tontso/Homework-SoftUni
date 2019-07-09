import java.util.ArrayDeque;
import java.util.Scanner;

public class MathPotato {


    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        String[] children = scanner.nextLine().split("\\s+");
        int n = Integer.valueOf(scanner.nextLine());

        ArrayDeque<String> queue = new ArrayDeque<>();

        for (String child : children) {
            queue.offer(child);
        }

        int cycle = 1;
        while (queue.size() > 1) {
            for (int i = 1; i < n; i++) {
                queue.offer(queue.poll());
            }

            if (!isPrime(cycle)) {
                System.out.println("Removed " + queue.poll());
            }else{
                System.out.println("Prime " + queue.peek());
            }
            cycle++;
        }
        System.out.println("Last is " + queue.poll());

    }

    public static boolean isPrime(int number) {
        if(number == 1){
            return false;
        }
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 2; i < sqrt; i++) {
            if (number % i == 0) {
                // number is perfectly divisible - no prime
                return false;
            }
        }
        return true;
    }
}


