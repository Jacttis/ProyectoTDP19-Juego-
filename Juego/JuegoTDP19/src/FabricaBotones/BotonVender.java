package FabricaBotones;

import Entidad.Aliados.Aliado;
import Tienda.Tienda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonVender extends JButton {

    private static BotonVender instance = null;

    public static BotonVender getBotonVender(){
        if(instance==null)
            instance = new BotonVender();

        return instance;
    }

    protected boolean esperandoAliado;

    private BotonVender(){

        esperandoAliado=false;
        this.setText("VENDER ALIADO");
        this.setForeground(Color.RED);
//        this.setBounds();
        this.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                esperandoAliado=true;
                BotonVender.getBotonVender().setEnabled(false);
            }
        });
    }

    public void intentoVenderAliado(Aliado aliado){
        if(esperandoAliado){
            aliado.eliminarse();
            //Tienda.getTienda().venderAliado(aliado);
            esperandoAliado=false;
            this.setEnabled(true);
        }
    }


}
