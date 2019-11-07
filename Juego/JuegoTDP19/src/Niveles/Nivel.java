package Niveles;

import Constantes.Constantes;
import Entidad.Enemigos.Enemigo;
import FabricaEnemigo.*;
import FabricaObjetoMapaEvento.FabricaMapaEvento;
import GUI.GUI;
import Juego.Juego;
import Juego.Mapa;
import Niveles.Oleada.Oleada;
import Niveles.Oleada.PrimerOleada;


import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.Random;

public abstract class Nivel {

	protected Nivel nivelSiguiente;
	protected LinkedList<FabricaEnemigo> listaEnemigosSpawn;
	protected LinkedList<FabricaMapaEvento> listaEventos;
	protected Oleada oleada;
	protected JLabel cartelNivel1,cartelNivel2;
	protected Point rangoCantidadEnemigos;

	
	public Nivel() {

		listaEnemigosSpawn=new LinkedList<FabricaEnemigo>();
		listaEventos = new LinkedList<FabricaMapaEvento>();
		this.llenarListaEventos();
		this.llenarListaEnemigosSpawn();
		oleada = new PrimerOleada(this);
		cartelNivel1 = new JLabel();
		cartelNivel2 = new JLabel();

	}

	public abstract void comenzarNivel();
	public abstract void llenarListaEnemigosSpawn();
	public abstract void llenarListaEventos();

	public Point getRangoCantidadEnemigos(){
		return rangoCantidadEnemigos;
	}

	public LinkedList<FabricaEnemigo> getListaEnemigosSpawn(){
		return listaEnemigosSpawn;
	}

	public LinkedList<FabricaMapaEvento> getListaEventos(){
		return listaEventos;
	}

	public Nivel getNivelSiguiente(){
		return nivelSiguiente;
	}

	public void setOleada(Oleada oleada){
		this.oleada=oleada;
	}


	public void cambiarNivel(){
		Mapa.getMapa().cambiarNivel(this);
	}

	public abstract String getDireccionImagenFondoNivel();

	public void inicializarCartelNivel(){
		cartelNivel1.setForeground(Color.BLACK);
		cartelNivel1.setFont(new Font("Times New Roman", 4,100));
		cartelNivel1.setBounds(650,80,3000,400);


		cartelNivel2.setForeground(Color.WHITE);
		cartelNivel2.setFont(new Font("Times New Roman", 4,100));
		cartelNivel2.setBounds(654,84,3000,400);

		Mapa.getMapa().getGui().add(cartelNivel2);
		Mapa.getMapa().getGui().add(cartelNivel1);

		Mapa.getMapa().getGui().repaint();
	}

	public void retirarCartelNivel(){
		Mapa.getMapa().getGui().remove(cartelNivel1);
		Mapa.getMapa().getGui().remove(cartelNivel2);

		Mapa.getMapa().getGui().repaint();
	}




}