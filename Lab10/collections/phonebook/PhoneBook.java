package collections.phonebook;

public interface PhoneBook {
    public Student searchByLastName(String lastName);
    public Student searchByNumber(String number);
    public Student searchByName(String name);
    public void addPerson(Student student);
    public void deleteByNumber(String number);

}
