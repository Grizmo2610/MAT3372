package inheritance.animal;

public class Cat extends Mammal{
    public Cat(String name) {
        super(name);
    }
    public void greets(){
        System.out.println("Moew");
    }
    @Override
    public String toString() {
        return "Cat[" + super.toString() + "]";
    }
}
