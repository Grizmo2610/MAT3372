package collections.list;

public class LinkedList extends AbstractList {
    private int size = 0;
    private Node head = null;

    public LinkedList() {
    }

    private Node getNodeByIndex(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    @Override
    public void add(Object data, int index) {
        Node newNode = new Node(data);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node prevNode = getNodeByIndex(index);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }
        size++;
    }

    @Override
    public void add(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
        size++;
    }

    @Override
    public void remove(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node prevNode = getNodeByIndex(index - 1);
            prevNode.next = prevNode.next.next;
        }
        size--;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Object get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return getNodeByIndex(index).value;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node node = head;
        while (node != null) {
            result.append(node.value);
            if (node.next != null) {
                result.append(" ");
            }
            node = node.next;
        }
        return result.toString();
    }
}
