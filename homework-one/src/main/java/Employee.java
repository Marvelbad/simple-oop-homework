import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)


public abstract class Employee extends Person {
    private final String company;
    private final String position;
    protected double baseSalary;

    public Employee(String name, int age, boolean married, String company, String position, double baseSalary) {
        super(age, name, married);
        this.company = company;
        this.position = position;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    @Override
    public void display() {
        super.display();
        System.out.println("Company: " + company + ", Position: " + position + ", Base Salary: " + baseSalary);
    }
}
