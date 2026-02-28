/**
 * RestaurantTable class:
 * يمثل طاولة داخل المطعم.
 * يطبق مبدأ Information Hiding عبر جعل الخصائص private.
 * يوفر وظائف لحجز الطاولة وتحريرها مع ضمان التحكم في الحالة.
 */
public class RestaurantTable {
    // الخصائص مخفية باستخدام private
    private int tableNumber;
    private int seats;
    private boolean reserved;

    // Constructor لإنشاء الطاولة
    public RestaurantTable(int tableNumber, int seats) {
        this.tableNumber = tableNumber;
        this.seats = seats;
        this.reserved = false;
    }

    // Getters للوصول إلى المعلومات بشكل آمن
    public int getTableNumber() {
        return tableNumber;
    }

    public int getSeats() {
        return seats;
    }

    public boolean isReserved() {
        return reserved;
    }

    // Method لحجز الطاولة
    public void reserveTable() {
        if(!reserved) {
            reserved = true;
            System.out.println("Table " + tableNumber + " reserved.");
        } else {
            System.out.println("Table " + tableNumber + " is already reserved.");
        }
    }

    // Method لتحرير الطاولة
    public void freeTable() {
        if(reserved) {
            reserved = false;
            System.out.println("Table " + tableNumber + " is now free.");
        } else {
            System.out.println("Table " + tableNumber + " was not reserved.");
        }
    }
}
