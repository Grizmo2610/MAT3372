package oop.principles.polymorphism;

public class Test {
    public static void main(String[] args) {
        Rectangle shape = new Square(2);
        shape.display(); // Phương thức display ghi đè lên phương thức display ở lớp cha
    }
}
