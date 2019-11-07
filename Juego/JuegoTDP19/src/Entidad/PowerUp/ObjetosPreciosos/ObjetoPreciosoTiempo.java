package Entidad.PowerUp.ObjetosPreciosos;

import ColisionadoresCombate.ColisionadorObjetoPreciosoTiempo;
import Entidad.Personaje;

import java.util.LinkedList;

public abstract class ObjetoPreciosoTiempo extends ObjetoPrecioso {

    protected HiloObjetoPrecioso hilo;
    protected LinkedList<Personaje> alcanzados;

    public ObjetoPreciosoTiempo(int duracion, String descripcion) {
        super(duracion, descripcion);

        alcanzados = new LinkedList<Personaje>();

        colisionadorCombate = new ColisionadorObjetoPreciosoTiempo(this);
        hilo = new HiloObjetoPrecioso(this);
    }

    public abstract void afectar(Personaje personaje);

    public LinkedList<Personaje> getAlcanzados(){
        return alcanzados;
    }

}
