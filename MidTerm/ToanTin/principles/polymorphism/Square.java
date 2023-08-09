package oop.principles.polymorphism;
public class Square extends Rectangle {
    public Square(int size) {
        super(size, size);
    }

    @Override
    public void display(){
        System.out.println("Square!");
    }

}
