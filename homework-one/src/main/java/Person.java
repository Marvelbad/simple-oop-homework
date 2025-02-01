import lombok.Getter;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Person {
    private final String name;
    @Getter
    private int age;
    private final boolean married;

    public void display() {
        System.out.println("Name: " + name + " Age: " + age + " Married: " + married);
    }
}
