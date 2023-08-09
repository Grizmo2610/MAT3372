package inheritance.animal;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal("Bob");
        System.out.println("Animal: " + animal);

        Mammal mammal = new Mammal("Jame");
        System.out.println("Mammal: " + mammal);

        Cat cat = new Cat("Jame");
        System.out.println("Cat: " + cat);
        cat.greets();

        Dog dog = new Dog("Bob");
        System.out.println("Dog: " + dog);

        dog.greets();
    }
}
