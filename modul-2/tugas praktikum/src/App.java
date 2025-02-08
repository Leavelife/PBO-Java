import java.io.*;

public class App {
    public static String read() {
        String baca = "";
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader(input);
        try {
            baca = buf.readLine();
        } catch (IOException e) {
            System.out.println("error!");
        }
        return baca;
    }
    public static void main(String[] args) throws Exception {
        String nama, karakter, hobi;
        System.out.println("\nMasukkan nama mu: ");
        nama = read();
        System.out.println("Masukkan karaktermu mu: ");
        karakter = read();
        System.out.println("Masukkan hobi mu: ");
        hobi = read();

        System.out.println("\nHalo... nama ku " + nama);
        System.out.println("Aku itu orang yang sangat " + karakter);
        System.out.println("Dan hobi ku adalah " + hobi);
    }
}