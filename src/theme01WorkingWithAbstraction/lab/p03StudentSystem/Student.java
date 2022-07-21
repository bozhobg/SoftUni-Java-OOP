package theme01WorkingWithAbstraction.lab.p03StudentSystem;

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getInfo() {
        StringBuilder formatter = new StringBuilder(String.format("%s is %s years old.", this.name, this.age));

        if (this.grade >= 5.00) {
             formatter.append(" Excellent student.");
        } else if (this.grade < 5.00 && this.grade >= 3.50) {
            formatter.append(" Average student.");
        } else {
            formatter.append(" Very nice theme03Inheritance.exercise.person.");
        }

        return formatter.toString();

    }
}
