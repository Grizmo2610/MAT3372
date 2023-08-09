package a4.mylist;

public class TestMyList {
    public static void main(String[] args) {
        System.out.println("Test ArrayList: ");
        testMyArrayList();
        System.out.println();

        System.out.println("Test LinkedList: ");
        testMyLinkedList();
        System.out.println();
        /*
         * TODO
         * Chạy demo các hàm test.
         * Lưu kết quả chạy chương trình vào file text có tên <Ten_MaSinhVien_MyList>.txt
         * (ví dụ, NguyenVanA_123456_MyList.txt)
         */
    }
    public static void print(MyList array){
        for (int i = 0 ; i < array.size(); i++){
            System.out.print(array.get(i) + " ");
        }
        System.out.println();
        System.out.println();
    }
    public static void testMyArrayList() {
        MyList list = new MyArrayList();
        for (double i = 0; i < 100; i++){
            list.append((Double) i + 1);
        }
        System.out.println("Test append: ");
        print(list);

        BasicStatistic statistic = new BasicStatistic(list);
        System.out.println("Max: " + statistic.max());
        System.out.println("Min: " + statistic.min());
        System.out.println("Mean: " + statistic.mean());
        System.out.println("Variance: " + statistic.variance());
        /*
         * TODO
         * Tạo ra một list kiểu MyArrayList có các phần tử dữ liệu kiểu Double.
         * Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai).
         * In ra terminal các thông tin về dữ liệu và các đại lượng thống kê.
         */
    }

    public static void testMyLinkedList() {
        MyList list = new MyLinkedList();
        for (double i = 0; i < 100; i++){
            list.append((Double) i + 1);
        }
        System.out.println("Test append: ");
        print(list);

        BasicStatistic statistic = new BasicStatistic(list);
        System.out.println("Max: " + statistic.max());
        System.out.println("Min: " + statistic.min());
        System.out.println("Mean: " + statistic.mean());
        System.out.println("Variance: " + statistic.variance());
        /*
         * TODO
         * Tạo ra một list kiểu MyLinkedList có các phần tử dữ liệu kiểu Double.
         * Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai).
         * In ra terminal các thông tin về dữ liệu và các đại lượng thống kê.
         */
    }
}
