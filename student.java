public class Student {
    private String name;
    private int age;
    private String id;

    // Constructor
    public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    // toString method to display student information
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", id='" + id + "'}";
    }
}
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList to hold Student objects
        ArrayList<Student> students = new ArrayList<>();

        // Add 10 Student objects to the list
        students.add(new Student("satya", 20, "S001"));
        students.add(new Student("srija", 21, "S002"));
        students.add(new Student("sandhya", 22, "S003"));
        students.add(new Student("meghana", 23, "S004"));
        students.add(new Student("manoj", 20, "S005"));
        students.add(new Student("sravan", 21, "S006"));
        students.add(new Student("sai kumar", 22, "S007"));
        students.add(new Student("sumeeth", 23, "S008"));
        students.add(new Student("vineeth", 20, "S009"));
        students.add(new Student("likhitha", 21, "S010"));

        // Print all student objects using a for-each loop
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
