package GUI;

import Juego.Juego;
import Juego.Mapa;
import Niveles.NivelUno;

import javax.swing.*;

public class BotonAgregar extends JButton {

    private NivelUno nivel;

    public BotonAgregar(){
        super();
        nivel=NivelUno.getinstance();

    }

    public void agregarCHOBI(){
        nivel.generarEnemigos();
    }


}
