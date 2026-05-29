package Lab3;

public class ArrayManager {

    private Comparable[] items;
    private int size;

    // constructor
    public ArrayManager(int capacity) {

        items = new Comparable[capacity];
        size = 0;
    }

    // add item
    public void addItem(Comparable item) {

        if (size < items.length) {

            items[size] = item;
            size++;
        }
    }

    // print array
    public void printItems() {

        for (int i = 0; i < size; i++) {

            System.out.println(items[i]);
        }
    }

    // FindMax
    public Object FindMax() {

        Comparable max = items[0];

        for (int i = 1; i < size; i++) {

            if (items[i].compareTo(max) > 0) {
                max = items[i];
            }
        }

        return max;
    }

    // Find
    public Object Find(Object o) {

        for (int i = 0; i < size; i++) {

            if (items[i].equals(o)) {
                return items[i];
            }
        }

        return null;
    }
}