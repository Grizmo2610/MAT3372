package expression;

public class DivisionOperator implements Operator {
    @Override
    public double doOperation(Evaluable leftOperand, Evaluable rightOperand) {
        return leftOperand.evaluate() / rightOperand.evaluate();
    }
}
