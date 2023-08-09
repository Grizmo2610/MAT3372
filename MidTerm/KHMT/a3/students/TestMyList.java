package a3.students;

public class TestMyList {
    public static void main(String[] args) {
        System.out.println("Test array list: ");
        testMyArrayList();

        System.out.println();

        System.out.println("Test linked list: ");
        testMyLinkedList();

        System.out.println();


        MyList list = new MyArrayList();
        for (int i = 0; i < 50; i++){
            list.append(i);
        }
        System.out.println("Test Iterator:");
        testIterator(list);
        /*
         TODO

         - Chạy demo các hàm test.
         - Lưu kết quả chạy chương trình vào file text có tên <Ten_MaSinhVien_MyList>.txt
           (ví dụ, NguyenVanA_123456_MyList.txt)
         - Nộp kết quả chạy chương trình (file text trên) cùng với các file source code.
         */
    }

    public static void testMyArrayList() {
        String[] names = {"Nam", "Tu", "Trang","Vu"};
        String[] lnames = {"Hoang", "Nguyen", "Lo","Bui"};
        MyList list = new MyArrayList();
        double mark = 0;
        for (String name : names) {
            for (String lname : lnames) {
                list.append(new Student(name, lname, mark / 4.0));
                mark++;
            }
        }
        System.out.println("Test append: " + list.size());

        list.insert(new Student("Grizmo","Gri",4.0), 0);
        System.out.println("Test insert: " + list.size() + " " + list.get(0));


        list.remove(0);
        System.out.println("Test remove: " + list.size() + " " + list.get(0));

        StudentStatistics statistics = new StudentStatistics(list);
        System.out.println("Test sort ascending by average:");
        System.out.println(statistics.sortByAverage(true));

        System.out.println("Test sort descending by average:");
        System.out.println(statistics.sortByAverage(false));
        /*
         TODO

         - Tạo ra một list kiểu MyArrayList có ít nhất 10 Student.

         - Sử dụng StudentStatistics để
             + Sắp xếp và in ra danh sách các Student theo thứ tự tăng dần theo tên và họ.
             + Sắp xếp và in ra danh sách các Student theo thứ tự giảm dần theo tên và họ.
             + Sắp xếp và in ra danh sách các Student theo thứ tự tăng dần về average.
             + Sắp xếp và in ra danh sách các Student theo thứ tự giảm dần về average.
         */
    }

    public static void testMyLinkedList() {
        String[] names = {"Nam", "Tu", "Trang","Vu", "Phuong"};
        String[] lnames = {"Hoang", "Nguyen"};
        MyList list = new MyLinkedList();
        double mark = 1;
        for (String name : names) {
            for (String lname : lnames) {
                list.append(new Student(name, lname, mark / 4.0));
                mark++;
            }
        }
        System.out.println("Test append: " + list.size());

        list.insert(new Student("Grizmo","Gri",4.0), 0);
        System.out.println("Test insert: " + list.size() + " " + list.get(0));


        list.remove(0);
        System.out.println("Test remove: " + list.size() + " " + list.get(0));

        StudentStatistics statistics = new StudentStatistics(list);
        System.out.println("Test sort ascending by average:");
        System.out.println(statistics.sortByAverage(true));

        System.out.println("Test sort descending by average:");
        System.out.println(statistics.sortByAverage(false));

        /*
         TODO

         - Tạo ra một list kiểu MyLinkedList có ít nhất 10 Student.

         - Sử dụng StudentStatistics để
             + Sắp xếp và in ra danh sách các Student theo thứ tự tăng dần theo tên và họ.
             + Sắp xếp và in ra danh sách các Student theo thứ tự giảm dần theo tên và họ.
             + Sắp xếp và in ra danh sách các Student theo thứ tự tăng dần về average.
             + Sắp xếp và in ra danh sách các Student theo thứ tự giảm dần về average.
         */
    }

    public static void testIterator(MyList myList) {
        MyIterator iterator = myList.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
        /*
         TODO

         Sử dụng iterator duyệt qua tất cả các phần tử trong danh sách myList và in ra thông tin về phần tử đó.
         */
    }
}
