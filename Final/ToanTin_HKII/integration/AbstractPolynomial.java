package hus.oop.integration;

public abstract class AbstractPolynomial implements Polynomial {
    /**
     * Mô tả đa thức theo định dạng [a0 + a1x + a2x^2 + ... + anx^n]
     * @return String mô tả về đa thức.
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("[");
        for (int i = 0; i < degree() + 1; i++) {
            if (coefficient(i) != 0)
                if (i == 0){
                    result.append(coefficient(i)).append(" ");
                }else {
                    if (coefficient(i) < 0){
                        result.append("- ");
                    }else {
                        result.append("+ ");
                    }

                    if (coefficient(i) != 1){
                        result.append(Math.abs(coefficient(i)));
                    }

                    if (i == 1){
                        result.append("x ");
                    }else {
                        result.append("x^").append(i).append(" ");
                    }
                }
        }
        return result.append("]").toString();
    }

    /**
     * Lấy đạo hàm đa thức.
     * @return mảng các phần tử là hệ số của đa thức đạo hàm.
     */
    public double[] differentiate() {
        double[] result = new double[degree() + 1];
        for (int i = 1, index = 0; i < degree() + 1; i++, index++)
            result[index] = (i * coefficient(i));
        return result;
    }
}
