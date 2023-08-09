package a4.statistics;

public class ArrayDataSet extends AbstractDataSet {
    private static final int DEFAULT_CAPACITY = 2;
    private double[] data;
    private int size;

    /**
     * Hàm dựng để khởi tạo dữ liệu.
     */
    public ArrayDataSet() {
        data = new double[26];
        size = 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public double element(int index) {
        return data[index];
    }

    @Override
    public double[] elements(int from, int to) {
        double[] result = new double[to - from + 1];
        System.arraycopy(data, from, result,0,to - from + 1);
        return result;
    }

    /**
     * Thêm phần tử dữ liệu vào cuối mảng dữ liệu.
     * Nếu mảng không còn chỗ, mở rộng mảng để có thể chứa thêm dữ liệu.
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void append(double value) {
        if (this.size == data.length - 1){
            enlarge();
        }
        data[size] = value;
        size++;
    }

    /**
     * Thêm phần tử dữ liệu vào vị trí index của mảng dữ liệu.
     * Nếu mảng không còn chỗ, mở rộng mảng để có thể chứa thêm dữ liệu.
     * @param value
     * @param index
     */
    @Override
    public void insert(double value, int index) {
        for (int i = size - 1; i >= index; i--){
            data[i + 1] = data[i];
        }
        data[index] = value;
        size++;
    }

    /**
     * Xóa phần tử dữ liệu tại vị trí index.
     * @param index
     */
    @Override
    public void remove(int index) {
        for (int i = index; i < size; i++){
            data[i] = data[i + 1];
        }size--;
    }

    /**
     * Xóa tất cả các phần tử dữ liệu có giá trị bằng value.
     * @param value
     */
    @Override
    public void remove(double value) {
        for (int i = 0; i < size;i++){
            if (data[i] == value){
                remove(i);
            }
        }
    }

    /**
     * Mở rộng gấp đôi kích thước mảng nếu hết chỗ để chứa dữ liệu.
     */
    private void enlarge() {
        double[] target = new double[size * 2];
        System.arraycopy(data, 0, target, 0, size);
        data = target;
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++){
            result.append(data[i]).append(" ");
        }
        return result.toString();
    }
}
