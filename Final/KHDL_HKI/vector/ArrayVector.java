package vector;

public class ArrayVector implements IVector {
    private double[] data;
    private int length;

    public ArrayVector() {
         data = new double[5];
         length = 0;
    }

    public ArrayVector(double[] coefficients) {
        data = new double[coefficients.length * 2];
        System.arraycopy(coefficients, 0, data,0,coefficients.length);
        length = coefficients.length;
    }

    /*
    * Hàm tăng số phần tử của mảng lên gấp đôi.
    * Do mảng không thay đổi được số phần tử sau khi đã cấp phát, nên để tăng
    * số phần tử của mảng, cần phải cấp phát lại mảng khác có số phần tử gấp đôi,
    * sau đó copy những phần tử của mảng cũ sang mảng mới.
    */
    private void extend() {
        double[] temp = new double[2 * length];
        System.arraycopy(data, 0, temp,0,length);
        data = temp;
    }

    /*
    * Hàm thêm một phần tử vào cuối vector.
    * Kiểm tra xem mảng còn chỗ để thêm phần tử mới không, nếu không còn chỗ
    * thì cần phải cấp phát một mảng lớn hơn.
    */
    @Override
    public void append(double value) {
        if (length == data.length - 2)
            extend();
        data[length] = value;
        length++;
    }

    /*
     * Hàm thêm một phần tử vào vector ở vị trí index.
     * Kiểm tra xem mảng còn chỗ để thêm phần tử mới không, nếu không còn chỗ
     * thì cần phải cấp phát một mảng lớn hơn.
     */
    @Override
    public void insert(double value, int index) {
        if (index < 0 || index > length)
            throw new ArrayIndexOutOfBoundsException();
        else if (length == data.length - 2)
            extend();

        for (int i = length; i > index; i--)
            data[i] = data[i - 1];
        data[index] = value;
        length++;
    }

    /*
    * Hàm xóa một phần tử của vector ở vị trí index.
    */
    @Override
    public void remove(int index) {
        for (int i = index; i < length; i++)
            data[i] = data[i + 1];
        length--;
    }

    @Override
    public int length() {
        return length;
    }

    @Override
    public double magnitude() {
        double result = 0;
        for (int i = 0 ; i < length; i++)
            result += data[i] * data[i];
        return result;
    }

    private void checkValid(int length){
        if (length != this.length)
            throw new NullPointerException();
    }

    public double distanceTo(ArrayVector another) {
        checkValid(another.length);
        double result = 0;
        for (int i = 0; i < length; i++)
            result += (another.element(i) -data[i]) * (another.element(i) -data[i]);
        return result;
    }

    @Override
    public double[] elements() {
        return data;
    }

    @Override
    public double element(int index) {
        return data[index];
    }

    public ArrayVector minus(ArrayVector another) {
        checkValid(another.length);
        for (int i = 0 ; i < length; i++)
            data[i] -= another.data[i];
        return this;
    }

    public ArrayVector plus(ArrayVector another) {
        checkValid(another.length);
        for (int i = 0 ; i < length; i++)
            data[i] += another.data[i];
        return this;
    }

    public ArrayVector scale(double factor) {
        for (int i = 0; i < length; i++)
            data[i] *= factor;
        return this;
    }

    public double dot(ArrayVector another) {
        checkValid(another.length);
        double result = 0;
        for (int i = 0;i < length; i++)
            result = data[i] * another.data[i];
        return result;
    }

    /*
    * Hàm trả ra format của vector dạng: [a1, a2, ..., an].
    */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("[");
        for (int i = 0; i < length;i++){
            result.append(data[i]);
            if (i != length - 1)
                result.append(", ");
        }
        return result.append("]").toString();
    }
}
