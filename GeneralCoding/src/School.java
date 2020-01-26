import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class School {
    private final List<Student> students;
    School(int num) {
        students = new ArrayList<>(num);
        for(int i =0; i<num; ++i) {
            students.add(new Student("student_" + (i+1)));
        }
    }

    @Override
    public String toString() {
        return students.stream().map(Student::getName).collect(Collectors.joining(", "));
    }

    private static class Student {
        private final String name;
        private Student(String name) { this.name = name; }

        private String getName() {
            return name;
        }
    }
}
