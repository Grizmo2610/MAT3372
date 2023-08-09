package exercisesonclasses.employee;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee(8,"Peter", "Pan", 2500);
        System.out.println(employee1);

        employee1.setSalary(999);
        System.out.println(employee1);

        System.out.println("Id is: " + employee1.getId());
        System.out.println("First name is: " + employee1.getFirstName());
        System.out.println("Last name is: " + employee1.getLastName());
        System.out.println("Salary is: " + employee1.getSalary());

        System.out.println("Name is: " + employee1.getName());
        System.out.println("Anual salary is: " + employee1.getAnnualSalary());
        System.out.println(employee1.raiseSalary(10));
        System.out.println(employee1);

    }
}
