import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserInfterface extends JFrame {
    // INSTANSIASI OBJEK KOMPONEN GUI
    JLabel lJudul = new JLabel("Sistem Login");
    JButton btnLogin = new JButton("Login");
    JButton btnRegister = new JButton("Register");
    // JLabel lUsername = new JLabel("Username");
    // JLabel lPassword = new JLabel("Password");


    // JTextField fJudul = new JTextField();
    // JTextField fUsername = new JTextField();
    // JPasswordField fPassword = new JPasswordField();

    

    // JTable table;
    // JScrollPane scrollPane;
    // Object namaKolom[] = {"Kode", "Judul", "Jumlah"};
    // String query, dataPilih, kodeLama;
    // String data[][];
    // String dbTabel = "";
    // Connect koneksi = new Connect(); //cek koneksi

    public UserInfterface(){
        setTitle("Login System");
        setLayout(null);
        setSize(720, 960);
        add(lJudul);
        add(btnLogin);
        add(btnRegister);
        // add(lUsername);
        // add(lPassword);

        // add(fJudul);
        // add(fUsername);
        // add(fPassword);

        btnLogin.setBounds(80, 160,  100, 30);
        btnRegister.setBounds(150, 160, 100, 30);
        this.setSize(400,400);
        this.setVisible(true);
    }

    // btnLogin.addActionListener(new ActionListener() {
    //     @Override
    //     public void actionPerformed(ActionEvent e) {
    //         // try {
    //         //     String query = "insert into " + dbTabel + " values ('" + getKode() +
    //         //             "','" + getJudul() + "','" + getJumlah() +"')";
    //         //     koneksi.statement = koneksi.connect.createStatement();
    //         //     koneksi.statement.executeUpdate(query);
    //         //     JOptionPane.showMessageDialog(null, "Insert Data Berhasil!");
    //         // } catch (Exception exception){
    //         //     JOptionPane.showMessageDialog(null, "Insert Data Gagal!");
    //         // } finally {
    //         //     updateData();
    //         // }
    //     }
    // });
}
    // public String getUsername(){
    //     return fUsername.getText();
    // }

    // public String getJudul(){
    //     return fJudul.getText();
    // }

    // public int getPassword(){
    //     return fPassword.getText();
    // }


        // if (getBanyakData() != 0){
        //     updateData();
        // }

        // DefaultTableModel model = new DefaultTableModel(data, namaKolom);
        // table.setModel(model);

       
        // table.addMouseListener(new MouseAdapter() {
        //     @Override
        //     public void mouseClicked(MouseEvent e) {
        //         super.mouseClicked(e);
        //         try {
        //             int baris = table.getSelectedRow();
        //             dataPilih = table.getValueAt(baris, 0).toString();
        //             System.out.println(dataPilih);
        //             if (dataPilih != null){
        //                 String pilih;
        //                 kodeLama = table.getValueAt(baris, 0).toString();
        //                 fKode.setText(kodeLama);
        //                 pilih = table.getValueAt(baris, 1).toString();
        //                 fJudul.setText(pilih);
        //                 pilih = table.getValueAt(baris, 2).toString();
        //                 fJumlah.setText(pilih);

        //                 btnUbah.setEnabled(true);
        //                 btnHapus.setEnabled(true);
        //                 btnSimpan.setEnabled(false);
        //             }
        //         } catch (Exception e1){
        //             System.out.println(e1.getMessage());
        //             System.out.println("Error Mouse");
        //         }
        //     }
        // });

    //     btnRegister.addActionListener(new ActionListener() {
    //         @Override
    //         public void actionPerformed(ActionEvent e) {
    //         //     try {
    //         //         String kodeBaru = getKode();
    //         //         String judulBaru = getJudul();
    //         //         int jumlahBaru = getJumlah();

    //         //         // query = "update `"+dbTabel+"` set `kode` = '"+kodeBaru+"', `judul` = '"+
    //         //         //         judulBaru+"', `jumlah` = '"+jumlahBaru+"' where `kode` = '"+
    //         //         //         kodeLama+"'";
    //         //         koneksi.statement = koneksi.connect.createStatement();
    //         //         koneksi.statement.executeUpdate(query);
    //         //         JOptionPane.showMessageDialog(null, "Update data berhasil!");
    //         //     } catch (Exception e1){
    //         //         JOptionPane.showMessageDialog(null, "Update data gagal!");
    //         //     } finally {
    //         //         updateData();
    //         //         dataPilih="";
    //         //         btnUbah.setEnabled(false);
    //         //         btnHapus.setEnabled(false);
    //         //         btnSimpan.setEnabled(true);
    //         //     }
    //         // }
    //     });

    //     // btnHapus.addActionListener(new ActionListener() {
    //     //     @Override
    //     //     public void actionPerformed(ActionEvent e) {
    //     //         try {
    //     //             query = "delete from `"+dbTabel+"` where `kode` = '"+kodeLama+"'";
    //     //             koneksi.statement = koneksi.konek.createStatement();
    //     //             koneksi.statement.executeUpdate(query);
    //     //             JOptionPane.showMessageDialog(null, "Hapus data berhasil!");
    //     //         } catch (Exception e1){
    //     //             JOptionPane.showMessageDialog(null, "Hapus data gagal!");
    //     //         } finally {
    //     //             updateData();
    //     //             btnUbah.setEnabled(false);
    //     //             btnHapus.setEnabled(false);
    //     //             btnSimpan.setEnabled(true);
    //     //         }
    //     //     }
    //     // });

    //     setVisible(true);
    //     setLocationRelativeTo(null);
    //     setDefaultCloseOperation(EXIT_ON_CLOSE);
    // }



//     // hitung jumlah data
//     public int getBanyakData(){
//         int jumlah = 0;
//         try{
//             koneksi.statement = koneksi.konek.createStatement();
//             query = "Select * from " + dbTabel;
//             ResultSet resultSet = koneksi.statement.executeQuery(query);
//             while (resultSet.next()){
//                 jumlah++;
//             }
//             return jumlah;
//         } catch (SQLException e){
//             System.out.println(e.getMessage());
//             System.out.println("SQL Error!");
//             return 0;
//         }
//     }

//     public void updateData(){
//         data = readData();
// //        table.setModel((new JTable(data, namaKolom)).getModel());

//         fJudul.setText("");
//         fKode.setText("");
//         fJumlah.setText("");

//         table = new JTable(data, namaKolom);
//         scrollPane = new JScrollPane(table);
//         add(scrollPane);
//         scrollPane.setBounds(20, 200, 600, 300);
//         scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

//     }

//     // Mengambil data dari database
//     public String[][] readData(){
//         int jumlah = 0;
//         try{
//             String data[][] = new String[getBanyakData()][3];
//             query = "Select * from "+dbTabel;
//             ResultSet resultSet = koneksi.statement.executeQuery(query);
//             while (resultSet.next()){
//                 data[jumlah][0] = String.valueOf(resultSet.getString("kode"));
//                 data[jumlah][1] = resultSet.getString("judul");
//                 data[jumlah][2] = String.valueOf(resultSet.getInt("jumlah"));
//                 jumlah++;
//             }
//             return data;
//         } catch (SQLException e){
//             System.out.println(e.getMessage());
//             System.out.println("SQL Error Read Data!");
//             return null;
//         }
//     }

// }


