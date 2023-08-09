package collections.phonebook;

public class Test {
    public static void phoneBookListTest(){
        PhoneBook list = new PhoneBookList();
        Student student1 = new Student("Hoang", "Tu","0379061825");
        Student student2 = new Student("Hoang", "Tuan Tu","0379000001");
        Student student3 = new Student("Nguyen Van", "A","0379000002");
        Student student4 = new Student("Tran Thi", "B","0379000003");
        Student student5 = new Student("Hoang", "C","0379000004");
        list.addPerson(student1);
        list.addPerson(student2);
        list.addPerson(student3);
        list.addPerson(student4);
        list.addPerson(student5);
        System.out.println("Test list: " + list);
        System.out.println("Search by number: " + list.searchByNumber("0379061825"));
        System.out.println("Search by name: " + list.searchByName("Hoang Tu"));
        System.out.println("Search by last name: " + list.searchByLastName("A"));
        list.deleteByNumber("0379061825");
        System.out.println("Delete by number: " + list);
    }

    public static void phoneBookMapTest(){
        PhoneBook map = new PhoneBookMap();
        Student student1 = new Student("Hoang", "Tu","0379061825");
        Student student2 = new Student("Hoang", "Tuan Tu","0379000001");
        Student student3 = new Student("Nguyen Van", "A","0379000002");
        Student student4 = new Student("Tran Thi", "B","0379000003");
        Student student5 = new Student("Hoang", "C","0379000004");
        map.addPerson(student1);
        map.addPerson(student2);
        map.addPerson(student3);
        map.addPerson(student4);
        map.addPerson(student5);
        System.out.println("Test map: " + map);
    }
    public static void main(String[] args) {
        phoneBookListTest();
        System.out.println("_____________________");
        phoneBookMapTest();
    }
}
