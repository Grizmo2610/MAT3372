package library;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Item dvd = new Dvd("Tay Du Ky", 1986, 50);
        System.out.println("Test dvd: " + dvd);
        Item book = new Book("300 bai code thieu nhi", 2020, 300);
        System.out.println("Test Book: " + book);

        Rent rent = new Rent(book, new Date(2023, 3, 12), new Student("Hoang Tu", "Tu", "0001"), new Date());
        System.out.println("Test rent: " + rent);

        Rent rent1 = new Rent(dvd, new Date(2023, 3, 12), new Student("Hoang Tuan Tu", "Tu", "0002"), new Date());
        Rent rent2 = new Rent(new Book("Dai so tuyen tinh", 2022, 500), new Date(2022, 3, 12), new Student("Bui Trong Anh","Anh","0003"),
                new Date());
        Rent rent3 = new Rent(new Dvd("Tom and jerry", 1945, 20), new Date(2023, 3, 12), new Student("Tuan Tu", "Tu","0004"),
                new Date());

        Rent[] rents = { rent, rent1, rent2, rent3 };
        Library library = new Library(rents);
        System.out.println("Test libary: " + library.getLongestRent());
    }
}
