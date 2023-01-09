package pl.javastart.task;

import java.util.Arrays;

// Uzupełnij klasę. Możesz ją dowolnie modyfikować.
// Celem jest, żeby przechodziły testy w src/test/java/[...]/CustomListTest
public class CustomList<T> {

    private static final int INITIAL_SIZE = 10;
    private int size = 0;
    private Object[] elements = {};

    public CustomList() {
        elements = new Object[INITIAL_SIZE];
    }

    public void setElements(T[] elements) {
        this.elements = elements;
    }

    public void add(T a) {
        if (a == null) {
            throw new NullPointerException("Value cannot be null");
        }
        resize();
        elements[size] = a;
        size++;
    }

    public void add(int index, T a) {
        if (a == null) {
            throw new NullPointerException("Value cannot be null");
        }
        if (elements.length == size()) {
            checkCapacity(size() * 2 + 1);
        }
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = a;
        size++;
    }

    public void checkCapacity(int newCapacity) {
        if (newCapacity < size) {
            return;
        }
        Object[] old = elements;
        elements = (T[]) new Object[newCapacity];
        for (int i = 0; i < size(); i++) {
            elements[i] = old[i];
        }
    }

    private void resize() {
        if (size >= INITIAL_SIZE) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        return (T) elements[index];
    }

    public Object remove(int index) {
        Object indexToRemove = elements[index];
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return indexToRemove;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < this.size(); i++) {
            result.append("[");
            result.append(this.get(i));
            result.append("]");
        }
        return result.toString();
    }
}
