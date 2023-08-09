package animal;

public class TestMain {
    public static void main(String[] args) {
        Animal cat = new Cat("Tom");

        System.out.print("Test greets: ");
        cat.greets();

        Animal dog = new Dog("Tyke");

        System.out.print("Test greets: ");
        dog.greets();

        System.out.print("Test greets (another dog): ");
        ((Dog) dog).greets(new Dog("Bob"));

        Animal bigDog = new BigDog("Spike");

        System.out.print("Test greets: ");
        bigDog.greets();

        System.out.print("Test greets (another dog): ");
        ((BigDog) bigDog).greets(new Dog("Bob"));

        System.out.print("Test greets (another big dog): ");
        ((BigDog) bigDog).greets(new BigDog("Bob"));
    }
}
