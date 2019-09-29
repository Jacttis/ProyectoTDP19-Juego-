package GUI;

import Entidad.Aliado;
import Entidad.ArqueroHumano;
import Entidad.CaballeroEscudo;
import Entidad.MagoHielo;
import FabricaDisparos.FabricaDisparo;
import Juego.Juego;
import Tienda.Tienda;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;

class GuiTienda {

    private JFrame frame;
    private JPanel panel;
    private JButton btnArqueroHumano;
    private JButton btnMagoHielo;
    private JButton btnCaballeroEscudo;
    private JButton btnNewButton4;
    private JButton btnNewButton5;

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
        frame = new JFrame();
        frame.setBounds(100, 100, 1008, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        panel = new JPanel();
        panel.setBounds(100, 0, 992, 230);

        frame.getContentPane().add(panel);



        btnArqueroHumano = new JButton();
        btnArqueroHumano.setIcon(new ImageIcon("Sprites\\CharacterSprites\\SpriteBoton\\ArqueroHumanoChico.jpeg"));
        btnArqueroHumano.setBackground(Color.GRAY);
        btnArqueroHumano.setToolTipText("Tira flechas");
        btnArqueroHumano.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                aliadoAAgregar=new ArqueroHumano(100,100,1500,"Dispara flechas",FabricaDisparo.getFabricaDisparos());
                esperandoClick=true;
                deshabilitarBotones();

            }
        });



        btnMagoHielo = new JButton();
        btnMagoHielo.setIcon(new ImageIcon("Sprites\\CharacterSprites\\SpriteBoton\\MagoHieloAchicado.png"));
        btnMagoHielo.setToolTipText("Tira Hielo");
        btnMagoHielo.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                aliadoAAgregar=new MagoHielo(100,100,1500,"Tira Hielo",FabricaDisparo.getFabricaDisparos());
                esperandoClick=true;
                deshabilitarBotones();
            }
        });

        btnCaballeroEscudo = new JButton();
        btnCaballeroEscudo.setIcon(new ImageIcon("Sprites\\CharacterSprites\\SpriteBoton\\CabAchicado2.png"));
        btnCaballeroEscudo.setToolTipText("Aguanta pero no pega");
        btnCaballeroEscudo.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                aliadoAAgregar=new CaballeroEscudo(100,100,0,"Aguanta Mucho pero no pega",FabricaDisparo.getFabricaDisparos());
                esperandoClick=true;
                deshabilitarBotones();
            }
        });

        btnNewButton4 = new JButton();

        btnNewButton5 = new JButton();

        labelOro = new JLabel("Oro : 0");

        labelPuntos = new JLabel("Puntos: 0");

        btnVender = new JButton("Vender");


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

}
