public class MenuItem {
    private int itemID;
    private String name;
    private String description;
    private double price;
    private boolean availability;

    public MenuItem(int itemID, String name, String description, double price, boolean availability) {
        this.itemID = itemID;
        this.name = name;
        this.description = description;
        this.price = price;
        this.availability = availability;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public boolean isAvailable() { return availability; }

    public void updateItem(String newName, double newPrice) {
        this.name = newName;
        this.price = newPrice;
    }
}
