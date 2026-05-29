package Lab3;

public class ListNode {

    private Comparable data;
    public ListNode next;

    public ListNode(Comparable data) {

        this.data = data;
        next = null;
    }

    public Comparable getData() {
        return data;
    }

    public void setData(Comparable data) {
        this.data = data;
    }
}