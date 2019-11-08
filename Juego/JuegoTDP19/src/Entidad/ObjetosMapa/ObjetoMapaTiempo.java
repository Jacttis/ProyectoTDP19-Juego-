package Entidad.ObjetosMapa;

import ColisionadoresCombate.ColCombateObjetoMapaNoDestruible;
import Entidad.Enemigos.Enemigo;

import java.awt.*;
import java.util.LinkedList;

public abstract class ObjetoMapaTiempo extends ObjetoMapa {

    protected int duracion;
    protected HiloDuracionObjetoMapa hilo;
    protected LinkedList<Enemigo> enemigosAfectados;

    public ObjetoMapaTiempo(Point pos , int duracion) {
        super(pos);
        this.duracion=duracion;

        enemigosAfectados = new LinkedList<Enemigo>();

        colisionadorCombate = new ColCombateObjetoMapaNoDestruible(this);

        hilo = new HiloDuracionObjetoMapa(this);
    }

    public void eliminarse(){
        for( Enemigo e : enemigosAfectados )
            this.desafectarPersonaje(e);
        super.eliminarse();
    }

    public int getDuracion(){
        return duracion;
    }

    public void yaNoAfecta(Enemigo enemigo){
        enemigosAfectados.remove(enemigo);
        this.desafectarPersonaje(enemigo);
    }

    public LinkedList<Enemigo> getEnemigosAfectados(){
        return enemigosAfectados;
    }


    public void actualizarEntidad() {
        colisionadorCombate.verificarColisionando();
    }
}
