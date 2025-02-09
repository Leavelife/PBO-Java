class Users {
    protected int id = 100;
    protected String name, email;

    void addUser(String name, String email) {
        this.name = name;
        this.email = email;
        id++;
    }
}
class Mahasiswa extends Users {
    private int nim;
    
    void addMahasiswa(String name, String email) {
        super.addUser(name, email);
        nim = id;
        System.out.println("NIM: " + nim + "\tNama: " + name + "\tEmail: " + email);
    }
}
class Dosen extends Users {
    private int nidn;
    
    void addDosen(String name, String email) {
        super.addUser(name, email);
        nidn = id;
        System.out.println("NIDN: " + nidn + "\tNama: " + name + "\tEmail: " + email);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa user = new Mahasiswa();
        Dosen dosen = new Dosen();
        //contoh
        System.out.println("Data Mahasiswa: ");
        user.addMahasiswa("saya", "saya@gmail.com");
        user.addMahasiswa("diaa", "diaa@gmail.com");
        user.addMahasiswa("kau", "kau@gmail.com");
        System.out.println("\nData Dosen: ");
        dosen.addDosen("adam", "adam@gmail.com");
        dosen.addDosen("bagas", "bagas@gmail.com");
    }
}