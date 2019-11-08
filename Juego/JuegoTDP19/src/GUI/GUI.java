package GUI;

import java.awt.*;
import java.awt.event.*;
import java.util.LinkedList;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;


import Constantes.Constantes;
import Entidad.*;
import Juego.Juego;
import Splash.*;


public class GUI extends JFrame implements MouseListener {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JPanelConFondo fondo;
	private Juego juego;
	private HiloTiempo tiempo;
	private JButton btnMusica;
	private JLabel puntaje;
	private GuiTienda guiTienda;


	public GUI() {
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				//keyListener(arg0);
				
			}
			public void keyReleased(KeyEvent arg0) {
				
			
			}
		});
		getContentPane().setLayout(null);

		this.addMouseListener(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Constantes.actualizar(1980,1040);
			setBounds(0, 0, Constantes.GUI_BOUNDS_X, Constantes.GUI_BOUNDS_Y);
		setMaximumSize(new Dimension(1980, 1040));
		setResizable(false);

		
		this.fondo = new JPanelConFondo();
		contentPane=fondo;
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);



		puntaje=new JLabel();
		puntaje.setBounds(Constantes.PUNTAJE_BOUNDS_PX,Constantes.PUNTAJE_BOUNDS_PY,Constantes.PUNTAJE_BOUNDS_X,Constantes.PUNTAJE_BOUNDS_Y);
		puntaje.setText("0");


		contentPane.add(puntaje);
		setContentPane(contentPane);


		juego=Juego.crearJuego(this);
		tiempo = new HiloTiempo(juego);


		guiTienda=new GuiTienda(this,juego);
		contentPane.add(guiTienda.getPanel());



		tiempo.start();



		this.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));



	}

	public void cambiarFondo(String direccionImagen){
		fondo.cambiarFondo(direccionImagen);
	}

	public void actualizaEtiquetas(){
		guiTienda.actualizarOro();
		guiTienda.actualizarPuntaje();
	}



	/**
	 * getter del hilo principal.
	 * @return HiloTiempo tiempo
	 */

	public HiloTiempo getTiempo(){
		return tiempo;
	}


	public GuiTienda getGuiTienda(){
		return guiTienda;
	}


	/**
	 * Detecta clicks en el mapa.
	 *
	 * @param e
	 */

	public void mouseClicked(MouseEvent e) {

		System.out.println("Se clickeo en mapa");
		guiTienda.seClickeoEnMapa(new Point(e.getX(),e.getY()));
	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}
	public void terminar(){
		tiempo.terminate();
	}


}
