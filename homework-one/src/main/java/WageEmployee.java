import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)

public class WageEmployee extends Employee {
    private final double hours;
    private final double wage;

    public WageEmployee(String name, int age, boolean married, String company, String position, double baseSalary, double hours, double wage) {
        super(name, age, married, company, position, baseSalary);
        this.hours = hours;
        this.wage = wage;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (hours * wage);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Hours worked: " + hours + ", Wage per hour: " + wage + ", Total salary: " + calculateSalary());
    }
}
