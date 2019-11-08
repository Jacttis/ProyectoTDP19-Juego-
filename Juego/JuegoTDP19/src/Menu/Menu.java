package Menu;

import GUI.GUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu  extends JFrame{

    private static Menu instance=null;
    private JButton Jugar,Help,Quit;
    private JPanel contentPane;

    /**
     * Metodo que devuelve el menu ya que es unico en el juego.
     * Si este no esta creado lo crea sino devuelve el creado
     * @return Menu creado o existente
     */
    public static Menu getMenu(){
        if(instance==null){
            instance = new Menu();
        }
        return instance;
    }
    private Menu(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(600, 300, 800, 500);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        Jugar =new JButton("Play");
        Quit=new JButton("Quit");
        Help=new JButton("Help");

        Jugar.setBounds(330,140,100,50);
        Help.setBounds(330,210,100,50);
        Quit.setBounds(330,280,100,50);
        contentPane.add(Jugar);
        contentPane.add(Quit);
        contentPane.add(Help);

        Jugar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI frame = new GUI();
                frame.setVisible(true);
                Menu.getMenu().setVisible(false);
                instance=null;
            }
        });

        Quit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("Menu/FondoLejos.png"));
        lblNewLabel.setBounds(-48, 0, 900, 506);
        contentPane.add(lblNewLabel);

    }
}
