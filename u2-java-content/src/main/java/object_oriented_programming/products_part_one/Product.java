package object_oriented_programming.products_part_one;

public class Product {

    private static int nextId = 1;

    private final int id;
    private String name;
    private String desc;
    private double price;
    private int quantity;

    public Product(String name, double price , String desc, int quantity) {
        this.id = nextId;
        this.name = name;
        this.price = price;
        this.desc = desc;
        this.quantity = quantity;
        nextId++;
    }

    public static int getNextId() {
        return nextId;
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "PRODUCT INFORMATION" + Common.newline +
                "ID: " + id + Common.newline +
                "Item: '" + name + Common.newline +
                "Description: " + desc + Common.newline +
                "Price: " + price + Common.newline +
                "Quantity: " + quantity + Common.newline;
    }
}
