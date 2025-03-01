import lombok.Getter;
import lombok.AllArgsConstructor;

@Getter
@AllArgsConstructor

public abstract class Person {
    private int age;
    private final String name;
    private final boolean married;

    public void display() {
        System.out.println("Age: " + age + " Name: " + name + " Married: " + married);
    }
}

