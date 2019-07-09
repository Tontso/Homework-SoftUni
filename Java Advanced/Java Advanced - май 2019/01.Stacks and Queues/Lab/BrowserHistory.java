
import java.util.ArrayDeque;
import java.util.Scanner;

class BrowserHistory {


    public static void main (String args[]){

        Scanner input = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();

        String url = input.nextLine();
        String current = "";

        while(!url.equals("Home")) {
            if(url.equals("back")) {
                if(!stack.isEmpty()){
                    current = stack.pop();
                }else {
                    System.out.println("no previous URLs");
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