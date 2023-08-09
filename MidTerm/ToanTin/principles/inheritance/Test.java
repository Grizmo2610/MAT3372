package oop.principles.inheritance;

public class Test {
    public static void main(String[] args) {
        Square rectangle = new Square(2);
        
        // Lớp Square kế thừa phương thức Area từ lớp Rentangle
        System.out.println(rectangle.getArea());


    }
}
