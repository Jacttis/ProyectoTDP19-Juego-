package GUI;

import Juego.Juego;
import Juego.Mapa;
import Niveles.NivelUno;

import javax.swing.*;

public class BotonAgregar extends JButton {


    public BotonAgregar(){
        super();


    }

    public void agregarCHOBI(){
        Mapa.getMapa().generar();
    }


}
