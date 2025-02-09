## Program ini terdiri dari:

1. Sebuah text field untuk memasukkan teks.

2. Sebuah button yang, ketika diklik, akan menampilkan teks yang dimasukkan ke dalam text field menggunakan JOptionPane.

3. Sebuah label untuk memberikan petunjuk kepada pengguna.
***
### 1. Impor Library

```java 
import java.awt.event.*;
import javax.swing.*;
```

`java.awt.event.*:` Digunakan untuk mengimpor kelas-kelas yang terkait dengan event handling (seperti ActionListener dan ActionEvent).

`javax.swing.*:` Digunakan untuk mengimpor kelas-kelas Swing seperti JFrame, JTextField, JButton, JLabel, dan JOptionPane.

***
### 3. Membuat JTextField (Text Field)

```java
JTextField textfield = new JTextField();
```
`JTextField:` Kelas dari library Swing yang digunakan untuk membuat komponen input teks (text field).


`textfield:` Objek dari kelas JTextField yang akan digunakan untuk memasukkan teks.

***
### 4. Method actionPerformed

```java
public void actionPerformed(ActionEvent e) {
    if(e.getSource()==btnTampil) {
        String kata = textfield.getText();
            JOptionPane.showMessageDialog(null, 
                "Anda telah menginput kata : \n"+kata, "INFORMASI",
                JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
```
`actionPerformed:` Metode ini dipanggil ketika tombol diklik.

`e.getSource() == btnTampil:` Memeriksa apakah event berasal dari tombol btnTampil.

`textfield.getText():` Mengambil teks yang dimasukkan ke dalam text field.

`JOptionPane.showMessageDialog`: Menampilkan dialog dengan pesan yang berisi teks yang dimasukkan.
***
### 5. Cara Kerja Program
1. Pengguna memasukkan teks ke dalam text field.

2. Pengguna mengklik tombol "Tampilkan Kata".

3. Program mengambil teks dari text field dan menampilkannya dalam sebuah dialog informasi.
