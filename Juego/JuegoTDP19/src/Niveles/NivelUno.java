package Niveles;

import java.awt.Point;
import java.util.Random;

import Constantes.Constantes;
import Entidad.Enemigos.Enemigo;
import Entidad.ObjetosMapa.ObjetoLago;
import Entidad.ObjetosMapa.ObjetoMapa;
import Entidad.ObjetosMapa.ObjetoMapaTiempo;
import Entidad.ObjetosMapa.ObjetoPiedra;
import FabricaEnemigo.*;
import FabricaObjetoMapaEvento.FabricaEventoPiedra;
import Juego.Mapa;
import Niveles.Oleada.PrimerOleada;

public class NivelUno extends Nivel {

	public NivelUno() {
		super();
		nivelSiguiente=new NivelDos();
		oleada = new PrimerOleada(this);

		cartelNivel1.setText("NIVEL UNO");
		cartelNivel2.setText("NIVEL UNO");

		rangoCantidadEnemigos = new Point(5,8);
	}


	public void llenarListaEnemigosSpawn() {

		listaEnemigosSpawn.add(FabricaEnemigoGolemHielo.getFabricaGolemHielo());
		listaEnemigosSpawn.add(FabricaEnemigoGolemTierra.getFabricaGolemTierra());
	}

	public void llenarListaEventos(){
		listaEventos.add(FabricaEventoPiedra.getFabricaEventoPiedra());
	}

	public void comenzarNivel(){
		oleada.start();
	}


	public String getDireccionImagenFondoNivel(){
		String direccion="src/Sprites/Mapa/Mapa2Disenio.jpg";
		return direccion;
	}

}
