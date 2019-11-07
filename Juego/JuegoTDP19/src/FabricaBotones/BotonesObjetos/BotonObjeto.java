package FabricaBotones.BotonesObjetos;

import Entidad.PowerUp.ObjetosPreciosos.ObjetoPrecioso;
import Tienda.Tienda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class BotonObjeto extends JButton {

    public BotonObjeto(String imagePath){

        this.setBackground(Color.DARK_GRAY);
        this.setToolTipText(getObjeto().getDescripcion());
        this.setIcon(new ImageIcon(imagePath));
        setEnabled(false);
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tienda.getTienda().setNextObjectToAdd(getObjeto());
                setEnabled(false);
            }
        });
    }

    public abstract ObjetoPrecioso getObjeto();
}
