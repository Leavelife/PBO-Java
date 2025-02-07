
import javax.swing.JFrame;
import javax.swing.JTextField;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JTextField textfield = new JTextField();
        //inisialisasi nama jendela
        frame.setTitle("membuat text field");
        //mengatur posisi dan ukuran jendela
        frame.setBounds(450, 250, 500, 300);
        //menambahkan text field kedalam jendela
        frame.add(textfield);
        //mengatur ukuran text field
        textfield.setBounds(50, 50, 150, 25);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
}
