public class StudentSystemP {
    private StudentRepositoryP studentRepository;
    private boolean running;

    public StudentSystemP() {
        this.studentRepository = new StudentRepositoryP();
        this.running = true;
    }

    public void parseCommand(String[] args) {
        String command = args[0];

        if(command.equals("Exit")) {
            running = false;
        } else if(command.equals("Create")) {
            String name = args[1];
            int age = Integer.parseInt(args[2]);
            double grade = Double.parseDouble(args[3]);
            StudentP student = new StudentP(name, age, grade);

            studentRepository.create(student);

        } else if (command.equals("Show")) {
            String name = args[1];

            StudentP student = studentRepository.get(name);

            if (student != null) {
                System.out.println(student);
            }
        }
    }

    public boolean isRunning() {
        return running;
    }
}
