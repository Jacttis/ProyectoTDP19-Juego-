package Niveles;

import Constantes.Constantes;
import Entidad.Enemigos.Enemigo;
import FabricaEnemigo.FabricaEnemigoFallenAngel;
import FabricaEnemigo.FabricaEnemigoGolemFuego;
import FabricaEnemigo.FabricaEnemigoGolemTierra;
import Juego.Mapa;

import java.awt.*;
import java.util.Random;

public class NivelTres extends Nivel {

    public NivelTres() {
        super();
        nivelSiguiente=new NivelNulo();
    }

    public void llenarListaEnemigosSpawn() {

        listaEnemigosSpawn.add(FabricaEnemigoFallenAngel.getFabricaFallenAngel());
        listaEnemigosSpawn.add(FabricaEnemigoGolemTierra.getFabricaGolemTierra());
        listaEnemigosSpawn.add(FabricaEnemigoGolemFuego.getFabricaGolemFuego());

    }

    public void run() {


        Enemigo enemigo;

        Random r = new Random();
        int enemigoAleatorio = r.nextInt(listaEnemigosSpawn.size());
        int tipoEnemigo = r.nextInt(10);
        if (tipoEnemigo < 4)
            enemigo = listaEnemigosSpawn.get(enemigoAleatorio).crearEnemigoBoosted();
        else enemigo = listaEnemigosSpawn.get(enemigoAleatorio).crearEnemigo();
        enemigo.posicionar(new Point(Constantes.ENEMIGOS_PX, obtenerPosicionAleatoriaEnY()));
        agregarEnemigo(enemigo);

        enemigoAleatorio = r.nextInt(listaEnemigosSpawn.size());
        tipoEnemigo = r.nextInt(10);
        if (tipoEnemigo < 4)
            enemigo = listaEnemigosSpawn.get(enemigoAleatorio).crearEnemigoBoosted();
        else enemigo = listaEnemigosSpawn.get(enemigoAleatorio).crearEnemigo();
        enemigo.posicionar(new Point(Constantes.ENEMIGOS_PX, obtenerPosicionAleatoriaEnY()));
        agregarEnemigo(enemigo);

        try {
            sleep(5000);



        enemigoAleatorio = r.nextInt(listaEnemigosSpawn.size());
        tipoEnemigo = r.nextInt(10);
        if (tipoEnemigo < 3)
            enemigo = listaEnemigosSpawn.get(enemigoAleatorio).crearEnemigoBoosted();
        else enemigo = listaEnemigosSpawn.get(enemigoAleatorio).crearEnemigo();
        enemigo.posicionar(new Point(Constantes.ENEMIGOS_PX, obtenerPosicionAleatoriaEnY()));
        agregarEnemigo(enemigo);

        enemigoAleatorio = r.nextInt(listaEnemigosSpawn.size());
        tipoEnemigo = r.nextInt(10);
        if (tipoEnemigo < 3)
            enemigo = listaEnemigosSpawn.get(enemigoAleatorio).crearEnemigoBoosted();
        else enemigo = listaEnemigosSpawn.get(enemigoAleatorio).crearEnemigo();
        enemigo.posicionar(new Point(Constantes.ENEMIGOS_PX, obtenerPosicionAleatoriaEnY()));
        agregarEnemigo(enemigo);

        while(!enemigosGenerados.isEmpty()){
            sleep(1000);
        }


        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Mapa.getMapa().terminoNivel();
    }


    public String getDireccionImagenFondoNivel(){
        String direccion="Sprites/Mapa/Mapa2DisenioNIVEL3.jpg";
        return direccion;
    }
}
