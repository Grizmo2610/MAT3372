package Iterator.ex3;

public class MyArrayListIterator implements MyIterator {
    /* GỢI Ý: */
    /*
    mylist.MyArrayListIterator cần phải tham chiếu đến dữ liệu của mylist.MyArrayList để có thể duyệt qua
    các phần tử trong dữ liệu của mylist.MyArrayList.
     */
    private Object[] data;

    /*
    mylist.MyArrayListIterator cần phải biết vị trí hiện tại khi nó đang duyệt qua dữ liệu của mylist.MyArrayList.
     */
    private int currentPosition;

    /**
     * Khởi tạo dữ liệu cho Iterator bằng dữ liệu của mylist.MyArrayList để nó có thể duyệt qua các phần tử dữ liệu
     * của mylist.MyArrayList.
     * @param data
     */
    public MyArrayListIterator(Object[] data) {
        this.data = data;
    }

    /**
     * Kiểm tra trong mylist.MyArrayList có còn phần tử tiếp theo không.
     * Nếu còn thì trả về true, nếu không còn thì trả về false.
     * @return
     */
    @Override
    public boolean hasNext() {
        return data[currentPosition + 1] != null;
    }

    /**
     * iterator dịch chuyển sang phần tử kế tiếp của mylist.MyArrayList và trả ra phần tử hiện tại của mylist.MyArrayList.
     * @return phần tử hiện tại.
     */
    @Override
    public Object next() {
        currentPosition++;
        return data[currentPosition];
    }
}
