import java.util.Date;
import java.util.List;

public class Order {
    private static int counter = 1;
    private int orderID;
    private Date orderDate;
    private String status;
    private double totalAmount;
    private String customization;
    private List<MenuItem> items;

    public Order(List<MenuItem> items) {
        this.orderID = counter++;
        this.orderDate = new Date();
        this.status = "Pending";
        this.items = items;
        this.totalAmount = calculateTotal(items);
    }

    private double calculateTotal(List<MenuItem> items) {
        double total = 0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public int getOrderID() { return orderID; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public double getTotalAmount() { return totalAmount; }
    public void setCustomization(String customization) { this.customization = customization; }
}
