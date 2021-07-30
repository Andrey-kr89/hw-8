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
        ha.put("first", 11);
        ha.put("first", 11221);
        ha.put("second", 12);
        ha.put("fourth", 13);
        ha.put("fourth", 1312);
        ha.put("fifth", 14);
        ha.put("sixth", 15);
        ha.put("eights", 16);
        ha.put("fourth", 1312);
        ha.put("nine", 17);
        ha.put("nine", 18);
        System.out.println(ha.get("nine"));
        System.out.println(ha.get("first"));
        ha.print();
        System.out.println();
        ha.remove("second");
        ha.print();

    }
}
