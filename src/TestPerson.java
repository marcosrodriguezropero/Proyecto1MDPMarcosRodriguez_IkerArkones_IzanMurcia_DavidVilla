public class TestPerson {
    public static void main(String[] args) {
        Person p = new Person("John Doe", "123 Main St");
        Student s = new Student("Alice Brown", "456 Elm St", "Computer Science", 2, 3000.0);
        Staff t = new Staff("Dr. Smith", "789 Oak St", "High School", 5000.0);

        System.out.println(p);
        System.out.println(s);
        System.out.println(t);
    }
}
