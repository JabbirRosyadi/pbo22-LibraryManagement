package View;

import Controller.AllObjectController;
import Controller.bukuController;
import Entity.buku_entity;
import Entity.peminjam_entity;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class peminjamGUI {
    private static bukuController Buku = new bukuController();
    JFrame Regis = new JFrame();
    JLabel judul, nama, nohp, alamat, lamaPinjaman, indexBuku, Bk;
    JButton regisBtn, backBTN;
    JTextField namaField, noField, alamatField, lamaField, ibkField;
    JTable bktable = new JTable();
    JScrollPane bkScroll = new JScrollPane(bktable);

    public peminjamGUI() {
        Regis.setLayout(null);
        Regis.setTitle("Data Peminjam");
        Regis.setSize(1000, 700);
        Regis.setVisible(true);
        Regis.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Regis.setLocationRelativeTo(null);
        Regis.getContentPane().setBackground(new Color(91, 28, 9));

        judul = new JLabel("DATA PEMINJAMAN BUKU");
        judul.setBounds(172, 60, 900, 70);
        judul.setFont(new Font("Consolas", Font.BOLD, 60));
        judul.setForeground(Color.white);
        Regis.add(judul);

        bkScroll.setBounds(450, 150, 500, 400);
        bktable.setModel(Buku.daftarBuku());
        Regis.add(bkScroll);

        Bk = new JLabel("Daftar Buku Yang Bisa Dipinjam");
        Bk.setFont(new Font("Consolas", Font.BOLD, 17));
        Bk.setBounds(450, 125, 400, 30);
        Bk.setForeground(Color.WHITE);
        Regis.add(Bk);

        nama = new JLabel("Masukkan Nama");
        nama.setBounds(50, 140, 900, 40);
        nama.setFont(new Font("Consolas", Font.CENTER_BASELINE, 20));
        nama.setForeground(Color.white);
        Regis.add(nama);
        namaField = new JTextField();
        namaField.setBounds(50, 170, 375, 20);
        Regis.add(namaField);

        lamaPinjaman = new JLabel("Berapa Hari Meminjam?");
        lamaPinjaman.setBounds(50, 220, 900, 40);
        lamaPinjaman.setFont(new Font("Consolas", Font.CENTER_BASELINE, 20));
        lamaPinjaman.setForeground(Color.white);
        Regis.add(lamaPinjaman);
        lamaField = new JTextField();
        lamaField.setBounds(50, 250, 375, 20);
        Regis.add(lamaField);

        alamat = new JLabel("Masukkan Alamat");
        alamat.setBounds(50, 300, 900, 40);
        alamat.setFont(new Font("Consolas", Font.CENTER_BASELINE, 20));
        alamat.setForeground(Color.white);
        Regis.add(alamat);
        alamatField = new JTextField();
        alamatField.setBounds(50, 330, 375, 20);
        Regis.add(alamatField);

        nohp = new JLabel("Masukkan Nomor HP");
        nohp.setBounds(50, 380, 900, 40);
        nohp.setFont(new Font("Consolas", Font.CENTER_BASELINE, 20));
        nohp.setForeground(Color.white);
        Regis.add(nohp);
        noField = new JTextField();
        noField.setBounds(50, 410, 375, 20);
        Regis.add(noField);

        indexBuku = new JLabel("Masukkan Judul Buku Yang Ingin Dipinjam");
        indexBuku.setBounds(50, 460, 900, 40);
        indexBuku.setFont(new Font("Consolas", Font.CENTER_BASELINE, 17));
        indexBuku.setForeground(Color.white);
        Regis.add(indexBuku);

        ibkField = new JTextField();
        ibkField.setBounds(50, 490, 375, 20);
        Regis.add(ibkField);

        regisBtn = new JButton("Tambahkan");
        regisBtn.setBounds(275, 520, 150, 40);
        regisBtn.setFont(new Font("Consolas", Font.BOLD, 20));
        regisBtn.setForeground(Color.black);
        regisBtn.setBackground(Color.green);
        Regis.add(regisBtn);

        regisBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nama = namaField.getText();
                    String nomor = noField.getText();
                    String alamat = alamatField.getText();
                    String lama1 = lamaField.getText();
                    String JudulBuku = ibkField.getText();
                    int lama = Integer.parseInt(lama1);
                    AllObjectController.Pctrl.buat(new peminjam_entity(nama, nomor, lama, alamat,JudulBuku));
                    JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan", "Informasi",
                            JOptionPane.INFORMATION_MESSAGE);
                    loginGUI bck = new loginGUI();
                    Regis.dispose();
                    kosong();
                } catch (Exception exc) {
                    JOptionPane.showMessageDialog(null, "terdapat kesalahan : " + exc, "Informasi",
                            JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                }
            }
        });

        backBTN = new JButton("BACK");
        backBTN.setBounds(450, 575, 150, 30);
        Regis.add(backBTN);

        backBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    loginGUI lg = new loginGUI();
                    Regis.dispose();
                } catch (Exception exc) {
                    JOptionPane.showMessageDialog(null, "terdapat kesalahan : " + exc, "Informasi",
                            JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                }
            }
        });
        Regis.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Regis.setVisible(true);
        Regis.setLocationRelativeTo(null);
    }

    void kosong() {
        namaField.setText(null);
        noField.setText(null);
        alamatField.setText(null);
        lamaField.setText(null);
    }
}
