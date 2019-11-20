package BotonMusica;

import javax.swing.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonMusic extends JButton {
    AudioClip sonido;
    EstadoBoton estado;                       //acordar de cambiar Musica
    public JButtonMusic(String string){
        super(string);
        setBounds(950,15,20,20);
        setIcon(new ImageIcon("src/BotonMusica/nota1.jpg"));
        setVisible(true);
        estado=new Pausado(this);
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                accion();
            }
        });
    }

    public void accion(){
        estado.accion();
    }

    public AudioClip getSonido() {
        return sonido;
    }

    public void setSonido(AudioClip sonido) {
        this.sonido = sonido;
    }

    public EstadoBoton getEstado() {
        return estado;
    }

    public void setEstado(EstadoBoton estado) {
        this.estado = estado;
    }

}
