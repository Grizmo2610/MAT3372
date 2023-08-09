package ExercisesOnDecisionAndLoop;

public class ComputePI {
    public static double computePI(){
        int sign = 1;
        double sum = 0;
        for (int i = 1; i <100000000; i += 2){
            sum += sign * 1.0 / i;
            sign *= -1;
        }
        return 4 * sum;
    }
    public static void main(String[] args) {
        System.out.println("PI value is: " + computePI());
    }
}
