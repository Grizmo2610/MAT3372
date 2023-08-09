package a4.mylist;

public class MyArrayListIterator implements MyIterator {
    /* GỢI Ý: */
    /*
    a4.mylist.MyArrayListIterator cần phải tham chiếu đến dữ liệu của a4.mylist.MyArrayList để có thể duyệt qua
    các phần tử trong dữ liệu của a4.mylist.MyArrayList.
     */
    private Object[] data;

    /*
    a4.mylist.MyArrayListIterator cần phải biết vị trí hiện tại khi nó đang duyệt qua dữ liệu của a4.mylist.MyArrayList.
     */
    private int currentPosition;

    /**
     * Khởi tạo dữ liệu cho Iterator bằng dữ liệu của a4.mylist.MyArrayList để nó có thể duyệt qua các phần tử dữ liệu
     * của a4.mylist.MyArrayList.
     * @param data
     */
    public MyArrayListIterator(Object[] data) {
        this.data = data;
    }

    /**
     * Kiểm tra trong a4.mylist.MyArrayList có còn phần tử tiếp theo không.
     * Nếu còn thì trả về true, nếu không còn thì trả về false.
     * @return
     */
    @Override
    public boolean hasNext() {
        return data[currentPosition + 1] != null;
    }

    /**
     * iterator dịch chuyển sang phần tử kế tiếp của a4.mylist.MyArrayList và trả ra phần tử hiện tại của a4.mylist.MyArrayList.
     * @return phần tử hiện tại.
     */
    @Override
    public Object next() {
        currentPosition++;
        return data[currentPosition];
    }
}
