package oop.books;

public class MyLinkedList extends MyAbstractList {
    private MyLinkedListNode head;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyLinkedList() {
        size = 0;
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
     *
     * @param index
     * @return
     */
    private MyLinkedListNode getNodeByIndex(int index) {
        if (index == 0){
            return this.head;
        }
        int count = 0;
        MyLinkedListNode node = head;
        while (node != null) {
            if (count == index) {
                return node;
            }
            count++;
            node = node.getNext();
        }
        return null;
    }

    /**
     * Lấy phần tử ở vị trí index trong list.
     * @param index
     * @return
     */
    @Override
    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return getNodeByIndex(index).getPayload();
    }

    /**
     * Sửa phần tử ở vị trí index là payload.
     * @param payload
     * @param index
     */
    @Override
    public void set(Object payload, int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (index == 0) {
            MyLinkedListNode temp = new MyLinkedListNode(payload, head.getNext());
            head = temp;
        } else {
            MyLinkedListNode temp = new MyLinkedListNode(payload);
            MyLinkedListNode temp2 = head;
            for (int i = 1; i < index; i += 1) {
                temp2 = temp2.getNext();
            }
            temp.setNext(temp2.getNext().getNext());
            temp2.setNext(temp);
        }
    }

    /**
     * Xóa phần tử của list ở vị trí index.
     * @param index
     */
    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (index == 0) {
            head = head.getNext();
        } else {
            MyLinkedListNode temp = head;
            for (int i = 1; i < index; i += 1) {
                temp = temp.getNext();
            }
            temp.setNext(temp.getNext().getNext());
        }size--;
    }

    /**
     * Thêm vào cuối list phần tử có dữ liệu payload.
     * @param payload
     */
    @Override
    public void append(Object payload) {
        MyLinkedListNode newNode = new MyLinkedListNode(payload);
        if (this.head == null)
            this.head = newNode;
        else {
            MyLinkedListNode node = head;
            while (node.getNext() != null) {
                node = node.getNext();
            }
            node.setNext(newNode);
        }
        size++;
    }

    /**
     * Thêm vào list phần tử có dữ liệu payload ở vị trí index.
     * @param payload
     * @param index
     */
    @Override
    public void insert(Object payload, int index) {
        if (index == 0) {
            MyLinkedListNode newNode = new MyLinkedListNode(payload, head);
            head = newNode;
        } else {
            MyLinkedListNode temp = head;
            for (int i = 1; i < index; i += 1) {
                MyLinkedListNode newNode = new MyLinkedListNode(payload, temp.getNext());
                temp.setNext(newNode);
            }
        }size++;
    }

    /**
     * Tạo iterator để cho phép duyệt qua các phần tử của list.
     * @return
     */
    @Override
    public MyIterator iterator() {
        return new MyLinkedListIterator(head);
    }

}
