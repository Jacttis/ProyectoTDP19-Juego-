package Niveles;

import java.awt.Point;

import Constantes.Constantes;
import FabricaEnemigo.FabricaEnemigoGolemHielo;
import FabricaEnemigo.FabricaEnemigoGolemTierra;
import FabricaEnemigo.FabricaEnemigoReaperMan;
import Juego.Mapa;
import Entidad.*;

public class NivelUno extends Nivel {

	public NivelUno() {
		super();
		hiloNivel=new HiloNivel(this);
	}


	public void empezarNivel(){
		hiloNivel.start();
	}

	/**
	 * Genera los enemigos y utiliza agregarEntidad de mapa
	 * para insertarlos en el mismo
	 * 
	 */
	
	public void generarEnemigos() {

		Enemigo enemigo1= FabricaEnemigoReaperMan.getFabricaReaperMan().crearEnemigo();
		enemigo1.posicionar(new Point(Constantes.ENEMIGOS_PX,obtenerPosicionAleatoriaEnY()));
		agregarEnemigo(enemigo1);


		Enemigo enemigo2= FabricaEnemigoGolemTierra.getFabricaGolemTierra().crearEnemigo();
		enemigo2.posicionar(new Point(Constantes.ENEMIGOS_PX+170,obtenerPosicionAleatoriaEnY()));
		agregarEnemigo(enemigo2);

		Enemigo enemigo3= FabricaEnemigoGolemHielo.getFabricaGolemHielo().crearEnemigoBoosted();
		enemigo3.posicionar(new Point(Constantes.ENEMIGOS_PX+170,obtenerPosicionAleatoriaEnY()));
		agregarEnemigo(enemigo3);

		/*
		Enemigo enemigo3=FabricaEnemigoGolemHielo.getFabricaGolemHielo().crearEnemigo();
		enemigo3.posicionar(new Point(2140,obtenerPosicionAleatoriaEnY()));
		agregarEnemigo(enemigo3);

		Enemigo enemigo4=FabricaEnemigoGolemTierra.getFabricaGolemTierra().crearEnemigo();
		enemigo4.posicionar(new Point(2310,obtenerPosicionAleatoriaEnY()));
		agregarEnemigo(enemigo4);

		*/



	}
	


	
	
	
	
}
