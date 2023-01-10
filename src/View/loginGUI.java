package View;

import javax.swing.*;
import java.awt.*;

public class loginGUI {
    JFrame login = new JFrame();

    public loginGUI(){
        login.setLayout(null);
        login.setTitle("Login Pertugas");
        login.setSize(1000,850);
        login.setVisible(true);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.setLocationRelativeTo(null);
        login.getContentPane().setBackground(new Color(71, 4, 4));
    }
}
