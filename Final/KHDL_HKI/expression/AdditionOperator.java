package expression;

public class AdditionOperator implements Operator {
    @Override
    public double doOperation(Evaluable leftOperand, Evaluable rightOperand) {
        return leftOperand.evaluate() + rightOperand.evaluate();
    }
}
