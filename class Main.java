import java.util.*;

public class Main {
    public static void main(String[] args) {
        RestaurantTable table1 = new RestaurantTable(5, 4); System.out.println("Table Number: " + table1.getTableNumber()); 
        System.out.println("Seats: " + table1.getSeats()); table1.reserveTable(); 
        table1.freeTable();
        // إنشاء عناصر قائمة الطعام
        MenuItem pizza = new MenuItem(1, "Pizza", "Cheese Pizza", 30.0, true);
        MenuItem burger = new MenuItem(2, "Burger", "Beef Burger", 25.0, true);

        // إنشاء زبون
        Customer customer = new Customer(101, "Saba", "saba@example.com", "1234");
        customer.login();

        // إنشاء طلب
        List<MenuItem> items = new ArrayList<>();
        items.add(pizza);
        items.add(burger);

        Order order = customer.placeOrder(items);
        customer.customizeOrder(order, "Extra cheese on pizza");

        // متابعة حالة الطلب
        customer.trackOrderStatus(order);

        // موظف المطبخ يستقبل الطلب
        KitchenStaff staff = new KitchenStaff(201, "Ali", "ali@example.com", "5678");
        staff.receiveOrder(order);
        staff.updateOrderStatus(order, "Preparing");

        // المدير يعدل القائمة
        Admin admin = new Admin(301, "Manager", "admin@example.com", "9999");
        admin.updateMenu(pizza, "Update");

        // الدفع
        Payment payment = new Payment(501, order.getTotalAmount(), "Card");
        customer.makePayment(order, payment);
        System.out.println("Payment Status: " + payment.getTransactionStatus());

        // الترفيه
        Entertainment book = new Entertainment(601, "Book", "Digital Cooking Guide");
        book.readBook();

        Entertainment game = new Entertainment(602, "Game", "Puzzle Game");
        game.startGame();

        customer.logout();
    }
}
