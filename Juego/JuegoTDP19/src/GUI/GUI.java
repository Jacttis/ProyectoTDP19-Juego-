package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;


import Entidad.*;
import Juego.Juego;
import Splash.*;


public class GUI extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private Juego juego;
	private HiloTiempo tiempo;
	private JButton botonEliminar;
	private BotonAgregar agregar;
	private JLabel puntaje;
	

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
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1980, 1040);
		setMaximumSize(new Dimension(1980, 1040));
		setResizable(false);

		
		contentPane = new JPanelConFondo();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);

		puntaje=new JLabel();
		puntaje.setBounds(1400,33,128,25);
		puntaje.setText("0");
		botonParaEliminar();

		contentPane.add(puntaje);
		contentPane.add(botonEliminar);
		setContentPane(contentPane);
		 juego=Juego.crearJuego(this);
		tiempo = new HiloTiempo(juego);
		botonParaAgregar();
		contentPane.add(agregar);
		tiempo.start();
		
		
		
		
	}

	public void botonParaEliminar(){
		botonEliminar=new JButton();
		botonEliminar.setBounds(1200, 33, 128, 25);
		botonEliminar.setText("Eliminar CHOBI");
		botonEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LinkedList<Entidad> lista=juego.getListaMapa();
				Entidad personaje=lista.getFirst();
				personaje.destruir();
				int totalPuntaje=Integer.parseInt(puntaje.getText())+personaje.getPuntos();
				puntaje.setText(""+totalPuntaje);
			}
		});
	}

	public void botonParaAgregar(){
		agregar=new BotonAgregar();
		agregar.setBounds(1000, 33, 128, 25);
		agregar.setText("Agregar CHOBI");
		agregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				agregar.agregarCHOBI();
			}
		});
	}

}
