package collections.list;

public class Test {
    public static void main(String[] args) {
        List linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        System.out.println("Test LinkedList: " + linkedList);
        linkedList.add(10, 1);
        System.out.println("Test add with index: " + linkedList);
        linkedList.remove(2);
        System.out.println("Test remove: " + linkedList);
        System.out.println("Get value at 0: " + linkedList.get(0));
        System.out.println("Size: " + linkedList.size());

        System.out.println();
        List arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println("Test Array list: " + arrayList);
        arrayList.add(10, 2);
        System.out.println("Test add with index: " + arrayList);
        arrayList.remove(2);
        System.out.println("Test remove: " + arrayList);
        System.out.println("Get value at 2: " + arrayList.get(2));
        System.out.println("Size: " + arrayList.size());
    }
}
