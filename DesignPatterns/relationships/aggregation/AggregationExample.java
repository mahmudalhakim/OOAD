public class AggregationExample {
    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        University university = new University("Tech University");
        university.addStudent(s1);
        university.addStudent(s2);

        System.out.println("Students at " + university.getStudents());
        // Även om vi tar bort universitetet, finns studenterna kvar
        university = null;
        System.out.println("Student 1: " + s1.getName());
    }
}