import java.util.Arrays;
import java.util.List;

record Person(String fullName, int years) {}

public class RecordExample {
    public static void main(String[] args) {
        Person person1 = new Person("Rahul", 22);
        Person person2 = new Person("Sneha", 28);
        Person person3 = new Person("Kiran", 31);

        List<Person> persons = Arrays.asList(person1, person2, person3);

        persons.stream()
               .filter(p -> p.years() > 25)
               .forEach(System.out::println);
    }
}

