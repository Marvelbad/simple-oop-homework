import java.util.Objects;

public class Manager extends Employee {
    int grade;

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Manager manager = (Manager) obj;
        return grade == manager.grade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), grade);
    }
}
