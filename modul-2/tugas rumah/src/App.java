import java.io.*;

public class App {
    public static int read() {
        int number = 52;
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
    public static String segitigaSamaSisi(int input) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {
                result.append(" ");
            }
            for (int j = i; j <= input; j++) {
                result.append("* ");
            }
            result.append("\n");
        }
        return result.toString();
    }
    public static String segitigaSikuSiku(int input) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {
                result.append("*  ");
            }
            result.append("\n");
        }
        return result.toString();
    }
    public static void main(String[] args) throws Exception {
        int input;
        System.out.println("Input bilangan: ");
        input = read();

        System.out.println("\nSegitiga sama sisi, sisi = " + input);
        System.out.println(segitigaSamaSisi(input));
        System.out.println("\nSegitiga siku-siku dengan alas = " + input);
        System.out.println(segitigaSikuSiku(input));
    }
}
