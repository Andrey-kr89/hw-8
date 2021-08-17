public class MyLinkedList<T> {

    private int listSize = 0;
    private Node<T> first;
    private Node<T> last;

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
                    current.next.previous = current;
                }
                current = current.next;
            }
        }
    }

    T get(int index) {
        Node<T> x = first;
        if (first.next != null) {
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

    static class Node<T> {
        T value;
        Node<T> next;
        Node<T> previous;

        public Node(Node<T> previous, T value, Node<T> next) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }
}

