import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFile {

    public static void main(String[] args) {

        String pathIn = "C:\\Users\\tommy\\Dropbox\\SoftUni\\Java Advanced\\Java Advanced - май 2019\\04.Streams, Files and Directories\\Files-and-Streams-Lab-Resources\\input.txt";
        String pathOut = "C:\\Users\\tommy\\Dropbox\\SoftUni\\Java Advanced\\Java Advanced - май 2019\\04.Streams, Files and Directories\\Files-and-Streams-Lab-Resources\\output.txt";

        try(FileInputStream inputStream = new FileInputStream(pathIn);
            FileOutputStream outputStream = new FileOutputStream(pathOut)) {

            int oneByte = inputStream.read();
            while(oneByte >= 0){
                if(oneByte == 32 || oneByte == 10){
                    outputStream.write(oneByte);
                }else{
                    String byteAsText = String.valueOf(oneByte);
                    for (int i = 0; i <byteAsText.length() ; i++) {
                        int symbol = byteAsText.charAt(i);
                        outputStream.write(symbol);
                    }
                }
                oneByte = inputStream.read();
            }

            inputStream.close();
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
