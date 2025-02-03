class Mahasiswa{
    private String nama, tempatLahir, tanggalLahir;
    private int nim;
    private char jenisKelamin;

    Mahasiswa(String nama, int nim, char jenisKelamin){
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
    }
    public void alamat(String tempatLahir, String tanggalLahir) {
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        System.out.println("Tempat Lahir\t : " + this.tempatLahir);
        System.out.println("Tanggal Lahir\t : " + this.tanggalLahir + "\n");
    }
    public void display() {
        System.out.println("\nNama\t\t : " + nama);
        System.out.println("Nim\t\t : " + nim);
        System.out.println("Jenis Kelamin\t : " + jenisKelamin);
    }
}

public class App {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("saya", 204832, 'L');
        mhs1.display();
        mhs1.alamat("Malang", "25 Januari 2025");
    }
}
