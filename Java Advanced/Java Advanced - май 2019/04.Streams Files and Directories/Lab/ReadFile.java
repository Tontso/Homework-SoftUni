import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args){

        String path = "C:\\Users\\tommy\\Dropbox\\SoftUni\\Java Advanced\\Java Advanced - май 2019\\04.Streams, Files and Directories\\Files-and-Streams-Lab-Resources\\input.txt";


        try(FileInputStream inputStream = new FileInputStream(path)) {

            int oneByte = inputStream.read();
            while (oneByte >= 0){

                System.out.print(Integer.toBinaryString(oneByte)+ " ");
                oneByte = inputStream.read();
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
