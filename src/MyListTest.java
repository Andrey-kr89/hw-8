import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class MyListTest {
    public static void main(String[] args) {

//        MyArrayList<String> arr = new MyArrayList<>();
//        arr.add("r");
//        arr.add("wfs");
//        arr.add("asdasd");
//        arr.add("sdc");
//        arr.print();
//        arr.remove(2);
//        arr.add("32332");
//        arr.print();
//        arr.add("222222");
//        arr.print();

//        MyLinkedList<String> li = new MyLinkedList<>();
//        li.add("zero");
//        li.add("first");
//        li.add("second");
//        li.add("third");
//        li.add("fourth");
//        li.add("fifth");
//        li.add("sixth");
//        li.print();
//        System.out.println(li.size());
//        li.remove(2);
//        li.print();
//        System.out.println(li.get(5));
//        System.out.println(li.size());

        MyQueue<String> qu = new MyQueue<>();
        qu.add("zero");
        qu.add("first");
        qu.add("second");
        qu.add("third");
        qu.add("fourth");
        qu.add("fifth");
        qu.add("sixth");
        qu.print();
        System.out.println();
        System.out.println(qu.poll());
        qu.print();
        System.out.println();
        System.out.println(qu.peek());

    }
}
