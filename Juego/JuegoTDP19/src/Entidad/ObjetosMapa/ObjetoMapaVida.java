package Entidad.ObjetosMapa;

import ColisionadoresCombate.ColCombateObjetoMapaDestruible;
import ColisionadoresCombate.ColisionadorCombate;
import Entidad.Entidad;

import java.awt.*;

public abstract class ObjetoMapaVida extends ObjetoMapa {

    protected int vidaActual, vidaTotal;

    /**
     * Crea un objetoMapaVida, el cual es un objetoMapa que se caracteriza por tener vida
     *
     * Inicializa el atributo colisionadorCombate como un nuevo objeto ColCombateObjetoMapaDestruible
     * con este misma ObjetoMapaVida parametrizado.
     *
     * @param pos
     * @param vida
     */

    public ObjetoMapaVida(Point pos, int vida) {
        super(pos);
        this.vidaActual=vida;
        this.vidaTotal =vida;
        colisionadorCombate = new ColCombateObjetoMapaDestruible(this);
    }

    /**
     * Redefinicon de actualizarEntidad mas general
     *
     * Envia el mensaje verificarColisionando al colisionadorCombate que tiene como atributo
     *
     */

    public void actualizarEntidad() {
        colisionadorCombate.verificarColisionando();
    }

    /**
     * Retorna true si la vidaActual es menor o igual a cero
     *
     * @return boolean
     */

    public boolean fueDestruido(){
        return vidaActual<=0;
    }

    /**
     * Implementa el metodo abstracto serAfectado de ObjetoMapa
     *
     * Disminuye el atributo vidaActual en base al damage de la
     * entidad parametrizada.
     *
     * Y en caso que se cumpla la condicion fueDestruido, se elimina.
     *
     * @param entidad
     */

    public void serAfectado(Entidad entidad) {
        this.vidaActual-=entidad.getDamage();

        if(fueDestruido())
            this.eliminarse();

    }

    /**
     * Redefine serDetectado de ObjetoMapa
     *
     * le envia el mensaje detectoObjetoMapaDestruible con este mismo
     * ObjetoMapaVida parametrizado al colisionadorCombate recibido como parametro
     *
     * @param colisionadorCombate
     */

    public void serDetectado(ColisionadorCombate colisionadorCombate){
        colisionadorCombate.detectoObjetoMapaDestruible(this);
    }

}
