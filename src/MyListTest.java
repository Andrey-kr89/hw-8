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

//        MyQueue<String> qu = new MyQueue<>();
//        qu.add("zero");
//        qu.add("first");
//        qu.add("second");
//        qu.add("third");
//        qu.add("fourth");
//        qu.add("fifth");
//        qu.add("sixth");
//        qu.print();
//        System.out.println();
//        System.out.println(qu.poll());
//        qu.print();
//        System.out.println();
//        System.out.println(qu.peek());
//
        MyStack<String> st = new MyStack<>();
        st.add("zero");
        st.add("first");
        st.add("second");
//        st.add("third");
//        st.add("fourth");
//        st.add("fifth");
//        st.add("sixth");
//        st.print();
//        System.out.println();
//        System.out.println(st.pop());
//        st.print();
//        System.out.println();
//        System.out.println(st.peek());
        MyHashMap<String, Integer> ha = new MyHashMap<>();
        ha.put("123", 11);
        ha.put("weewfwweewfw", 12);
        ha.put("wee21133121w", 13);
        ha.put("123", 12);
        ha.put("weewfwweewfw", 44);
        ha.put("32", 32);
        ha.put("e", 23);
        ha.put("32", 144);
        System.out.println(ha.get("32"));
        System.out.println(ha.get("e"));
        ha.print();
        System.out.println();
        ha.remove("weewfwweewfw");
        ha.print();

    }
}
