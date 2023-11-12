package Team;
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person (String firstName, String lastName, int age, double salary) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setSalary(salary);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName.length() < 3) {
            throw new IllegalArgumentException("First name cannot be less than three symbols");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName.length() < 3) {
            throw new IllegalArgumentException("Last name cannot be less than three symbols");
        }
        this.lastName = lastName;
    }

    public int getAge() {
        if(age < 1) {
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary < 460) {
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
        this.salary = salary;
    }

    public void increaseSalary(double bonus) {
        if(age < 30) {
            bonus = bonus / 2;
        }
        salary = salary * (1 + (bonus / 100));
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %f leva", firstName, lastName, salary);
    }
}
