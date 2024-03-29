package GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
 
public class JPanelConFondo extends JPanel {
 
    private Image imagen= new ImageIcon("src/Sprites/Mapa/Mapa2Disenio.jpg").getImage();

    public void paint(Graphics g) {
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(),this);
        //g.drawRect(20, 50, 1000, 650);
        
        setOpaque(false);
        super.paint(g);
    }

    public void cambiarFondo(String direccionFondo){
        imagen=new ImageIcon(direccionFondo).getImage();
        this.repaint();
    }
}