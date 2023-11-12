public class StudentP {
    private static final double EXCELLENT_GRADE_LOWER_BOUND = 5.00;
    private static final double AVG_GRADE_LOWER_BOUND = 3.50;
    private String name;
    private int age;
    private double grade;

    public StudentP(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return String.format("%s is %s years old.", name, age) + getGradeCommentary();
    }

    private String getGradeCommentary() {

        if (grade >= EXCELLENT_GRADE_LOWER_BOUND) {
            return " Excellent student.";
        } else if (grade < EXCELLENT_GRADE_LOWER_BOUND && grade >= AVG_GRADE_LOWER_BOUND) {
            return " Average student.";

        } else {
            return " Very nice person.";
        }
    }
}
