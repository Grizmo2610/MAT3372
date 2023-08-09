package Iterator.ex3;

public class TestMyList {
    public static void main(String[] args) {
        MyList list = new MyArrayList();
        for (int i = 0; i < 10; i++){
            list.append(i);
        }
        System.out.println("Test Iterator: ");
        testIterator(list);
    }




    public static void testIterator(MyList myList) {

        MyIterator test = myList.iterator();
        while (test.hasNext()){
            System.out.print(test.next() + " ");
        }
        System.out.println();
    }
}
