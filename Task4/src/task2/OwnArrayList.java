package task2;

public class OwnArrayList<T> {

    private final int DEFAULT_SIZE = 8;
    private Object[] array;
    private int size = 0;


    public OwnArrayList() {
        array = new Object[DEFAULT_SIZE];
    }


    public void add(T item) {

        if (size == array.length - 1)
            resize(array.length * 2);
        array[size++] = item;
    }

    public T get(int index) {
        return (T) array[index];
    }

    public int size() {
        return size;
    }

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }
}

