package Niveles;

import Entidad.Enemigo;
import FabricaEnemigo.FabricaEnemigoGolemHielo;
import FabricaEnemigo.FabricaEnemigoGolemTierra;

import java.awt.*;

public class NivelDos extends Nivel {

    public NivelDos() {
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

        System.out.println("NIVEL DOSSSSSSSSSSSSSSSSSSSSSSSSSS");

        Enemigo enemigo1= FabricaEnemigoGolemHielo.getFabricaGolemHielo().crearEnemigo();
        enemigo1.posicionar(new Point(2010,285));
        agregarEnemigo(enemigo1);

        Enemigo enemigo2= FabricaEnemigoGolemTierra.getFabricaGolemTierra().crearEnemigo();
        enemigo2.posicionar(new Point(2010,390));
        agregarEnemigo(enemigo2);


        Enemigo enemigo3= FabricaEnemigoGolemHielo.getFabricaGolemHielo().crearEnemigo();
        enemigo3.posicionar(new Point(2010,495));
        agregarEnemigo(enemigo3);

        Enemigo enemigo4= FabricaEnemigoGolemTierra.getFabricaGolemTierra().crearEnemigo();
        enemigo4.posicionar(new Point(2010,600));
        agregarEnemigo(enemigo4);


        Enemigo enemigo5= FabricaEnemigoGolemTierra.getFabricaGolemTierra().crearEnemigo();
        enemigo5.posicionar(new Point(2010,705));
        agregarEnemigo(enemigo5);

        Enemigo enemigo6= FabricaEnemigoGolemHielo.getFabricaGolemHielo().crearEnemigo();
        enemigo6.posicionar(new Point(2010,810));
        agregarEnemigo(enemigo6);


    }
}
