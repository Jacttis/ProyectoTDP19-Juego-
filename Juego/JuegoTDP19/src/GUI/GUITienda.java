package GUI;

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
     * Initialize the contents of the frame.
     */
    private void initialize() {


        panel = new JPanel();
        panel.setBounds(100, 0, 992, 230);





        btnArqueroHumano = new JButton();
        btnArqueroHumano.setIcon(new ImageIcon("Sprites/CharacterSprites/SpriteBoton/ArqueroHumanoChico.jpeg"));
        btnArqueroHumano.setBackground(Color.GRAY);
        btnArqueroHumano.setToolTipText("Tira flechas");
        btnArqueroHumano.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                aliadoAAgregar=new ArqueroHumano(100,10,750,"Dispara flechas");
                esperandoClick=true;
                deshabilitarBotones();

            }
        });



        btnMagoHielo = new JButton();
        btnMagoHielo.setIcon(new ImageIcon("Sprites/CharacterSprites/SpriteBoton/MagoHieloAchicado.png"));
        btnMagoHielo.setToolTipText("Tira Hielo");
        btnMagoHielo.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                aliadoAAgregar=new MagoHielo(100,20,1500,"Tira Hielo");
                esperandoClick=true;
                deshabilitarBotones();
            }
        });

        btnCaballeroEscudo = new JButton();
        btnCaballeroEscudo.setIcon(new ImageIcon("Sprites/CharacterSprites/SpriteBoton/CabAchicado2.png"));
        btnCaballeroEscudo.setToolTipText("Aguanta pero no pega");
        btnCaballeroEscudo.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                aliadoAAgregar=new CaballeroEscudo(100,0,0,"Aguanta Mucho pero no pega");
                esperandoClick=true;
                deshabilitarBotones();
            }
        });

        btnNewButton4 = new JButton();

        btnNewButton5 = new JButton();

        btnobjeto1 = new JButton();
        btnobjeto1.setBounds(0,120,149,120);
        panel.add(btnobjeto1);

        btnobjeto2 = new JButton();
        btnobjeto2.setBounds(150,120,149,120);
        panel.add(btnobjeto2);

        btnobjeto3 = new JButton();
        btnobjeto3.setBounds(300,120,149,120);
        panel.add(btnobjeto3);

        btnobjeto4 = new JButton();
        btnobjeto4.setBounds(450,120,149,120);
        panel.add(btnobjeto4);

        btnobjeto5 = new JButton();
        btnobjeto5.setBounds(600,120,149,120);
        panel.add(btnobjeto5);

        btnobjeto2 = new JButton();
        btnobjeto3 = new JButton();
        btnobjeto4 = new JButton();
        btnobjeto5 = new JButton();

        labelOro = new JLabel("Oro : "+Tienda.getTienda().getOro());
        labelOro.setForeground(Color.GREEN);
        labelOro.setOpaque(true);

        labelPuntos = new JLabel("Puntos: 0");

        btnVender = new JButton("Vender");

        btnVender.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                for(Entidad a :  Mapa.getMapa().getEntidades()){
                    if(a  instanceof Aliado)
                        ((Aliado) a).disminuirVida(((Aliado) a).getVida());

                }


            }
        });


        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(
                gl_panel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel.createSequentialGroup()
                                .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addGap(143)
                                                .addComponent(btnMagoHielo, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addGap(283)
                                                .addComponent(btnCaballeroEscudo, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btnArqueroHumano, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE))
                                .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)

                                        .addComponent(btnNewButton5, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addGap(146)
                                                .addComponent(btnNewButton4, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)))
                                .addGap(10)
                                .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addGap(17)
                                                .addComponent(labelOro, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addGap(16)
                                                .addComponent(labelPuntos, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btnVender, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)))
        );
        gl_panel.setVerticalGroup(
                gl_panel.createParallelGroup(Alignment.LEADING)
                        .addComponent(btnMagoHielo, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCaballeroEscudo, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnArqueroHumano,GroupLayout.PREFERRED_SIZE,120,GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNewButton5, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNewButton4, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                        .addGroup(gl_panel.createSequentialGroup()
                                .addGap(22)
                                .addComponent(labelOro, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                                .addGap(11)
                                .addComponent(labelPuntos)
                                .addGap(14)
                                .addComponent(btnVender))
        );
        panel.setLayout(gl_panel);

    }

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

}
