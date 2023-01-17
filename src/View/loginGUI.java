package View;

import Controller.AllObjectController;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginGUI {
    JFrame login = new JFrame();
    JLabel judul, usernameS, passwordS;
    JButton loginBts, MasukP;
    JTextField fieldUsrS;
    JPasswordField fieldPwS;
    JRadioButton peminjamRd, staffRd;

    public loginGUI() {
        login.setLayout(null);
        login.setTitle("Menu Login");
        login.setSize(1000, 700);
        login.setVisible(true);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.setLocationRelativeTo(null);
        login.getContentPane().setBackground(new Color(91, 28, 9));

        peminjamRd = new JRadioButton("Pilih Peminjam");
        peminjamRd.setBounds(200, 400, 200, 30);
        peminjamRd.setFont(new Font("Consolas", Font.CENTER_BASELINE, 20));
        peminjamRd.setForeground(Color.WHITE);
        peminjamRd.setBackground(new Color(91, 28, 9));
        login.add(peminjamRd);

        staffRd = new JRadioButton("Pilih Staff");
        staffRd.setBounds(200, 500, 150, 30);
        staffRd.setFont(new Font("Consolas", Font.CENTER_BASELINE, 20));
        staffRd.setForeground(Color.WHITE);
        staffRd.setBackground(new Color(91, 28, 9));
        login.add(staffRd);

        judul = new JLabel("MENU LOGIN");
        judul.setBounds(320, 60, 900, 70);
        judul.setFont(new Font("Consolas", Font.BOLD, 60));
        judul.setForeground(Color.white);
        login.add(judul);

        usernameS = new JLabel("Username");
        usernameS.setBounds(200, 200, 900, 40);
        usernameS.setFont(new Font("Consolas", Font.CENTER_BASELINE, 20));
        usernameS.setForeground(Color.white);
        usernameS.setVisible(false);
        login.add(usernameS);

        fieldUsrS = new JTextField();
        fieldUsrS.setBounds(200, 250, 500, 40);
        fieldUsrS.setVisible(false);
        login.add(fieldUsrS);

        passwordS = new JLabel("Password");
        passwordS.setBounds(200, 300, 900, 40);
        passwordS.setFont(new Font("Consolas", Font.CENTER_BASELINE, 20));
        passwordS.setForeground(Color.white);
        passwordS.setVisible(false);
        login.add(passwordS);

        fieldPwS = new JPasswordField();
        fieldPwS.setBounds(200, 350, 500, 40);
        fieldPwS.setVisible(false);
        login.add(fieldPwS);

        loginBts = new JButton("LOGIN");
        loginBts.setBounds(500, 400, 200, 40);
        loginBts.setFont(new Font("Consolas", Font.CENTER_BASELINE, 20));
        loginBts.setForeground(Color.black);
        loginBts.setVisible(false);
        login.add(loginBts);

        MasukP = new JButton("MASUK");
        MasukP.setBounds(370, 220, 220, 60);
        MasukP.setFont(new Font("Consolas", Font.BOLD, 45));
        MasukP.setForeground(Color.black);
        MasukP.setVisible(false);
        login.add(MasukP);

        loginBts.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    AllObjectController.Sctrl.dataStaff();
                    if (AllObjectController.Sctrl.cekLogin(fieldUsrS.getText(), fieldPwS.getText())) {
                        String nama = AllObjectController.Sctrl.StaffEt().getName();
                        JOptionPane.showMessageDialog(null, "Selamat Datang " + nama + " Di Perpus Bikini Bottom",
                                "Informasi", JOptionPane.INFORMATION_MESSAGE);
                        staffGUI stfgui = new staffGUI();
                        login.dispose();
                        kosong();
                    } else {
                        JOptionPane.showMessageDialog(null, "Kamu Siapa??????", "Informasi",
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

        MasukP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    peminjamGUI msk = new peminjamGUI();
                    login.dispose();
                    kosong();
                } catch (Exception exc) {
                    JOptionPane.showMessageDialog(null, "terdapat kesalahan : " + exc, "Informasi",
                            JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                }
            }
        });

        peminjamRd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (peminjamRd.isSelected()) {
                    staffRd.setSelected(false);
                    usernameS.setVisible(false);
                    fieldUsrS.setVisible(false);
                    passwordS.setVisible(false);
                    fieldPwS.setVisible(false);
                    loginBts.setVisible(false);
                    MasukP.setVisible(true);
                }
            }
        });
        staffRd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (staffRd.isSelected()) {
                    peminjamRd.setSelected(false);
                    usernameS.setVisible(true);
                    fieldUsrS.setVisible(true);
                    passwordS.setVisible(true);
                    fieldPwS.setVisible(true);
                    loginBts.setVisible(true);
                    MasukP.setVisible(false);

                }
            }
        });
    }

    void kosong() {
        fieldUsrS.setText(null);
        fieldPwS.setText(null);
    }
}
