package exercisesonclasses.polynomial;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double[] coeffs) {
        this.coeffs = coeffs;
    }

    public double[] getCoeffs() {
        return coeffs;
    }

    public void setCoeffs(double[] coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree(){
        return coeffs.length - 1;
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        for (int i = coeffs.length - 1; i > 0; i--){
            result.append(coeffs[i]).append("x^").append(i).append(" + ");
        }

        result.append(coeffs[0]);
        return result.toString();
    }

    public double evaluate(double x){
        double result = coeffs[coeffs.length - 1];
        for (int i = coeffs.length - 2; i >=0 ; i --){
            result = result * x + this.coeffs[i];
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial right){
        int maxDegree = Math.max(getDegree(), right.getDegree());
        int minDegree = Math.min(getDegree(), right.getDegree());
        double[] newCoffes = new double[maxDegree + 1];
        for (int i = 0; i <= minDegree; i++){
            newCoffes[i] = right.coeffs[i] + coeffs[i];
        }

        if (this.getDegree() < right.getDegree()){
            for (int i = minDegree + 1; i <= maxDegree; i++)
                newCoffes[i] += right.coeffs[i];
        }

        else if (this.getDegree() > right.getDegree()){
            for (int i = minDegree + 1; i <= maxDegree; i++)
                newCoffes[i] += coeffs[i];
        }

        return new MyPolynomial(newCoffes);
    }

    public MyPolynomial multiply(MyPolynomial right){
        double[] newCoffes = new double[this.getDegree() + right.getDegree() + 1];
        for (int i = 0; i < this.coeffs.length; i++)
            for (int j = 0; j < right.coeffs.length; j++)
                newCoffes[i + j] = coeffs[i] * right.getCoeffs()[j];
        return new MyPolynomial(newCoffes);
    }
}
