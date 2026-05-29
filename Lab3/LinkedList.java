package Lab3;

public class LinkedList {

    private ListNode items;
    private ListNode current;
    private int size;

    // default constructor
    public LinkedList() {

        items = null;
        current = null;
        size = 0;
    }

    // constructor with node
    public LinkedList(ListNode node) {

        items = node;
        current = node;
        size = 1;
    }

    // get size
    public int getSize() {

        return size;
    }

    // start
    public void start() {

        current = items;
    }

    // advance
    public void advance() {

        if (current != null) {
            current = current.next;
        }
    }

    // get current
    public Object getCurrent() {

        if (current != null) {
            return current.getData();
        }

        return null;
    }

    // add before
    public void addBefore(Comparable nodeData) {

        ListNode newNode = new ListNode(nodeData);

        // empty list
        if (items == null) {

            items = newNode;
            current = newNode;
        }

        // current is first node
        else if (current == items) {

            newNode.next = items;
            items = newNode;
            current = newNode;
        }

        else {

            ListNode temp = items;

            while (temp.next != current) {
                temp = temp.next;
            }

            temp.next = newNode;
            newNode.next = current;
            current = newNode;
        }

        size++;
    }

    // add after
    public void addAfter(Comparable nodeData) {

        ListNode newNode = new ListNode(nodeData);

        // empty list
        if (items == null) {

            items = newNode;
            current = newNode;
        }

        else {

            newNode.next = current.next;
            current.next = newNode;
        }

        size++;
    }

    // remove current
    public void removeCurrent() {

        if (current == null) {
            return;
        }

        // remove first node
        if (current == items) {

            items = items.next;
            current = items;
        }

        else {

            ListNode temp = items;

            while (temp.next != current) {
                temp = temp.next;
            }

            temp.next = current.next;
            current = current.next;
        }

        size--;
    }

    // print current
    public void printCurrent() {

        if (current != null) {
            System.out.println(current.getData());
        }

        else {
            System.out.println("Current is null");
        }
    }

    // print list
    public void printList() {

        ListNode temp = items;

        while (temp != null) {

            System.out.println(temp.getData());

            temp = temp.next;
        }
    }

    // FindMax
    public Object FindMax() {

        if (items == null) {
            return null;
        }

        ListNode temp = items;

        Comparable max = temp.getData();

        while (temp != null) {

            if (temp.getData().compareTo(max) > 0) {
                max = temp.getData();
            }

            temp = temp.next;
        }

        return max;
    }

    // Find
    public Object Find(Object o) {

        ListNode temp = items;

        while (temp != null) {

            if (temp.getData().equals(o)) {
                return temp.getData();
            }

            temp = temp.next;
        }

        return null;
    }
}