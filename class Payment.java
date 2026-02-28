public class Payment {
    private int paymentID;
    private double amount;
    private String method; // Card, Wallet
    private String transactionStatus;

    public Payment(int paymentID, double amount, String method) {
        this.paymentID = paymentID;
        this.amount = amount;
        this.method = method;
        this.transactionStatus = "Pending";
    }

    public boolean processPayment(double amount) {
        System.out.println("Processing payment of: " + amount + " via " + method);
        this.transactionStatus = "Success"; // افتراضيًا
        return true;
    }

    public String getTransactionStatus() { return transactionStatus; }
}
