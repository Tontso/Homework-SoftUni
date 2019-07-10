import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Robotics {

    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] inpout = scanner.nextLine().split(";");

        String[] robots = new String[inpout.length];
        int[] processTime = new  int[inpout.length];
        int[] workTime = new int[inpout.length];

        for (int i = 0; i <inpout.length ; i++) {
            String[] data = inpout[i].split("-");
            String name = data[0];
            int time = Integer.parseInt(data[1]);
            robots[i] = name;
            processTime[i] = time;
        }

        String startTime = scanner.nextLine();

        ArrayDeque<String> products = new ArrayDeque<>();

        String inputProduct = scanner.nextLine();

        while (!inputProduct.equals("End")){
            products.offer(inputProduct);
            inputProduct = scanner.nextLine();
        }

        String[] timeData = startTime.split(":");
        int hours = Integer.parseInt(timeData[0]);
        int minutes = Integer.parseInt(timeData[1]);
        int seconds = Integer.parseInt(timeData[2]);

        LocalTime time =LocalTime.of(hours, minutes, seconds);

        while (!products.isEmpty()){
            time = time.plusSeconds(1);

            String product = products.poll();
            boolean isAssinged = false;
            for (int i = 0; i <robots.length ; i++) {
                if(workTime[i] == 0 && !isAssinged){
                    workTime[i] = processTime[i];
                    isAssinged = true;
                    printRobotDAta(robots[i] ,product ,time);
                }
                if (workTime[i] > 0){
                    workTime[i]--;
                }
            }

            if (!isAssinged){
                products.offer(product);
            }
        }
    }


    private static void printRobotDAta(String robot, String product,LocalTime time) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println(robot+" - "+product+" "+"["+ time.format(formatter) + "]");
    }
}
