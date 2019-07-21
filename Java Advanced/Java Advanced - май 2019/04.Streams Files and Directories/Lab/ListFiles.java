import java.io.File;



public class ListFiles {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\tommy\\Dropbox\\SoftUni\\Java Advanced\\Java Advanced - май 2019\\04.Streams, Files and Directories\\Files-and-Streams-Lab-Resources\\Files-and-Streams");



        File[]  allFiles = file.listFiles();
        if(allFiles != null) {
            for (File f1 : allFiles) {
                if (!f1.isDirectory()) {
                    System.out.println(String.format("%s: [%d]", f1.getName(), f1.length()));
                }
            }
        }


    }
}
