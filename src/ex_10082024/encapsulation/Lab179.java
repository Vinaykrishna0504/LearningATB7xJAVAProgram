package ex_10082024.encapsulation;
// ## Fixed Encapsulation
public class Lab179 {
    public static void main(String[] args) {
        VWOLogin1 vwoLogin = new VWOLogin1("admin", "password123");
        System.out.println(vwoLogin.username);
        vwoLogin.setUsername("Vinay");
        System.out.println(vwoLogin.getUsername());
    }

}

class VWOLogin1{
    // Data Members
    public String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAuth) {
        if (isAuth) {
            this.password = password;
        } else {
            System.out.println("Not allowed!");
        }
    }

    public VWOLogin1(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
