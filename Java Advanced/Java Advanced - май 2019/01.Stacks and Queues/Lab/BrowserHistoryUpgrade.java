
import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {


    public static void main (String args[]){

        Scanner input = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();
        ArrayDeque<String> queue = new ArrayDeque<>();

        String url = input.nextLine();
        String current = "";

        while(!url.equals("Home")) {
            if(url.equals("back")) {
                if(!stack.isEmpty()){
                    queue.offer(current);
                    current = stack.pop();
                }else {
                    System.out.println("no previous URLs");
                    url = input.nextLine();
                    continue;
                }
            }else if(url.equals("forward")){
                if(!queue.isEmpty()){
                    current = queue.poll();
                }else {
                    System.out.println("no next URLs");
                    url = input.nextLine();
                    continue;
                }
            }else{
                if(!current.equals("")){
                    stack.push(current);
                }
                current = url;
            }
            System.out.println(current);
            url = input.nextLine();
        }

    }
}
