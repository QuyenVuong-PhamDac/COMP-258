package Lab3;

public class Widget implements Comparable<Widget> {

    private int id;
    private String name;
    private int amountInStock;

    // default constructor
    public Widget() {

    }

    // constructor
    public Widget(int id, String name, int amountInStock) {

        this.id = id;
        this.name = name;
        this.amountInStock = amountInStock;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAmountInStock() {
        return amountInStock;
    }

    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmountInStock(int amountInStock) {
        this.amountInStock = amountInStock;
    }

    // equals
    @Override
    public boolean equals(Object o) {

        if (o instanceof Widget) {

            Widget other = (Widget) o;

            return this.id == other.id;
        }

        return false;
    }

    // compareTo
    @Override
    public int compareTo(Widget other) {

        return this.id - other.id;
    }

    // print
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Stock: " + amountInStock;
    }
}