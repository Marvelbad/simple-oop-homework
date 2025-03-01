import java.util.Objects;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode(callSuper = true) // Учитываем родительский класс, но не генерируем методы
@ToString(callSuper = true) // Генерируем toString, включая поля родительского класса

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
}
