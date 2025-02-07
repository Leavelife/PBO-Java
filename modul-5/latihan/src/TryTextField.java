import java.awt.event.*;
import javax.swing.*;

//implementasi interface ActionListener untuk menangani event seperti tombol diklik
public class TryTextField implements ActionListener{
    private JTextField textfield;
    private JButton btnTampil;
    private JLabel label ;

    //constructor class
    TryTextField() {
        //mengatur posisi, ukuran dan title jendela
        JFrame frame = new JFrame();
        frame.setBounds(200, 200, 330, 180);
        frame.setTitle("try text field");

        //mengatur posisi dan ukuran label kedalam jendela
        label = new JLabel("input kata: ");
        label.setBounds(25, 25, 100, 25);
        frame.add(label);

        //mengatur posisi dan ukuran text field ke dalam jendela
        textfield = new JTextField();
        textfield.setBounds(125,25,150,25);
        frame.add(textfield);

        //membuat button ke dalam jendela
        btnTampil = new JButton("Tampilkan Kata");
        frame.add(btnTampil);
        btnTampil.setBounds(125,75,150,25);

        //mengatur layout dan menampilkan jendela
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //menambah action listener, ketika tombol diklik method actionPerformed terpanggil
        btnTampil.addActionListener(this); 
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnTampil) {
            String kata = textfield.getText();
            JOptionPane.showMessageDialog(null, 
                "Anda telah menginput kata : \n"+kata, "INFORMASI",
                JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
    public static void main(String[] args) {
        TryTextField frame = new TryTextField();
    }
}
