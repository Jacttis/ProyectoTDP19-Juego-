package Niveles;

import java.awt.Point;
import java.util.Random;

import Constantes.Constantes;
import Entidad.Enemigos.Enemigo;
import FabricaEnemigo.*;

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


			Enemigo enemigo;

			Random r= new Random();
			int enemigoAleatorio = r.nextInt(listaEnemigosSpawn.size());
			int tipoEnemigo = r.nextInt(10);
			if(tipoEnemigo<20)
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



			enemigo = FabricaEnemigoReaperMan.getFabricaReaperMan().crearEnemigoBoosted();
			enemigo.posicionar(new Point(Constantes.ENEMIGOS_PX,obtenerPosicionAleatoriaEnY()));
			agregarEnemigo(enemigo);


		} catch (InterruptedException e) {
			e.printStackTrace();
		}


	}


}
