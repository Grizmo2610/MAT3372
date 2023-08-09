package exercisesonclasses.mycomplex;

public class TestMyComplex {
    public static void main(String[] args) {
        MyComplex complex1 = new MyComplex(1,2);
        MyComplex complex2 = new MyComplex(2,3);

        System.out.println("My complex: " + complex1);
        System.out.println("Argument: " + complex1.argument());
        System.out.println("Magnitude: " + complex1.magnitude());
        System.out.println("Right complex: " + complex2);
        System.out.println("Conjugate: " + complex1.conjugate());
        System.out.println("Add complex: " + complex1.addNew(complex2));
        System.out.println("Multiply complex: " + complex1.multiplyNew(complex2));
        System.out.println("Divide complex: " + complex1.divide(complex2));


    }
}
