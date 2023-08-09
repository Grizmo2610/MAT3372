package collections.polynomials;

public class ArrayPoly extends AbstractPoly {
    private double[] coefficients;

    public ArrayPoly(double[] coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public double[] coefficients() {
        return coefficients;
    }

    @Override
    public double coefficient(int base) {
        return coefficients[base];
    }

    @Override
    public int degree() {
       return coefficients.length - 1;
    }


    public void remove(int index) {
        double[] temp = new double[coefficients.length - 1];
        System.arraycopy(coefficients, 0, temp, 0, index);
        System.arraycopy(coefficients, index + 1, temp, index + 1 - 1, coefficients.length - (index + 1));
        coefficients = temp;
    }
    @Override
    public Poly derivative() {
        for (int i = 0; i < coefficients.length; i++){
            coefficients[i] *= degree() - i;
        }
        remove(coefficients.length - 1);
        return this;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < coefficients.length; i++){
            if (coefficients[i] != 0 && coefficients[i] != 0){
                if (i > 0)
                    if (coefficients[i] < 0)
                        sb.append("-");
                    else
                        sb.append("+");

                if (i < coefficients.length - 2){
                    if (Math.abs(coefficients[i]) != 1)
                        sb.append(Math.abs(coefficients[i]));
                    sb.append("x^").append(coefficients.length- i - 1);
                } else if (i == coefficients.length - 2){
                    if (Math.abs(coefficients[i]) != 1)
                        sb.append(Math.abs(coefficients[i]));
                    sb.append("x");
                } else{
                    sb.append(Math.abs(coefficients[i]));
                }
            }
        }
        return sb.toString();
    }
}
