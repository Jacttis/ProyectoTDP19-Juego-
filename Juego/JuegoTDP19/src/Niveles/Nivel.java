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

	/**
	 * Crea un Nivel
	 *
	 * Inicializa la listaEnemigosSpawn y listaEventos y las llena mediante
	 * los metodos llenarListaEventos y llenarListaEnemigosSpawn
	 *
	 * Inicializa el atributo oleada como una nueva Oleada PrimerOleada parametrizando
	 * este mismo Nivel
	 *
	 * Inicializa los JLabel cartelNivel1 y cartelNivel2
	 *
	 */
	
	public Nivel() {

		listaEnemigosSpawn=new LinkedList<FabricaEnemigo>();
		listaEventos = new LinkedList<FabricaMapaEvento>();
		this.llenarListaEventos();
		this.llenarListaEnemigosSpawn();
		oleada = new PrimerOleada(this);
		cartelNivel1 = new JLabel();
		cartelNivel2 = new JLabel();

	}

	/**
	 * Metodos abstractos que seran implementados dependiendo del tipo de
	 * Nivel que se trate
	 *
	 */

	/**
	 * Comienza el nivel iniciando la oleada
	 */

	public abstract void comenzarNivel();

	/**
	 *	Llena la listaEnemigosSpawn con los enemigos a spawnear en el determinado nivel.
	 */
	public abstract void llenarListaEnemigosSpawn();

	/**
	 * Llena la listaEventos con los eventos que podrian aparecer en el determinado nivel.
	 *
	 */
	public abstract void llenarListaEventos();

	/**
	 * Devuelve el atributo rangoCantidadEnemigos que es un Point
	 * que determina el minimo y maximo de enemigos a spawnear.
	 *
	 * @return
	 */

	public Point getRangoCantidadEnemigos(){
		return rangoCantidadEnemigos;
	}

	/**
	 * Getter de listaEnemigosSpawn
	 * @return LinkedList
	 */

	public LinkedList<FabricaEnemigo> getListaEnemigosSpawn(){
		return listaEnemigosSpawn;
	}

	/**
	 * Getter de listaEventos
	 *
	 * @return LinkedList
	 */

	public LinkedList<FabricaMapaEvento> getListaEventos(){
		return listaEventos;
	}

	/**
	 * Getter del atributo nivelSiguiente
	 *
	 * @return
	 */

	public Nivel getNivelSiguiente(){
		return nivelSiguiente;
	}

	/**
	 * Setter del atributo oleada
	 *
	 * @param oleada
	 */

	public void setOleada(Oleada oleada){
		this.oleada=oleada;
	}


	/**
	 * Envia el mensaje cambiarNivel al Mapa
	 * con este mismo Nivel parametrizado
	 *
	 */

	public void cambiarNivel(){
		Mapa.getMapa().cambiarNivel(this);
	}

	public abstract String getDireccionImagenFondoNivel();

	/**
	 * Inicializa el cartel de comienzo de nivel
	 *
	 */

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

	/**
	 * Retira el cartel de comienzo de nivel
	 *
	 */

	public void retirarCartelNivel(){
		Mapa.getMapa().getGui().remove(cartelNivel1);
		Mapa.getMapa().getGui().remove(cartelNivel2);

		Mapa.getMapa().getGui().repaint();
	}




}