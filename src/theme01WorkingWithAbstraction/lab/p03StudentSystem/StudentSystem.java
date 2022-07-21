package theme01WorkingWithAbstraction.lab.p03StudentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> studentsByName;

    public StudentSystem() {
        this.studentsByName = new HashMap<>();
    }

    public Map<String, Student> getStudentsByName() {
        return this.studentsByName;
    }

    public void ParseCommand(String[] args) {
        String command = args[0];
        String name = args[1];

        if (command.equals("Create") && !studentsByName.containsKey(name)) {

            int age = Integer.parseInt(args[2]);
            double grade = Double.parseDouble(args[3]);
            Student student = new Student(name, age, grade);
            studentsByName.put(name, student);

        } else if (command.equals("Show")) {

            if (studentsByName.containsKey(name)) {
                System.out.println(studentsByName.get(name).getInfo());

            }
        }

    }
}
