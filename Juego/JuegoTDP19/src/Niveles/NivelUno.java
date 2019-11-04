package Niveles;

import java.awt.Point;
import java.util.Random;

import Constantes.Constantes;
import Entidad.Enemigos.Enemigo;
import Entidad.ObjetosMapa.ObjetoMapa;
import Entidad.ObjetosMapa.ObjetoPiedra;
import FabricaEnemigo.*;
import Juego.Mapa;

public class NivelUno extends Nivel {

	public NivelUno() {
		super();
		nivelSiguiente=new NivelDos();

	}


	public void llenarListaEnemigosSpawn() {

		listaEnemigosSpawn.add(FabricaEnemigoGolemHielo.getFabricaGolemHielo());
		listaEnemigosSpawn.add(FabricaEnemigoGolemTierra.getFabricaGolemTierra());
	}


	public void run(){

		try {

			ObjetoMapa piedra = new ObjetoPiedra(new Point(1000,500),200);
			Mapa.getMapa().agregarEntidad(piedra);

			Enemigo enemigo;

			Random r= new Random();
			int enemigoAleatorio = r.nextInt(listaEnemigosSpawn.size());
			int tipoEnemigo = r.nextInt(10);
			if(tipoEnemigo<15)
				enemigo=listaEnemigosSpawn.get(enemigoAleatorio).crearEnemigoBoosted();
			else enemigo=listaEnemigosSpawn.get(enemigoAleatorio).crearEnemigo();
			enemigo.posicionar(new Point(Constantes.ENEMIGOS_PX,obtenerPosicionAleatoriaEnY()));
			agregarEnemigo(enemigo);

			sleep(3000);

			enemigoAleatorio = r.nextInt(listaEnemigosSpawn.size());
			tipoEnemigo = r.nextInt(10);
			if(tipoEnemigo<4)
				enemigo=listaEnemigosSpawn.get(enemigoAleatorio).crearEnemigoBoosted();
			else enemigo=listaEnemigosSpawn.get(enemigoAleatorio).crearEnemigo();
			enemigo.posicionar(new Point(Constantes.ENEMIGOS_PX,obtenerPosicionAleatoriaEnY()));
			agregarEnemigo(enemigo);

			sleep(5000);



			enemigoAleatorio = r.nextInt(listaEnemigosSpawn.size());
			tipoEnemigo = r.nextInt(10);
			if(tipoEnemigo<2)
				enemigo=listaEnemigosSpawn.get(enemigoAleatorio).crearEnemigoBoosted();
			else enemigo=listaEnemigosSpawn.get(enemigoAleatorio).crearEnemigo();
			enemigo.posicionar(new Point(Constantes.ENEMIGOS_PX,obtenerPosicionAleatoriaEnY()));
			agregarEnemigo(enemigo);



			enemigoAleatorio = r.nextInt(listaEnemigosSpawn.size());
			tipoEnemigo = r.nextInt(10);
			if(tipoEnemigo<2)
				enemigo=listaEnemigosSpawn.get(enemigoAleatorio).crearEnemigoBoosted();
			else enemigo=listaEnemigosSpawn.get(enemigoAleatorio).crearEnemigo();
			enemigo.posicionar(new Point(Constantes.ENEMIGOS_PX,obtenerPosicionAleatoriaEnY()));
			agregarEnemigo(enemigo);

			sleep(1000);

			enemigo = FabricaEnemigoReaperMan.getFabricaReaperMan().crearEnemigoBoosted();
			enemigo.posicionar(new Point(Constantes.ENEMIGOS_PX,obtenerPosicionAleatoriaEnY()));
			agregarEnemigo(enemigo);

			while(!enemigosGenerados.isEmpty()){
				sleep(1000);
			}

			Mapa.getMapa().terminoNivel();


		} catch (InterruptedException e) {
			e.printStackTrace();
		}


	}


	public String getDireccionImagenFondoNivel(){
		String direccion="Sprites/Mapa/Mapa2Disenio.jpg";
		return direccion;
	}

}
