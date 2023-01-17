package View;

import javax.swing.*;

import Controller.AllObjectController;
import Entity.buku_entity;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class staffGUI {
    JFrame data = new JFrame();
    JLabel addBK, updBK, delBK, judulBK, penerbitBK, penulisBK, tahunBK,
            judulBKU, penerbitBKU, penulisBKU, tahunBKU, indexBKU, indexDELBK,
            dataBK, dataPEMINJAM, delPMJ,indexDELPMJ;
    JTextField judulFLD, penerbitFLD, penulisFLD, tahunFLD,
            indeFLDU, judulFLDU, penerbitFLDU, penulisFLDU, tahunFLDU, indexDELFLD,indexPMJFLD;
    JButton addBTN, updBTN, delBTN, backBTN,delPBTN;
    JTable bktable = new JTable(),
            peminjamTABEL = new JTable();
    JScrollPane bkScroll = new JScrollPane(bktable),
            peminjamSCROLL = new JScrollPane(peminjamTABEL);

    public staffGUI() {
        // private String judul, penerbit, penulis;
        // private int tahun;
        data.setLayout(null);
        data.setTitle("Menu Staff");
        data.setSize(1100, 700);

        addBK = new JLabel("TAMBAH BUKU");
        addBK.setBounds(50, 30, 150, 30);
        addBK.setFont(new Font("Consolas", Font.CENTER_BASELINE, 20));
        addBK.setForeground(Color.white);
        data.add(addBK);

        updBK = new JLabel("UPDATE BUKU");
        updBK.setBounds(275, 30, 150, 30);
        updBK.setFont(new Font("Consolas", Font.CENTER_BASELINE, 20));
        updBK.setForeground(Color.white);
        data.add(updBK);

        delBK = new JLabel("DELETE BUKU");
        delBK.setBounds(50, 465, 150, 30);
        delBK.setFont(new Font("Consolas", Font.CENTER_BASELINE, 20));
        delBK.setForeground(Color.white);
        data.add(delBK);

        delPMJ = new JLabel("DELETE PEMINJAM");
        delPMJ.setBounds(245, 500, 150, 30);
        delPMJ.setFont(new Font("Consolas", Font.CENTER_BASELINE, 17));
        delPMJ.setForeground(Color.white);
        data.add(delPMJ);

        judulBK = new JLabel("Judul Buku");
        judulBK.setBounds(50, 75, 150, 30);
        judulBK.setFont(new Font("Consolas", Font.CENTER_BASELINE, 18));
        judulBK.setForeground(Color.white);
        data.add(judulBK);
        judulFLD = new JTextField();
        judulFLD.setBounds(50, 100, 150, 30);
        data.add(judulFLD);

        penerbitBK = new JLabel("Penerbit Buku");
        penerbitBK.setBounds(50, 150, 150, 30);
        penerbitBK.setFont(new Font("Consolas", Font.CENTER_BASELINE, 18));
        penerbitBK.setForeground(Color.white);
        data.add(penerbitBK);
        penerbitFLD = new JTextField();
        penerbitFLD.setBounds(50, 175, 150, 30);
        data.add(penerbitFLD);

        penulisBK = new JLabel("Penulis Buku");
        penulisBK.setBounds(50, 225, 150, 30);
        penulisBK.setFont(new Font("Consolas", Font.CENTER_BASELINE, 18));
        penulisBK.setForeground(Color.white);
        data.add(penulisBK);
        penulisFLD = new JTextField();
        penulisFLD.setBounds(50, 250, 150, 30);
        data.add(penulisFLD);

        tahunBK = new JLabel("Tahun Terbit Buku");
        tahunBK.setBounds(50, 300, 200, 30);
        tahunBK.setFont(new Font("Consolas", Font.CENTER_BASELINE, 18));
        tahunBK.setForeground(Color.white);
        data.add(tahunBK);
        tahunFLD = new JTextField();
        tahunFLD.setBounds(50, 325, 150, 30);
        data.add(tahunFLD);

        judulBKU = new JLabel("Judul Buku");
        judulBKU.setBounds(275, 75, 150, 30);
        judulBKU.setFont(new Font("Consolas", Font.CENTER_BASELINE, 18));
        judulBKU.setForeground(Color.white);
        data.add(judulBKU);
        judulFLDU = new JTextField();
        judulFLDU.setBounds(275, 100, 150, 30);
        data.add(judulFLDU);

        penerbitBKU = new JLabel("Penerbit Buku");
        penerbitBKU.setBounds(275, 150, 150, 30);
        penerbitBKU.setFont(new Font("Consolas", Font.CENTER_BASELINE, 18));
        penerbitBKU.setForeground(Color.white);
        data.add(penerbitBKU);
        penerbitFLDU = new JTextField();
        penerbitFLDU.setBounds(275, 175, 150, 30);
        data.add(penerbitFLDU);

        penulisBKU = new JLabel("Penulis Buku");
        penulisBKU.setBounds(275, 225, 150, 30);
        penulisBKU.setFont(new Font("Consolas", Font.CENTER_BASELINE, 18));
        penulisBKU.setForeground(Color.white);
        data.add(penulisBKU);
        penulisFLDU = new JTextField();
        penulisFLDU.setBounds(275, 250, 150, 30);
        data.add(penulisFLDU);

        tahunBKU = new JLabel("Tahun Terbit Buku");
        tahunBKU.setBounds(275, 300, 200, 30);
        tahunBKU.setFont(new Font("Consolas", Font.CENTER_BASELINE, 18));
        tahunBKU.setForeground(Color.white);
        data.add(tahunBKU);
        tahunFLDU = new JTextField();
        tahunFLDU.setBounds(275, 325, 150, 30);
        data.add(tahunFLDU);

        indexBKU = new JLabel("Index UPDATE Buku");
        indexBKU.setBounds(275, 375, 200, 30);
        indexBKU.setFont(new Font("Consolas", Font.CENTER_BASELINE, 18));
        indexBKU.setForeground(Color.white);
        data.add(indexBKU);
        indeFLDU = new JTextField();
        indeFLDU.setBounds(275, 400, 150, 30);
        data.add(indeFLDU);

        indexDELBK = new JLabel("Index DELETE Buku");
        indexDELBK.setBounds(50, 500, 200, 30);
        indexDELBK.setFont(new Font("Consolas", Font.CENTER_BASELINE, 18));
        indexDELBK.setForeground(Color.white);
        data.add(indexDELBK);
        indexDELFLD = new JTextField();
        indexDELFLD.setBounds(50, 525, 150, 30);
        data.add(indexDELFLD);

        indexDELPMJ = new JLabel("Index DELETE Peminjam");
        indexDELPMJ.setBounds(245, 525, 200, 30);
        indexDELPMJ.setFont(new Font("Consolas", Font.CENTER_BASELINE, 15));
        indexDELPMJ.setForeground(Color.white);
        data.add(indexDELPMJ);
        indexPMJFLD = new JTextField();
        indexPMJFLD.setBounds(245, 550, 150, 30);
        data.add(indexPMJFLD);

        // 450
        updBTN = new JButton("UPDATE");
        updBTN.setBounds(275, 450, 150, 30);
        data.add(updBTN);

        addBTN = new JButton("ADD");
        addBTN.setBounds(50, 400, 150, 30);
        data.add(addBTN);

        delBTN = new JButton("DELETE");
        delBTN.setBounds(50, 575, 150, 30);
        data.add(delBTN);

        delPBTN = new JButton("DELETE");
        delPBTN.setBounds(245,600, 150, 30);
        data.add(delPBTN);

        dataBK = new JLabel("DATA BUKU");
        dataBK.setBounds(450, 30, 150, 30);
        dataBK.setFont(new Font("Consolas", Font.CENTER_BASELINE, 20));
        dataBK.setForeground(Color.white);
        data.add(dataBK);

        bkScroll.setBounds(450, 75, 600, 200);
        bktable.setModel(AllObjectController.Bctrl.daftarBuku());
        data.add(bkScroll);

        dataPEMINJAM = new JLabel("DATA PEMINJAM");
        dataPEMINJAM.setBounds(550, 300, 200, 30);
        dataPEMINJAM.setFont(new Font("Consolas", Font.CENTER_BASELINE, 18));
        dataPEMINJAM.setForeground(Color.white);
        data.add(dataPEMINJAM);

        peminjamSCROLL.setBounds(450, 350, 600, 200);
        peminjamTABEL.setModel(AllObjectController.Pctrl.dataPMJ());
        data.add(peminjamSCROLL);

        backBTN = new JButton("BACK");
        backBTN.setBounds(450, 575, 150, 30);
        data.add(backBTN);

        backBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    loginGUI lg = new loginGUI();
                    data.dispose();
                } catch (Exception exc) {
                    JOptionPane.showMessageDialog(null, "terdapat kesalahan : " + exc, "Informasi",
                            JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                }
            }
        });

        addBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String tahun = tahunFLD.getText();
                    int thn = Integer.parseInt(tahun);
                    AllObjectController.Bctrl.inputBuku(new buku_entity(judulFLD.getText(), penerbitFLD.getText(),
                            thn, penulisFLD.getText()));
                    JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan", "Informasi",
                            JOptionPane.INFORMATION_MESSAGE);
                    bktable.setModel(AllObjectController.Bctrl.daftarBuku());
                    kosong();
                } catch (Exception exc) {
                    JOptionPane.showMessageDialog(null, "terdapat kesalahan : " + exc, "Informasi",
                            JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                }
            }
        });

        updBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (AllObjectController.Bctrl.getDATABK().isEmpty() == false) {
                        String tahun = tahunFLDU.getText();
                        int thn = Integer.parseInt(tahun);
                        String i = indeFLDU.getText();
                        int index = Integer.parseInt(i);
                        AllObjectController.Bctrl.editBuku(index,
                                new buku_entity(judulFLDU.getText(), penerbitFLDU.getText(),
                                        thn, penulisFLDU.getText()));
                        bktable.setModel(AllObjectController.Bctrl.daftarBuku());
                        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan", "Informasi",
                                JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    } else {
                        JOptionPane.showMessageDialog(null, "Data Masih Kosong", "Informasi",
                                JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    }
                } catch (Exception exc) {
                    JOptionPane.showMessageDialog(null, "terdapat kesalahan : " + exc, "Informasi",
                            JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                }
            }
        });

        delBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (AllObjectController.Bctrl.getDATABK().isEmpty() == false) {
                        String i = indexDELFLD.getText();
                        int index = Integer.parseInt(i);
                        AllObjectController.Bctrl.hapusBuku(index);
                        bktable.setModel(AllObjectController.Bctrl.daftarBuku());
                        JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus", "Informasi",
                                JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    } else {
                        JOptionPane.showMessageDialog(null, "Data Masih Kosong", "Informasi",
                                JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    }
                } catch (Exception exc) {
                    JOptionPane.showMessageDialog(null, "terdapat kesalahan : " + exc, "Informasi",
                            JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                }
            }
        });

        delPBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (AllObjectController.Pctrl.getDATAPMJ().isEmpty() == false) {
                        String i = indexDELPMJ.getText();
                        int index = Integer.parseInt(i);
                        AllObjectController.Pctrl.hapusPJ(index);
                        peminjamTABEL.setModel(AllObjectController.Pctrl.dataPMJ());
                        JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus", "Informasi",
                                JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    } else {
                        JOptionPane.showMessageDialog(null, "Data Masih Kosong", "Informasi",
                                JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    }
                } catch (Exception exc) {
                    JOptionPane.showMessageDialog(null, "terdapat kesalahan : " + exc, "Informasi",
                            JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                }
            }
        });

        data.setVisible(true);
        data.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        data.setLocationRelativeTo(null);
        data.getContentPane().setBackground(new Color(91, 28, 9));
    }

    void kosong() {
        judulFLD.setText(null);
        penerbitFLD.setText(null);
        penulisFLD.setText(null);
        tahunFLD.setText(null);
        indeFLDU.setText(null);
        judulFLDU.setText(null);
        penerbitFLDU.setText(null);
        penulisFLDU.setText(null);
        tahunFLDU.setText(null);
        indexDELFLD.setText(null);
    }
}
