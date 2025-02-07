import java.io.*;


public class App {
    public static String readInput() {
        String baca = "";
            InputStreamReader input = new InputStreamReader(System.in);
            BufferedReader buf = new BufferedReader(input);
            try {
                baca = buf.readLine();
            } catch (Exception e) {
                System.out.println("error");
            }
        return baca;
    }
    public static void main(String[] args) throws Exception {
        String name = "";
        int nilaiMatematika, nilaiFisika, nilaiKimia;

        System.out.println("Masukkan nama: ");
        name = readInput();
        System.out.println("Masukkan nilai matematika: ");
        nilaiMatematika = Integer.parseInt(readInput());
        System.out.println("Masukkan nilai fisika: ");
        nilaiFisika = Integer.parseInt(readInput());
        System.out.println("Masukkan nilai kimia: ");
        nilaiKimia = Integer.parseInt(readInput());
        System.out.println("\n" + name);
        System.out.println("Nilai Kamu Adalah: ");
        System.out.println("Matematika: " + nilaiMatematika);
        System.out.println("Fisika: " + nilaiFisika);
        System.out.println("Kimia: " + nilaiKimia);
    }
}
