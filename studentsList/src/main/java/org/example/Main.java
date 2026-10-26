
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Jan", "Kowalski", 20));
        students.add(new Student("Adam", "Nowak", 22));
        students.add(new Student("Zosia", "Malinowska", 21));
        students.add(new Student("Wera", "Wisniewska", 19));
        students.add(new Student("Anna", "Kowalczyk", 25));

        // Wszyscy studenci - lambda
        System.out.println("All students:");
        students.forEach(student -> System.out.println(student));

        // Studenci starsi niz 20 lat - Stream + Lambda
        System.out.println("\nStudents older than 20:");

        students.stream()
                .filter(student -> student.getAge() > 20)
                .forEach(student -> System.out.println(student));
    }
}
