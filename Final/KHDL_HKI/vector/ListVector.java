package vector;

import java.util.ArrayList;
import java.util.List;

public class ListVector implements IVector {
    private List<Double> data;

    public ListVector() {
        data = new ArrayList<Double>();
    }

    public ListVector(List<Double> data) {
        this.data = data;
    }

    @Override
    public void append(double value) {
        data.add(value);
    }

    @Override
    public void insert(double value, int index) {
        data.add(index, value);
    }

    @Override
    public void remove(int index) {
        data.remove(index);
    }

    @Override
    public int length() {
        return data.size();
    }

    @Override
    public double magnitude() {
        double result = 0;
        for (Double datum : data)
            result += datum * datum;
        return result;
    }

    private void checkValid(int length){
        if (length != length())
            throw new NullPointerException();
    }

    public double distanceTo(ListVector another) {
        checkValid(another.length());
        double result = 0;
        for (int i = 0; i < length(); i++)
            result += (another.element(i) - data.get(i)) * (another.element(i) - data.get(i));
        return result;
    }

    @Override
    public double[] elements() {
        double[] result = new double[data.size()];
        for (int i = 0 ; i < result.length; i++)
            result[i] = data.get(i);
        return result;
    }

    public double element(int index) {
        return data.get(index);
    }

    public ListVector minus(ListVector another) {
        checkValid(another.length());
        for (int i = 0 ; i < length(); i++)
            data.set(i, element(i) - another.element(i));
        return this;
    }

    public ListVector plus(ListVector another) {
        checkValid(another.length());
        for (int i = 0 ; i < length(); i++)
            data.set(i, element(i) + another.element(i));
        return this;
    }

    public ListVector scale(double factor) {
        for (int i = 0 ; i < length(); i++)
            data.set(i, element(i) * factor);
        return this;
    }

    public double dot(ListVector another) {
        checkValid(another.length());
        double result = 0;
        for (int i = 0 ; i < length(); i++)
            result = element(i) * another.element(i);
        return result;
    }

    /*
     * Hàm trả ra format của vector dạng: [a1, a2, ..., an].
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("[");
        for (int i = 0; i < length();i++){
            result.append(data.get(i));
            if (i != length() - 1)
                result.append(", ");
        }
        return result.append("]").toString();
    }
}
