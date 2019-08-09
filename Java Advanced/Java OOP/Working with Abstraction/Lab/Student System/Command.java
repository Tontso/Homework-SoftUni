public interface Command {

    void execute(StudentsRepository studentsRepository, String[] args);
}
