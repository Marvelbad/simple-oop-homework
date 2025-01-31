import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        WageEmployee that = (WageEmployee) obj;
        return Double.compare(that.hours, hours) == 0 &&
                Double.compare(that.wage, wage) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hours, wage);
    }
}
