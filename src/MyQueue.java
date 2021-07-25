public class MyQueue<T> {
    //    Написать свой класс MyQueue как аналог классу Queue, который будет работать по принципу FIFO (first-in-first-out).
//
//    Можно делать либо с помощью Node либо с помощью массива.
//
//    Методы
//    add(Object value) добавляет элемент в конец
//    remove(int index) удаляет элемент под индексом
//    clear() очищает коллекцию
//    size() возвращает размер коллекции
//    peek() возвращает первый элемент в очереди (FIFO)
//    poll() возвращает первый элемент в очереди и удаляет его из коллекции
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

    static class Node<T> {
        T value;
        MyQueue.Node<T> next;
        MyQueue.Node<T> previous;

        public Node(MyQueue.Node<T> previous, T value, MyQueue.Node<T> next) {
            this.value = value;
            this.next = next;
            this.previous = previous;
            ;
        }
    }
}
