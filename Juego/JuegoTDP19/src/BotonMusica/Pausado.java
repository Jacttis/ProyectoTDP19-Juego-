package BotonMusica;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pausado extends EstadoBoton {

    public Pausado(JButtonMusic music){
        musica=music;

    }
    @Override
    public void accion() {
              musica.setSonido(java.applet.Applet.newAudioClip(getClass().getResource("Musica.wav")));
              musica.getSonido().play();
              musica.setEstado(new Reproduciendo(musica));
            }

}
