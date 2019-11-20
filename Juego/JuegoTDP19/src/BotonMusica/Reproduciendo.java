package BotonMusica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reproduciendo extends  EstadoBoton {

 public Reproduciendo(JButtonMusic music){
     musica=music;
 }

 public void accion(){

             //musica.sonido=java.applet.Applet.newAudioClip(getClass().getResource("Musica.wav"));
             musica.sonido.stop();
             musica.estado=new Pausado(musica);
         }

}
