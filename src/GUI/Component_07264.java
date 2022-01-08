package GUI;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.Base64;

public class Component_07264 extends JFrame {
    protected JTextField jTextField1 = new JTextField();
    protected JTextField jTextField2 = new JTextField();
    protected JTextField jTextField3 = new JTextField();
    protected JTextField jTextField4 = new JTextField();
    protected JTextField jTextField5 = new JTextField();
    protected JTextField jTextField6 = new JTextField();
    protected JPasswordField jPasswordField1 = new JPasswordField();

    protected JButton jButton1 = new JButton();
    protected JButton jButton2 = new JButton();
    protected JButton jButton3 = new JButton();
    protected JButton jButton4 = new JButton();

    protected JLabel jLabel1 = new JLabel();
    protected JLabel jLabel2 = new JLabel();
    protected JLabel jLabel3 = new JLabel();
    protected JLabel jLabel4 = new JLabel();
    protected JLabel jLabel5 = new JLabel();
    protected JLabel jLabel6 = new JLabel();

    protected JComboBox jComboBox1 = new JComboBox();

    protected static void setToWindowsDesign() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void showDesignInfo() {
        UIManager.LookAndFeelInfo[] info = UIManager.getInstalledLookAndFeels();
        for (UIManager.LookAndFeelInfo lookAndFeelInfo : info) {
            System.out.println(lookAndFeelInfo);
        }
    }

    public static void loadGUI(String urlString) {
        byte[] decodedBytes = Base64.getDecoder().decode(urlString);
        String decodedString = new String(decodedBytes);

        try {
            Desktop.getDesktop().browse(new URL(decodedString).toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
