package Niveles;

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

    public void run(){


        Random r= new Random();
        int enemigoAleatorio = r.nextInt(listaEnemigosSpawn.size());
        int tipoEnemigo = r.nextInt(10);
        if(tipoEnemigo<2)
            agregarEnemigo(listaEnemigosSpawn.get(enemigoAleatorio).crearEnemigoBoosted());
        else agregarEnemigo(listaEnemigosSpawn.get(enemigoAleatorio).crearEnemigo());


        enemigoAleatorio = r.nextInt(listaEnemigosSpawn.size());
        tipoEnemigo = r.nextInt(10);
        if(tipoEnemigo<2)
            agregarEnemigo(listaEnemigosSpawn.get(enemigoAleatorio).crearEnemigoBoosted());
        else agregarEnemigo(listaEnemigosSpawn.get(enemigoAleatorio).crearEnemigo());

        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        enemigoAleatorio = r.nextInt(listaEnemigosSpawn.size());
        tipoEnemigo = r.nextInt(10);
        if(tipoEnemigo<2)
            agregarEnemigo(listaEnemigosSpawn.get(enemigoAleatorio).crearEnemigoBoosted());
        else agregarEnemigo(listaEnemigosSpawn.get(enemigoAleatorio).crearEnemigo());


        enemigoAleatorio = r.nextInt(listaEnemigosSpawn.size());
        tipoEnemigo = r.nextInt(10);
        if(tipoEnemigo<2)
            agregarEnemigo(listaEnemigosSpawn.get(enemigoAleatorio).crearEnemigoBoosted());
        else agregarEnemigo(listaEnemigosSpawn.get(enemigoAleatorio).crearEnemigo());
    }


}
