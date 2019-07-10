import java.util.*;

public class BasicStackOperations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] parameters =Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int elementCount = parameters[0];
        int countToRevome = parameters[1];
        int lookupElement = parameters[2];

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .limit(elementCount)
                .forEach(stack::push);

        while (countToRevome-->0){
            stack.pop();
        }
        if(stack.contains(lookupElement)) {
            System.out.println("true");
        }else{
            if(stack.size() == 0){
                System.out.println(0);
            }else{
                System.out.println(Collections.min(stack));
            }
        }
    }
}
