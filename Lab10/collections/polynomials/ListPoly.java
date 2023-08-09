package collections.polynomials;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListPoly extends AbstractPoly{
    protected List<Double> coefficients;

    public ListPoly(Double[] coefficients) {
        this.coefficients = Arrays.asList(coefficients);
    }

    @Override
    public double[] coefficients() {
        double[] doubles = new double[coefficients.size()];
        for (int i = 0; i < coefficients.size(); i++){
            doubles[i] = coefficients.get(i);
        }
        return doubles;

    }

    @Override
    public double coefficient(int base) {
        return coefficients.get(base);
    }

    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

    @Override
    public Poly derivative() {
        for (int i = 0; i < coefficients.size(); i++){
            coefficients.set(i, (degree() - i) *  coefficients.get(i));
        }
        List<Double> temp = new ArrayList<Double>();
        for (int i = 0; i < coefficients.size() - 1; i++){
            temp.add(coefficients.get(i));
        }
        coefficients = temp;
        return this;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < coefficients.size(); i++){
            if (coefficients.get(i) != 0 && coefficients.get(i)!= 0){
                if (i > 0)
                    if (coefficients.get(i) < 0)
                        sb.append("-");
                    else
                        sb.append("+");
                if (i < coefficients.size() - 2){
                    if (Math.abs(coefficients.get(i)) != 1)
                        sb.append(Math.abs(coefficients.get(i)));
                    sb.append("x^").append(coefficients.size() - i - 1);
                } else if (i == coefficients.size() - 2){
                    if (Math.abs(coefficients.get(i)) != 1)
                        sb.append(Math.abs(coefficients.get(i)));
                    sb.append("x");
                } else{
                    sb.append(Math.abs(coefficients.get(i)));
                }
            }
        }
        return sb.toString();
    }
}
