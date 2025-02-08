import java.io.*;

public class App {
    public static String read() {
        String text = "";
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader(input);
        try {
            text = buf.readLine();
        } catch (IOException e) {
            System.out.println("error!");
        }
        return text;
    }
    public static int readInt() {
        int number = 0;
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader(input);
        try {
            String line = buf.readLine();
            number = Integer.parseInt(line);
        } catch (IOException e) {
            System.out.println("error!");
        }
        return number;
    }
    public static void main(String[] args) throws Exception {
        String input;
        int pilihan, jumlah = 0;
        do {
            System.out.println("\nPROGRAM ABSENSI");
            System.out.println("1. Presensi Nama");
            System.out.println("2. Jumlah Presensi");
            System.out.println("3. exit");
            System.out.println("Pilih Menu: ");
            pilihan = readInt();
            switch (pilihan) {
                case 1:
                System.out.println("\nMasukkan nama: ");
                    input = read();
                    System.out.println(input + " berhasil present!");
                    jumlah++;
                    break;
                case 2:
                    System.out.println("\nJumlah kehadiran: " + jumlah);
                    break;
                default: {
                    System.out.println("\nexit program");
                    break;
                }
            }
            if (pilihan > 4) {
                System.out.println("invalid input");
                break;
            }
        } while (pilihan != 3);
    }
}
