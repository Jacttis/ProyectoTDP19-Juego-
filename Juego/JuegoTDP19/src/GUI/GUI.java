package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;


import Juego.Juego;
import Splash.*;


public class GUI extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private Juego juego;
	private HiloTiempo tiempo;
	

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		cargarSplash();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
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
		

		

		
		
		
		
		
		contentPane = new JPanelConFondo();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		contentPane.setLayout(null);
	
		
		
		
	
		
		setContentPane(contentPane);
		 juego=Juego.crearJuego(this);
		tiempo = new HiloTiempo(juego);
		
		tiempo.start();
		
		
		
		
	}
	
	
	
	public static void cargarSplash(){
		Splash ventana=new Splash();
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);

		for(int i=0;i<=100;i++) {
			try {
				Thread.sleep(60);
				if(i>0 && i<20) {
					ventana.textField.setText("Cargando Puntajes");
				}
				if(i>20 && i<40) {
					ventana.textField.setText("Cargando Personajes");
				}

				if(i>40 && i<100) {
					ventana.textField.setText("Cargando Tienda");
				}

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ventana.progressBar.setValue(i);
		}
		ventana.dispose();
	}
	
}
