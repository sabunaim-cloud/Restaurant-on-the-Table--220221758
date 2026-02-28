public class Admin extends User {
    private int adminID;

    public Admin(int userID, String name, String email, String password) {
        super(userID, name, "Admin", email, password);
        this.adminID = userID;
    }

    public void manageUsers() {
        System.out.println("Managing users...");
    }

    public void updateMenu(MenuItem item, String action) {
        System.out.println("Menu updated: " + action + " item " + item.getName());
    }
}
