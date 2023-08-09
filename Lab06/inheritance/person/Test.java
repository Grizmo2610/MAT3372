package inheritance.person;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("Grizmo", "Son La");
        System.out.println("Person: " + person);

        Student student = new Student(person,"Toan tin",2,6000);
        System.out.println("Student: " + student);

        Staff staff = new Staff(person, "HUS", 6000);
        System.out.println("Staff" + staff);

    }
}
