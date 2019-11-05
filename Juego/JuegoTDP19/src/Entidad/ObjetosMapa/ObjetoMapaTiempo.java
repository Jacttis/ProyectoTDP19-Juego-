package Entidad.ObjetosMapa;

import ColisionadoresCombate.ColCombateObjetoMapaNoDestruible;

import java.awt.*;

public abstract class ObjetoMapaTiempo extends ObjetoMapa {

    protected int duracion;
    protected HiloDuracionObjetoMapa hilo;

    public ObjetoMapaTiempo(Point pos , int duracion) {
        super(pos);
        this.duracion=duracion;

        colisionadorCombate = new ColCombateObjetoMapaNoDestruible(this);

        hilo = new HiloDuracionObjetoMapa(this);
    }

    public int getDuracion(){
        return duracion;
    }


    public void actualizarEntidad() {
        colisionadorCombate.verificarColisionando();
    }
}
