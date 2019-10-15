package GUI;

import Constantes.Constantes;
import Entidad.*;
import FabricaDisparos.FabricaDisparo;
import Juego.*;
import Tienda.Tienda;


import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;

class GuiTienda {


    private JPanel panel;
    private JButton btnArqueroHumano;
    private JButton btnMagoHielo;
    private JButton btnCaballeroEscudo;
    private JButton btnNewButton4;
    private JButton btnNewButton5;

    private JButton btnobjeto1;
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
        panel.setBounds(Constantes.PANEL_TIENDA_PX, 0, Constantes.PANEL_TIENDA_X, Constantes.PANEL_TIENDA_Y);





        btnArqueroHumano = new JButton();
        btnArqueroHumano.setIcon(new ImageIcon("Sprites/CharacterSprites/SpriteBoton/ArqueroHumanoChico.jpeg"));
        btnArqueroHumano.setBackground(Color.GRAY);
        btnArqueroHumano.setToolTipText("Tira flechas");
        btnArqueroHumano.setBounds(0,0,Constantes.BOTONES_X,Constantes.BOTONES_Y);
        btnArqueroHumano.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                aliadoAAgregar=new ArqueroHumano(100,10,750,"Dispara flechas");
                esperandoClick=true;
                deshabilitarBotones();

            }
        });
        panel.add(btnArqueroHumano);


        btnMagoHielo = new JButton();
        btnMagoHielo.setIcon(new ImageIcon("Sprites/CharacterSprites/SpriteBoton/MagoHieloAchicado.png"));
        btnMagoHielo.setToolTipText("Tira Hielo");
        btnMagoHielo.setBounds(150,0,Constantes.BOTONES_X,Constantes.BOTONES_Y);
        btnMagoHielo.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                aliadoAAgregar=new MagoHielo(100,20,1500,"Tira Hielo");
                esperandoClick=true;
                deshabilitarBotones();
            }
        });
        panel.add(btnMagoHielo);

        btnCaballeroEscudo = new JButton();
        btnCaballeroEscudo.setIcon(new ImageIcon("Sprites/CharacterSprites/SpriteBoton/CabAchicado2.png"));
        btnCaballeroEscudo.setToolTipText("Aguanta pero no pega");
        btnCaballeroEscudo.setBounds(300,0,Constantes.BOTONES_X,Constantes.BOTONES_Y);
        btnCaballeroEscudo.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                aliadoAAgregar=new CaballeroEscudo(100,0,0,"Aguanta Mucho pero no pega");
                esperandoClick=true;
                deshabilitarBotones();
            }
        });
        panel.add(btnCaballeroEscudo);

        btnNewButton4 = new JButton();
        btnNewButton4.setBounds(450,0,Constantes.BOTONES_X,Constantes.BOTONES_Y);
        panel.add(btnNewButton4);

        btnNewButton5 = new JButton();
        btnNewButton5.setBounds(600,0,Constantes.BOTONES_X,Constantes.BOTONES_Y);
        panel.add(btnNewButton5);

        btnobjeto1 = new JButton();
        btnobjeto1.setBounds(Constantes.BOTON1_PX,Constantes.BOTONES_PY,Constantes.BOTONES_X,Constantes.BOTONES_Y);
        panel.add(btnobjeto1);

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

        btnVender = new JButton("Vender");
        btnVender.setBounds(800,70,128,25);
        panel.add(btnVender);

        btnVender.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                for(Entidad a :  Mapa.getMapa().getEntidades()){
                    if(a  instanceof Aliado)
                        ((Aliado) a).disminuirVida(((Aliado) a).getVida());

                }


            }
        });




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
        if(esperandoClick){

            juego.comprarAliado(pos,aliadoAAgregar);

            esperandoClick=false;

            habilitarBotones();

        }

    }

    /**
     * Deshabilita todos los botones
     *
     */

    public void deshabilitarBotones(){
        btnMagoHielo.setEnabled(false);
        btnArqueroHumano.setEnabled(false);
        btnCaballeroEscudo.setEnabled(false);
    }

    /**
     * Habilita todos los botones.
     *
     */

    public void habilitarBotones(){
        btnMagoHielo.setEnabled(true);
        btnArqueroHumano.setEnabled(true);
        btnCaballeroEscudo.setEnabled(true);
    }

    public void actualizarOro(){
        labelOro.setText("Oro : "+Tienda.getTienda().getOro());
    }
    public void actualizarPuntaje(){
        labelPuntos.setText("Puntos : "+Tienda.getTienda().getPuntos());
    }
}
