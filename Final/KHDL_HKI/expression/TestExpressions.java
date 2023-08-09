package expression;

public class TestExpressions {
    public static void main(String[] args) {
        Evaluable left = new Operand(1);
        Evaluable right = new Operand(2);

        Operator add = new AdditionOperator();
        Operator mul = new MultiplicationOperator();
        Operator sub = new SubtractionOperator();

        Evaluable e1 = new Operand(new Expression(left, right, add).evaluate());
        Evaluable e2 = new Operand(new Expression(e1, new Operand(3), mul).evaluate());
        Evaluable e3 = new Operand(new Expression(e2, new Operand(4), sub).evaluate());
        System.out.println(e3.evaluate());

        /* TODO */
        /* Viết code đề mô tính biểu thức (1 + 2) * 3 - 4 */
    }
}
