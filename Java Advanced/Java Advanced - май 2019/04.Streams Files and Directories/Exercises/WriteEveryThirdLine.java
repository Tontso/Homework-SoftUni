import java.io.*;

public class WriteEveryThirdLine {
    public static void main(String[] args) {

        String pathIn = "C:\\Users\\tommy\\Dropbox\\SoftUni\\Java Advanced\\Java Advanced - май 2019\\04.Streams, Files and Directories\\Files-and-Streams-Lab-Resources\\input.txt";
        String pathOut = "C:\\Users\\tommy\\Dropbox\\SoftUni\\Java Advanced\\Java Advanced - май 2019\\04.Streams, Files and Directories\\Files-and-Streams-Lab-Resources\\output.txt";


        int position =1;
        try(BufferedReader input = new BufferedReader(new FileReader(pathIn));
            BufferedWriter output = new BufferedWriter(new FileWriter(pathOut))) {

            String line = " ";
            while ((line = input.readLine()) != null) {
                if (position % 3 == 0) {
                    output.write(line);
                    output.newLine();
                }
                position++;
            }
            output.close();
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
