import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ToString(callSuper = true)
@Getter
@EqualsAndHashCode(callSuper = true)
public abstract class Employee extends Person {

    private final String company;
    private final String position;
    private final double baseSalary;

    public Employee(String name, int age, boolean married, String company, String position, double baseSalary) {
        super(age, name, married);
        this.company = company;
        this.position = position;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();
}