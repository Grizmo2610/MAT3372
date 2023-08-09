package oop.principles.encapsulation;

public class Test {
    public static void main(String[] args) {
        Point point = new Point(2,3);
        System.out.println(point);

        // System.out.println(point.x); -> Không thể truy cập vào biến x ở ngoài class

        point.setX(10); // Phải sử dụng phương thức set để có thể thay đổi biến x
        System.out.println(point.getX()); // Phải sử dụng phương thức get để lấy giá trị của biến x
    }
}
