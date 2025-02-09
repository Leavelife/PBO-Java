class Lingkaran {
    //encapsulation
    protected int jari;
    protected final double phi = 3.14;

    Lingkaran(int jari) {
        this.jari = jari;
    }
    double luasLingkaran() {
        return jari * jari * phi;
    }
    double kelilingLingkaran() {
        return 2 * jari * phi;
    }
    public void info() {
        System.out.println("Lingkaran\nJari-jari Lingkaran: " + this.jari);
        System.out.println("Phi Lingkaran: " + this.phi);
        System.out.println("Luas Lingkaran: " + luasLingkaran());
        System.out.println("Keliling Lingkaran: " + kelilingLingkaran());
    }
}
//inheritence
class Tabung extends Lingkaran {
    private int tinggi;

    Tabung(int jari, int tinggi) {
        super(jari);
        this.tinggi = tinggi;
    }
    double luasTabung() {
        return 2 * phi * jari * (jari + tinggi);
    }
    double volumTabung() {
        return phi * jari * jari * tinggi;
    }
    public void info() {
        super.info();
        System.out.println("\nTabung\nVolume Tabung: " + volumTabung());
        System.out.println("Luas Tabung: " + luasTabung());
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        int jari = 8, tinggi = 3;
        //polymorphism
        Lingkaran bangunan = new Tabung(jari, tinggi);

        System.out.println("\n");
        bangunan.info();
    }
}