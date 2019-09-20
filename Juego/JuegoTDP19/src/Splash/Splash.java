package Splash;

import java.awt.EventQueue;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

public class Splash extends JFrame {

    public JPanel contentPane;
     public JProgressBar progressBar;
     public JTextField textField;

    /**
     * Create the frame.
     */
    public Splash() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(600, 300, 800, 500);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        this.setUndecorated(true);
        contentPane.setLayout(null);

        progressBar = new JProgressBar();
        progressBar.setForeground(new Color(0, 204, 51));
        progressBar.setBounds(60, 420, 290, 14);
        progressBar.setBackground(Color.WHITE);
        contentPane.add(progressBar);

        textField = new JTextField();
        textField.setForeground(new Color(255, 255, 255));
        textField.setFont(new Font("Terminator Two", Font.BOLD, 16));
        textField.setEditable(false);
        textField.setBounds(60, 447, 290, 22);
        contentPane.add(textField);
        textField.setColumns(10);
        textField.setBackground(new Color(0, 0, 0));
        textField.setBorder(null);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(Splash.class.getResource("/ImagenesSplash/SplashGame.jpg")));
        lblNewLabel.setBounds(-48, 0, 900, 506);
        contentPane.add(lblNewLabel);

    }
}
