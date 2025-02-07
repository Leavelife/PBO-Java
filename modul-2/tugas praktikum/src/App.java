
public class App {
    public static int kali(int a, int b) {
        return a * b;
    }
    public static double kali(double a, double b) {
        return a * b;
    }
    public static int kali(int a, int b, int c) {
        return a * b * c;
    }
    public static void main(String[] args) throws Exception {
        int a = 9, b = 1, c = 2;
        double d = 9.0, e = 2.0;

        System.out.println("1. " + kali(a, b));
        System.out.println("2. a(" + a + ") + b(" + b + ") = " + kali(a, b));
        System.out.println("3. " + kali(a, b, c));
        System.out.println("4. a(" + a + ") + b(" + b + ") + c(" + c + ") = " + kali(a, b, c));
        System.out.println("5. " + kali(d, e));
        System.out.println("6. a(" + d + ") + b(" + e + ") = " + kali(d, e));
    }
}