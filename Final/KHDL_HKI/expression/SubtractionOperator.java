package expression;

public class SubtractionOperator implements Operator {
    @Override
    public double doOperation(Evaluable leftOperand, Evaluable rightOperand) {
        return leftOperand.evaluate() - rightOperand.evaluate();
    }
}
