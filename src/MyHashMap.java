import java.util.HashMap;
import java.util.Objects;

public class MyHashMap<K, V> {
    private final Node[] arr;

    private Node<K, V> tail;
    private Node<K, V> pr;
    private final int size = 16;
    private int collSize = 0;

    public MyHashMap() {
        arr = new Node[size];
    }

    void put(K key, V value) {
        int hash =0;
        hash ^= (Objects.hashCode(key) >>> 20) ^ (Objects.hashCode(key) >>> 12);
        hash ^= (hash >>> 7) ^ (hash >>> 4);
        int index = getIndex(key);
        if (arr[index] == null) {
            arr[index] = new Node<>(key, value, hash, null);
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
            Node<K, V> el = new Node<>(key, value, hash, null);
            tail.next = el;
            tail = el;
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
        System.out.println(arr[index].value);
        System.out.println(index);
        if (toRemove.next == null & toRemove.key.equals(key)) {
            toRemove.key = null;
            toRemove.value = null;
        } else {

        }
        collSize--;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
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
                    ;
                } while (pr != null);
            } else System.out.print("Null }  ");

        }
        System.out.println();
    }

    private int getIndex(K key) {
        int hash = Objects.hashCode(key);
        hash ^= (Objects.hashCode(key) >>> 20) ^ (Objects.hashCode(key) >>> 12);
        hash ^= (hash >>> 7) ^ (hash >>> 4);
        int index = hash & (size - 1);
        return index;
    }

    static class Node<K, V> {
        K key;
        V value;
        int hash;
        Node<K, V> next;

        public Node(K key, V value, int hash, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.hash = hash;
            this.next = next;
        }
    }
}
