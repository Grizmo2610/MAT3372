package collections.phonebook;

import java.util.HashMap;

public class PhoneBookMap implements PhoneBook{
    protected HashMap<String, Student> phoneBook = new HashMap<String, Student>();

    public PhoneBookMap() {
    }

    @Override
    public Student searchByLastName(String lastName) {
        for (String key: phoneBook.keySet()){
            if (phoneBook.get(key).getLastName().equals(lastName)){
                return phoneBook.get(key);
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String number) {
        return phoneBook.get(number);
    }

    @Override
    public Student searchByName(String name) {
        for (String key: phoneBook.keySet()){
            if (phoneBook.get(key).getName().equals(name)){
                return phoneBook.get(key);
            }
        }

        return null;
    }

    @Override
    public void addPerson(Student student) {
        phoneBook.put(student.getPhone(), student);
    }

    @Override
    public void deleteByNumber(String number) {
        phoneBook.remove(number);
    }
    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        for (String key: phoneBook.keySet()){
            result.append(phoneBook.get(key)).append(" ");
        }
        return result.toString();
    }
}
