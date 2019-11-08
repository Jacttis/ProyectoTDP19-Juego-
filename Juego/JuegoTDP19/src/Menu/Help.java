package Menu;

import javax.swing.*;

public class Help extends JFrame {
    JTextArea instrucciones;
    public Help(){
        setBounds(600,200,1000,1000);
        setVisible(true);
        instrucciones=new JTextArea();
        this.add(instrucciones);
        instrucciones.setText("Aqui iria las instrucciones");
        instrucciones.setEditable(false);
    }



}
