//implementasi sederhana penggunaan konsep OOP

//ini CLASS
class Users {
    //ini encapsulsi
    protected String username;
    protected String email;
    protected String password;
    //ini method
    void register(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }
    void notifikasi() {
        System.out.println("\nUsername: " + username);
        System.out.println("Email: " + email);    
    }
}
//ini SubClass Inheritence dari Class Users
class Pembeli extends Users{
    @Override
    void notifikasi() {
        super.notifikasi();
        System.out.println("register dilakukan oleh pembeli\n");
    }
}
class Penjual extends Users{
    @Override
    void notifikasi() {
        super.notifikasi();
        System.out.println("register dilakukan oleh penjual\n");
    }
    
}
class Adminstrator extends Users{
    @Override
    void notifikasi() {
        super.notifikasi();
        System.out.println("register dilakukan oleh administrator\n");
    }
    
}

public class App {
    public static void main(String[] args) {

        String username = "saya";
        String email = "saya@gmail.com";
        String password = "saya123";

        Users user = new Adminstrator();
        user.register(username, email, password);
        user.notifikasi();
    }
}
