import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Person {

    int age;
    final String name;
    final boolean married;

    public void display() {
        System.out.println(this);
    }
}

