import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = true)

public class Manager extends Employee {
    private final int grade;

    public Manager(String name, int age, boolean married, String company, String position, double baseSalary, int grade) {
        super(name, age, married, company, position, baseSalary);
        this.grade = grade;
    }

    @Override
    public double calculateSalary() {
        return baseSalary * grade;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Grade: " + grade + ", Total salary: " + calculateSalary());
    }
}
