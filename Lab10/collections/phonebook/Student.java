package collections.phonebook;

public class Student implements Comparable<Student>{
    private String name = "Grizmo";
    private String lastName;
    private String phone;
    private double average;

    public Student() {

    }

    public Student(String name, String lastName, double average) {
        this.name = name;
        this.lastName = lastName;
        this.average = average;
    }

    public Student(String name, String lastName, String phone) {
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
    }

    public Student(String name, String lastName, String phone, double average) {
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public double getAverage() {
        return average;
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (! (o instanceof Student student)){
            return false;
        }
        return Double.compare(student.average, average) == 0 && getName().equals(student.getName()) && lastName.equals(student.lastName) && phone.equals(student.phone);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", average=" + average +
                '}';
    }
}