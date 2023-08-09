package expression;

public class MultiplicationOperator implements Operator {
    @Override
    public double doOperation(Evaluable leftOperand, Evaluable rightOperand) {
        return leftOperand.evaluate() * rightOperand.evaluate();
    }
}
