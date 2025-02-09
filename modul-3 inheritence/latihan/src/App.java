class Person {
    protected String name;
    protected int age;

    //setter method
    public void setInput(String noKaryawa, String name, int age) {
        this.name = name;
        this.age = age;
    }
    //getter method
    public String getName() {
        return name;
    }
    //getter method
    public int getAge() {
        return age;
    }
    public void info() {
        System.out.println("Nama: " + getName());
        System.out.println("Usia: " + getAge());
    }
}
//ini class inheritence
class Employ extends Person {
    private String noKaryawan;

    @Override 
    //agar method bisa digunakan oleh objek bertipe data class utama
    public void setInput(String noKaryawan, String name, int age) {
        super.setInput(noKaryawan, name, age);
        this.noKaryawan = noKaryawan;
    }
    public String getNoKaryawan() {
        return noKaryawan;
    }
    public void info() {
        System.out.println("No Karyawan: " + getNoKaryawan());
        super.info();
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Employ karyawan = new Employ();
        karyawan.setInput("101", "sayaa", 20);
        karyawan.info();

        System.out.println("\n");
        Person karyawan2 = karyawan;    //objek menggunakan polimorphism    
        karyawan2.setInput("102", "dia", 30);
        karyawan2.info();
    }
}
