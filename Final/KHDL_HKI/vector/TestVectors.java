package vector;

import java.util.ArrayList;
import java.util.List;

public class TestVectors {
    public static void main(String[] args) {
        System.out.println("Test Array Vector: ");
        testArrayVector();

        System.out.println();

        System.out.println("Test List Vector: ");
        testListVector();
    }

    public static void testArrayVector(){
        IVector vector = new ArrayVector();
        for (int i = 0 ; i < 10; i++)
            vector.append(i);
        System.out.println("Test Append: " + vector);

        System.out.println("\nTest Length: " + vector.length());

        vector.insert(26, 0);
        System.out.println("\nTest insert head: " + vector);

        vector.insert(26, vector.length() );
        System.out.println("\nTest insert tail: " + vector);

        vector.remove(0);
        vector.remove(vector.length() - 1);
        System.out.println("\nTest remove: " + vector);

        System.out.println("\nTest magnitude: " + vector.magnitude());


        double[] temp = new double[10];
        for (int i = 0 ; i < temp.length; i++)
            temp[i] = i + 10;
        IVector vector2 = new ArrayVector(temp);
        System.out.println("\nVector2: " + vector2);


        System.out.println("\nTest dinstance to: " +
                                   ((ArrayVector) vector).distanceTo((ArrayVector) vector2));

        System.out.println("\nTest minus: " +
                                   ((ArrayVector) vector).minus((ArrayVector) vector2));

        System.out.println("\nTest plus: " +
                                   ((ArrayVector) vector).plus((ArrayVector) vector2));

        System.out.println("\nTest dot: " +
                                   ((ArrayVector) vector).dot((ArrayVector) vector2));

        System.out.println("\nTest Scale: " +
                                   ((ArrayVector) vector).scale(5));
    }

    public static void testListVector(){
        IVector vector = new ListVector();
        for (int i = 0 ; i < 10; i++)
            vector.append(i);
        System.out.println("Test Append: " + vector);

        System.out.println("\nTest Length: " + vector.length());

        vector.insert(26, 0);
        System.out.println("\nTest insert head: " + vector);

        vector.insert(26, vector.length() );
        System.out.println("\nTest insert tail: " + vector);

        vector.remove(0);
        vector.remove(vector.length() - 1);
        System.out.println("\nTest remove: " + vector);

        System.out.println("\nTest magnitude: " + vector.magnitude());


        List<Double> temp = new ArrayList<Double>();
        for (Double i = 0.0; i < 10; i++)
            temp.add(i + 10);
        IVector vector2 = new ListVector(temp);
        System.out.println("\nVector2: " + vector2);

        System.out.println("\nTest dinstance to: " +
                                   ((ListVector) vector).distanceTo((ListVector) vector2));

        System.out.println("\nTest minus: " +
                                   ((ListVector) vector).minus((ListVector) vector2));

        System.out.println("\nTest plus: " +
                                   ((ListVector) vector).plus((ListVector) vector2));

        System.out.println("\nTest dot: " +
                                   ((ListVector) vector).dot((ListVector) vector2));

        System.out.println("\nTest Scale: " +
                                   ((ListVector) vector).scale(5));
    }
}

