public class ShowCommand implements Command {

    public void execute(StudentsRepository repo, String[] args){
        var name = args[1];
        if (repo.containsByName(name)) {
            var student = repo.findByName(name);
            System.out.println(student);
        }

    }
}
