package GUI;

import javax.swing.*;
import java.awt.*;

public class JPanelConFondoDiferente extends JPanel {

    private Image imagen= new ImageIcon("Sprites/CharacterSprites/Archer.png").getImage();
    public void paint(Graphics g) {
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(),this);
        //g.drawRect(20, 50, 1000, 650);

        setOpaque(false);
        super.paint(g);
    }

    public void cambiarFondo(String direccionFondo){
        imagen=new ImageIcon(direccionFondo).getImage();
    }
}

