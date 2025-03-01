import java.util.Objects;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@Getter
@ToString(callSuper = true)

public class SaleManager extends Employee {
    private final double totalSales;
    private final double bonus;

    public SaleManager(String name, int age, boolean married, String company, String position, double baseSalary, double totalSales, double bonus) {
        super(name, age, married, company, position, baseSalary);
        this.totalSales = totalSales;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (totalSales * (bonus / 100));
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Total sales: " + totalSales + ", Bonus: " + bonus + "%, Total salary: " + calculateSalary());
    }


}
