package a3.students;

public class MyLinkedList extends MyAbstractList {
    private MyLinkedListNode head;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyLinkedList() {
        head = null;
    }

    /**
     * Lấy kích thước của list.
     * @return
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Lấy phần tử ở vị trí index trong list.
     * @param index
     * @return
     */
    @Override
    public Object get(int index) {
        if (index == 0)
            return head;
        MyLinkedListNode node = head;
        for (int i = 0; i < index; i++){
            node = node.getNext();
        }return node.getPayload();
    }

    /**
     * Sửa phần tử ở vị trí index là payload.
     * @param payload
     * @param index
     */
    @Override
    public void set(Object payload, int index) {
        MyLinkedListNode node = getNodeByIndex(index);
        node = new MyLinkedListNode(payload, node.getNext());
    }

    /**
     * Xóa phần tử của list ở vị trí index.
     * @param index
     */
    @Override
    public void remove(int index) {
        if (index == 0){
            this.head = head.getNext();
        }
        MyLinkedListNode node = getNodeByIndex(index - 1);
        node.setNext(node.getNext().getNext());
        size--;
    }

    /**
     * Thêm vào cuối list phần tử có dữ liệu payload.
     * @param payload
     */
    @Override
    public void append(Object payload) {
        if (this.head == null){
            this.head = new MyLinkedListNode(payload);
        }else {
            MyLinkedListNode node = head;
            while (node.getNext() != null){
                node = node.getNext();
            }
            node.setNext(new MyLinkedListNode(payload));
        }size++;
    }

    /**
     * Thêm vào list phần tử có dữ liệu payload ở vị trí index.
     * @param payload
     * @param index
     */
    @Override
    public void insert(Object payload, int index) {
        MyLinkedListNode node = getNodeByIndex(index);
        size++;
    }

    /**
     * Tạo iterator để cho phép duyệt qua các phần tử của list.
     * @return
     */
    @Override
    public MyIterator iterator() {
        return new MyLinkedListIterator(head);
    }

    /**
     * Lấy node ở vị trí index.
     * @param index
     * @return
     */
    private MyLinkedListNode getNodeByIndex(int index) {
        if (head == null){
            throw new NullPointerException("Header is null!");
        } else if (index >= size){
            throw new ArrayIndexOutOfBoundsException();
        }

        MyLinkedListNode node = head;
        for (int i = 0; i < index; i++){
            node = node.getNext();
        }
        return node;
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        result.append("[ ");
        MyLinkedListNode node = this.head;
        while (node != null){
            result.append(node.getPayload());
            if (node.getNext() != null){
                result.append(", ");
            }
            node = node.getNext();
        }
        return result.append("]").toString();
    }
}
