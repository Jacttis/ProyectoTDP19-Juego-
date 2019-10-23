package Niveles;

import Constantes.Constantes;
import Entidad.Enemigo;
import FabricaDisparos.FabricaDisparoReaperMan;
import FabricaEnemigo.FabricaEnemigoFallenAngel;
import FabricaEnemigo.FabricaEnemigoGolemFuego;
import FabricaEnemigo.FabricaEnemigoGolemHielo;
import FabricaEnemigo.FabricaEnemigoGolemTierra;

import java.awt.*;
import java.util.Random;

public class NivelDos extends Nivel {

    public NivelDos() {
        super();
        nivelSiguiente=null;
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
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


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
    }

}
