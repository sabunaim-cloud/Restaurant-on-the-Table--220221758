import java.util.List;

public class Customer extends User {
    private int loyaltyPoints;

    public Customer(int userID, String name, String email, String password) {
        super(userID, name, "Customer", email, password);
        this.loyaltyPoints = 0;
    }

    public Order placeOrder(List<MenuItem> items) {
        return new Order(items);
    }

    public void customizeOrder(Order order, String customization) {
        order.setCustomization(customization);
    }

    public void trackOrderStatus(Order order) {
        System.out.println("Order Status: " + order.getStatus());
    }

    public void makePayment(Order order, Payment payment) {
        payment.processPayment(order.getTotalAmount());
    }
}
