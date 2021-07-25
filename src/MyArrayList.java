import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList<T> {
    private T[] elements;
    private int current = 0;

    public MyArrayList() {
        this.elements = (T[]) new Object[]{};

    }

    ;

    public void add(T value) {
        this.elements = Arrays.copyOf(elements, size() + 1);
        this.elements[current] = value;
        current++;
    } //добавляет элемент в конец

    public void remove(int index) {
        for (int i = index; i < size() - 1; i++) {
            elements[i] = elements[i + 1];
        }
        this.elements = Arrays.copyOf(elements, size() - 1);
        current--;
    } //удаляет элемент под индексом

    public void clear() {
        elements = (T[]) new Object[]{};
        current = 0;
    } //очищает коллекцию

    public int size() {
        return elements.length;
    } //возвращает размер коллекции

    public Object get(int index) {
        return elements[index];
    } //возвращает элемент под индексом

    public void print() {
        System.out.println();
        for (int i = 0; i < size(); i++) {
            System.out.print(elements[i] + " ");
        }
    }
}
