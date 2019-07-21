
import java.io.*;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {


        String pathIn = "C:\\Users\\tommy\\Dropbox\\SoftUni\\Java Advanced\\Java Advanced - май 2019\\04.Streams, Files and Directories\\Files-and-Streams-Lab-Resources\\input.txt";
        String pathOut = "C:\\Users\\tommy\\Dropbox\\SoftUni\\Java Advanced\\Java Advanced - май 2019\\04.Streams, Files and Directories\\Files-and-Streams-Lab-Resources\\output.txt";

        try (Scanner scanner = new Scanner(new FileReader(pathIn));
        PrintWriter writer = new PrintWriter(pathOut)) {
            while (scanner.hasNext()) {
                scanner.next();
                if (scanner.hasNextInt()) {
                    writer.println(scanner.nextInt());
                }
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }


    }
}
