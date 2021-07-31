public class MyListTest {
    public static void main(String[] args) {

        MyArrayList<String> arr = new MyArrayList<>();
        arr.add("r");
        arr.add("wfs");
        arr.add("asdasd");
        arr.add("sdc");
        arr.print();
        arr.remove(2);
        arr.add("32332");
        arr.print();
        arr.add("222222");
        arr.print();

        MyLinkedList<String> li = new MyLinkedList<>();
        li.add("zero");
        li.add("first");
        li.add("second");
        li.add("third");
        li.add("fourth");
        li.add("fifth");
        li.add("sixth");
        li.print();
        System.out.println(li.size());
        li.remove(2);
        li.print();
        System.out.println(li.get(5));
        System.out.println(li.size());

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

        MyStack<String> st = new MyStack<>();
        st.add("zero");
        st.add("first");
        st.add("second");
        st.add("third");
        st.add("fourth");
        st.add("fifth");
        st.add("sixth");
        st.print();
        System.out.println();
        System.out.println(st.pop());
        st.print();
        System.out.println();
        System.out.println(st.peek());
        MyHashMap<Integer, Integer> ha = new MyHashMap<>();
        ha.put(1, 11);
        ha.put(2, 11221);
        ha.put(3, 12);
        ha.put(4, 13);
        ha.put(5, 1312);
        ha.put(5, 14);
        ha.put(6, 15);
        ha.put(6351, 16);
        ha.put(3, 1312);
        ha.put(9, 17);
        ha.put(9, 18);
        System.out.println(ha.get(1));
        System.out.println(ha.get(5));
        System.out.println("collection size is "+ha.size());
        ha.print();
        ha.remove(9);
        System.out.println("collection size is " + ha.size());
        ha.print();
        ha.put(88, 17);
        ha.print();


    }
}
