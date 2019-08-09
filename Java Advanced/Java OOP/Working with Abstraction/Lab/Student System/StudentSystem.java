import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentSystem {

    private StudentsRepository repo;

    public StudentSystem() {
        this.repo = new StudentsRepository();
    }

    @Deprecated
    public StudentsRepository getRepo() {
        return this.repo;
    }

    public void ParseCommand(String[]args) {
//        Scanner scanner = new Scanner(System.in);
//        String[] args = scanner.nextLine().split(" ");

        Command command = CommandFactory.createCommand(args[0]);

        command.execute(this.repo, args);


    }
}
