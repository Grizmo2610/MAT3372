package collections.phonebook;

import java.util.ArrayList;

public class PhoneBookList implements PhoneBook {
    protected ArrayList<Student> phoneBook = new ArrayList<Student>();

    public PhoneBookList() {
    }


    @Override
    public Student searchByLastName(String lastName) {
        for (Student student: phoneBook){
            if (student.getLastName().equals(lastName)){
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String number) {
        for (Student student: phoneBook){
            if (student.getPhone().equals(number)){
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByName(String name) {
        for (Student student: phoneBook){
            if (student.getName().equals(name)){
                return student;
            }
        }
        return null;
    }

    @Override
    public void addPerson(Student student) {
        phoneBook.add(student);
    }

    @Override
    public void deleteByNumber(String number) {
        phoneBook.remove(searchByNumber(number));
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < phoneBook.size(); i++){
            result.append(phoneBook.get(i));
            if (i < phoneBook.size() - 1){
                result.append(" ");
            }
        }
        return result.toString();
    }
}
