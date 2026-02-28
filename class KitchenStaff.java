public class KitchenStaff extends User {
    private int staffID;

    public KitchenStaff(int userID, String name, String email, String password) {
        super(userID, name, "Staff", email, password);
        this.staffID = userID;
    }

    public void receiveOrder(Order order) {
        System.out.println("Order received in kitchen: " + order.getOrderID());
    }

    public void updateOrderStatus(Order order, String status) {
        order.setStatus(status);
        System.out.println("Order status updated to: " + status);
    }
}
