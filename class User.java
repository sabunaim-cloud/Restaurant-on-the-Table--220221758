public class User {
    private int userID;
    private String name;
    private String role; // Customer, Admin, Staff
    private String email;
    private String password;

    public User(int userID, String name, String role, String email, String password) {
        this.userID = userID;
        this.name = name;
        this.role = role;
        this.email = email;
        this.password = password;
    }

    public void login() {
        System.out.println(name + " logged in.");
    }

    public void logout() {
        System.out.println(name + " logged out.");
    }

    public void updateProfile(String newName, String newEmail) {
        this.name = newName;
        this.email = newEmail;
    }
}
