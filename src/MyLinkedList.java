public class MyLinkedList<T> {

    //    add(Object value) добавляет элемент в конец
//    remove(int index) удаляет элемент под индексом
//    clear() очищает коллекцию
//    size() возвращает размер коллекции
//    get(int index) возвращает элемент под индексом
    private int listSize = 0;
    private Node<T> first;
    private Node<T> last;

    public MyLinkedList() {

    }

    void add(T value) {
        Node<T> l = last;
        Node<T> newNode = new Node<>(l, value, null);
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }
        listSize++;
    }

    void remove(int index) {
        Node<T> current = first;
        if (index > listSize - 1) {
            return;
        } else if (index == 0) {
            listSize--;
            first.value = null;
            first = first.next;
            first.previous = null;

        } else {
            listSize--;
            for (int i = 0; i <= index & current.next != null; i++) {
                if (i == index - 1) {
                    current.next = current.next.next;
                }
                current = current.next;
            }

        }

    }

    T get(int index) {
        Node<T> x = first;
        if (first.next != null ) {
            for (int i = 0; i < index & first.next != null; i++) {
                x = x.next;
            }
        } else {
            System.out.println("List is empty");
        }
        return x.value;

    }

    void clear() {
        first = last = null;
        listSize = 0;
    }

    int size() {
        return listSize;
    }


    void print() {
        if (first != null) {
            Node<T> x = first;
            System.out.print(x.value + ", ");
            while (x.next != null) {
                x = x.next;
                System.out.print(x.value + ", ");

            }
            System.out.println();
        } else {
            System.out.println("List is empty");
        }
    }

    class Node<T> {
        T value;
        Node<T> next;
        Node<T> previous;

        public Node(Node<T> previous, T value, Node<T> next) {
            this.value = value;
            this.next = next;
            this.previous = previous;
            ;
        }


    }
}

