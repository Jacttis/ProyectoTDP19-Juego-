package GUI;

import Constantes.Constantes;
import Entidad.Aliados.*;
import Entidad.PowerUp.AgujeroNegro;
import Entidad.PowerUp.ObjetoPrecioso;
import FabricaBotones.*;
import FabricaBotones.BotonesAliados.*;
import FabricaBotones.BotonesObjetos.BotonAgujeroNegro;
import FabricaBotones.BotonesObjetos.BotonObjeto;
import Juego.*;
import Tienda.Tienda;


import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class GuiTienda {


    private JPanel panel;

    private JButton btnobjeto2;
    private JButton btnobjeto3;
    private JButton btnobjeto4;
    private JButton btnobjeto5;

    private JButton btnVender;
    private JLabel labelPuntos;
    private JLabel labelOro;

    private GUI gui;
    private Juego juego;

    private boolean esperandoClick;
    private Aliado aliadoAAgregar;





    /**
     * Create the application.
     */
    public GuiTienda(GUI gui, Juego juego) {

        this.gui=gui;
        esperandoClick=false;

        this.juego=juego;

        initialize();

    }

    /**
     * Se crea el panel de la tienda
     */
    private void initialize() {


        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.DARK_GRAY);
        panel.setBounds(Constantes.PANEL_TIENDA_PX, 0, Constantes.PANEL_TIENDA_X, Constantes.PANEL_TIENDA_Y);

        BotonAliado botonArquero = new BotonArqueroHumano();
        botonArquero.setBounds(0,0,Constantes.BOTONES_X,Constantes.BOTONES_Y);
        panel.add(botonArquero);

        BotonAliado botonMagoHielo = new BotonMagoHielo();
        botonMagoHielo.setBounds(150,0,Constantes.BOTONES_X,Constantes.BOTONES_Y);
        panel.add(botonMagoHielo);

        BotonAliado botonCaballeroEscudo = new BotonCaballeroEscudo();
        botonCaballeroEscudo.setBounds(300,0,Constantes.BOTONES_X,Constantes.BOTONES_Y);
        panel.add(botonCaballeroEscudo);

        BotonAliado botonArqueroPRO = new BotonArqueroPro();
        botonArqueroPRO.setBounds(450,0,Constantes.BOTONES_X,Constantes.BOTONES_Y);
        panel.add(botonArqueroPRO);

        BotonAliado botonGoblinExplosivo = new BotonGoblinExplosivo();
        botonGoblinExplosivo.setBounds(600,0,Constantes.BOTONES_X,Constantes.BOTONES_Y);
        panel.add(botonGoblinExplosivo);

        BotonObjeto botonAgujeroNegro = BotonAgujeroNegro.getBotonAgujeroNegro();
        botonAgujeroNegro.setBounds(Constantes.BOTON1_PX,Constantes.BOTONES_PY,Constantes.BOTONES_X,Constantes.BOTONES_Y);
        panel.add(botonAgujeroNegro);



        btnobjeto2 = new JButton();
        btnobjeto2.setBounds(Constantes.BOTON1_PX+150,Constantes.BOTONES_PY,Constantes.BOTONES_X,Constantes.BOTONES_Y);
        panel.add(btnobjeto2);

        btnobjeto3 = new JButton();
        btnobjeto3.setBounds(Constantes.BOTON1_PX+300,Constantes.BOTONES_PY,Constantes.BOTONES_X,Constantes.BOTONES_Y);
        panel.add(btnobjeto3);

        btnobjeto4 = new JButton();
        btnobjeto4.setBounds(Constantes.BOTON1_PX+450,Constantes.BOTONES_PY,Constantes.BOTONES_X,Constantes.BOTONES_Y);
        panel.add(btnobjeto4);

        btnobjeto5 = new JButton();
        btnobjeto5.setBounds(Constantes.BOTON1_PX+600,Constantes.BOTONES_PY,Constantes.BOTONES_X,Constantes.BOTONES_Y);
        panel.add(btnobjeto5);



        labelOro = new JLabel("Oro : "+Tienda.getTienda().getOro());
        labelOro.setForeground(Color.GREEN);
        labelOro.setBounds(800,0,70,40);
        panel.add(labelOro);

        labelPuntos = new JLabel("Puntos: "+Tienda.getTienda().getPuntos());
        labelPuntos.setForeground((Color.GREEN));
        labelPuntos.setBounds(800,30,80,40);
        panel.add(labelPuntos);

        btnVender = BotonVender.getBotonVender();
        btnVender.setBounds(800,70,128,25);
        panel.add(btnVender);



    }
    /**
     * Retorna el panel de la tienda
     */

    public JPanel getPanel() {
        return panel;
    }


    /**
     * Es llamado desde la gui principal si hubo un click en el mapa
     * Si esta esperando una posicion, se le enviara al juego comprar aliado
     *
     *
     * @param pos
     */

    public void seClickeoEnMapa(Point pos){

        Tienda.getTienda().intentoCompra(pos);

    }

    /**
     * Deshabilita todos los botones
     *
     */

    public void deshabilitarBotones(){

    }

    /**
     * Habilita todos los botones.
     *
     */

    public void habilitarBotones(){

    }

    public void actualizarOro(){
        labelOro.setText("Oro : "+Tienda.getTienda().getOro());
    }
    public void actualizarPuntaje(){
        labelPuntos.setText("Puntos : "+Tienda.getTienda().getPuntos());
    }
}
