import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class SortLines {
    public static void main(String[] args) {

        Path pathIn = Paths.get("C:\\Users\\tommy\\Dropbox\\SoftUni\\Java Advanced\\Java Advanced - май 2019\\04.Streams, Files and Directories\\Files-and-Streams-Lab-Resources\\input.txt");
        Path pathOut = Paths.get("C:\\Users\\tommy\\Dropbox\\SoftUni\\Java Advanced\\Java Advanced - май 2019\\04.Streams, Files and Directories\\Files-and-Streams-Lab-Resources\\output.txt");

        try {
            List<String> inputLines = Files.readAllLines(pathIn)
                    .parallelStream()
                    .filter(s -> !s.isEmpty())
                    .sorted()
                    .collect(Collectors.toList());

            Files.write(pathOut,inputLines);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
