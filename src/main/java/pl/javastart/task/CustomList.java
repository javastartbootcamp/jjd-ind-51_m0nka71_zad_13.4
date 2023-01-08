package pl.javastart.task;

import java.util.List;

// Uzupełnij klasę. Możesz ją dowolnie modyfikować.
// Celem jest, żeby przechodziły testy w src/test/java/[...]/CustomListTest
public class CustomList<T> {

    private int size = 0;
    private Object[] elements;

    public Object[] getElements() {
        return elements;
    }

    public void setElements(T[] elements) {
        this.elements = elements;
    }

    public CustomList() {
        elements = new List[size];
    }

    public void add(T a) {
        if (a == null) {
            throw new NullPointerException("Value cannot be null");
        }
        elements[size] = a;
        size++;
    }

    public void add(int index, T a) {
        if (a == null) {
            throw new NullPointerException("Value cannot be null");
        }
        elements[index] = a;
        size++;
    }

    public Object size() {
        return elements[size];
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
        String result = "";
        for (Object element : elements) {
            result += element.toString();
        }
        return result;
    }

}
