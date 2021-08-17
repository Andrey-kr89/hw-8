public class MyHashMap<K, V> {
    private final Node[] arr;

    private Node<K, V> tail;
    private Node<K, V> pr;
    private final int arrSize = 8;
    private int collSize = 0;

    public MyHashMap() {
        arr = new Node[arrSize];
    }

    void put(K key, V value) {
        int index = getIndex(key);

        if (arr[index] == null) {
            arr[index] = new Node<K, V>(key, value, null);
            tail = arr[index];
            collSize++;
        } else {
            Node<K, V> collisionTest = arr[index];
            do {
                if (collisionTest.key.equals(key)) {
                    collisionTest.value = value;
                    return;
                } else {
                    collisionTest = collisionTest.next;
                }
            } while (collisionTest != null);
            Node<K, V> el = new Node<>(key, value, null);
            tail = el;
            arr[index].next = tail;
            tail = null;
            collSize++;

        }
    }

    Object get(K key) {
        int index = getIndex(key);
        Node<K, V> found = arr[index];
        if (arr[index] != null) {
            do {
                if (found.key.equals(key)) {
                    return found.value;
                } else {
                    found = found.next;
                }
            } while (found != null);
        }
        return "not found";
    }

    void remove(K key) {
        int index = getIndex(key);
        Node toRemove = arr[index];
        if (toRemove.next == null & toRemove.key.equals(key)) {
            toRemove.key = null;
            toRemove.value = null;
        } else {
            while (toRemove != null) {
                if (toRemove.key.equals(key)) {
                    toRemove.key = null;
                    toRemove.value = null;
                    if (toRemove.next != null) {
                        toRemove.key = toRemove.next.key;
                        toRemove.value = toRemove.next.value;
                        toRemove.next = toRemove.next.next;
                    }
                }
                toRemove = toRemove.next;
            }
        }
        collSize--;
    }

    public int size() {
        return collSize;
    }

    public void clear() {
        for (int i = 0; i < collSize; i++) {
            arr[i] = null;
        }
        ;
    }

    public void print() {
        for (int i = 0; i < arrSize; i++) {
            System.out.print("{");
            if (arr[i] != null) {
                pr = arr[i];
                do {
                    System.out.print(pr.value + ", ");
                    pr = pr.next;
                    if (pr == null) {
                        System.out.print("}");
                        System.out.print("   ");
                    }
                } while (pr != null);
            } else System.out.print("Null }  ");

        }
        System.out.println();
    }

    private int getIndex(K key) {
        return key.hashCode() % arrSize;
    }

    static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        public Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
}
