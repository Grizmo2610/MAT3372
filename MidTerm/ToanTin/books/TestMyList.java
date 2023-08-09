package oop.books;

public class TestMyList {
    public static void main(String[] args) {
        System.out.println("Test Array list: ");
        testMyArrayList();

        System.out.println("Test Linked list: ");
        testMyLinkedList();


        MyList list = new MyArrayList();
        for (int i = 0; i < 10; i++){
            list.append(i);
        }
        System.out.println("Test Iterator: ");
        testIterator(list);
        /*
         TODO

         - Chạy demo các hàm test.
         - Lưu kết quả chạy chương trình vào file text có tên <Ten_MaSinhVien_MyList>.txt
           (ví dụ, NguyenVanA_123456_MyList.txt)
         - Nộp kết quả chạy chương trình (file text trên) cùng với các file source code.
         */
    }


    public static void print(MyList array){
        for (int i = 0 ; i < array.size(); i++){
            System.out.print(array.get(i) + " ");
        }
        System.out.println();
    }
    public static void testMyArrayList() {
        MyList array = new MyArrayList();
        int year = 2000;
        int page = 50;
        for (int i = 0; i < 10; i++, year++, page++){
            array.append(new Book("Book" + (i + 1), year, page));
        }
        BookManager bookManager = new BookManager(array);
        System.out.println("Test add: ");
        print(array);
        System.out.println();

        MyList sortByTitleAscending = bookManager.sortByTitle(true);
        System.out.println("Test Ascending by tittle:");
        print(sortByTitleAscending);
        System.out.println();

        MyList sortByTitleDecending = bookManager.sortByTitle(false);
        System.out.println("Test Decending by tittle: ");
        print(sortByTitleDecending);
        System.out.println();


        MyList sortByPageAscending = bookManager.sortByPageNumber(true);
        System.out.println("Test Ascending by Page nummber:");
        print(sortByPageAscending);
        System.out.println();


        MyList sortByPageDecending = bookManager.sortByPageNumber(false);
        System.out.println("Test Decending by Page Number: ");
        print(sortByPageDecending);
        System.out.println();


        /*
         TODO

         - Tạo ra một list kiểu MyArrayList có ít nhất 10 Book.

         - Sử dụng BookManager để
             + Sắp xếp và in ra danh sách các Book theo thứ tự tăng dần theo title.
             + Sắp xếp và in ra danh sách các Book theo thứ tự giảm dần theo title.
             + Sắp xếp và in ra danh sách các Book theo thứ tự tăng dần theo số trang.
             + Sắp xếp và in ra danh sách các Book theo thứ tự giảm dần theo số trang.
         */
    }

    public static void testMyLinkedList() {
        MyList array = new MyLinkedList();
        int year = 2000;
        int page = 50;
        for (int i = 0; i < 10; i++, year++, page++){
            array.append(new Book("Book" + (i + 1), year, page));
        }

        BookManager bookManager = new BookManager(array);
        System.out.println("Test add: ");
        print(array);
        System.out.println();

        MyList sortByTitleAscending = bookManager.sortByTitle(true);
        System.out.println("Test Ascending by tittle:");
        print(sortByTitleAscending);
        System.out.println();

        MyList sortByTitleDecending = bookManager.sortByTitle(false);
        System.out.println("Test Decending by tittle: ");
        print(sortByTitleDecending);
        System.out.println();

        MyList sortByPageAscending = bookManager.sortByPageNumber(true);
        System.out.println("Test Ascending by Page nummber:");
        print(sortByPageAscending);
        System.out.println();

        MyList sortByPageDecending = bookManager.sortByPageNumber(false);
        System.out.println("Test Decending by Page Number: ");
        print(sortByPageDecending);
        System.out.println();
        /*
         TODO

         - Tạo ra một list kiểu MyLinkedList có ít nhất 10 Book.

         - Sử dụng BookManager để
             + Sắp xếp và in ra danh sách các Book theo thứ tự tăng dần theo tên sách.
             + Sắp xếp và in ra danh sách các Book theo thứ tự giảm dần theo tên sách.
             + Sắp xếp và in ra danh sách các Book theo thứ tự tăng dần theo số trang.
             + Sắp xếp và in ra danh sách các Book theo thứ tự giảm dần theo số trang.
         */
    }

    public static void testIterator(MyList myList) {

        MyIterator test = myList.iterator();
        while (test.hasNext()){
            System.out.print(test.next() + " ");
        }
        System.out.println();

        /*
         TODO

         Sử dụng iterator duyệt qua tất cả các phần tử trong danh sách myList và in ra thông tin về phần tử đó.
         */
    }
}
