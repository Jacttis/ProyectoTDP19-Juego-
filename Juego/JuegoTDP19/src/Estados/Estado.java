package Estados;

import Entidad.*;
import Juego.Mapa;

public abstract class Estado {

    protected HiloEstados hiloMuerte;
    protected Personaje personaje;

    public Estado (Personaje personaje) {

        hiloMuerte=new HiloEstados(personaje);
        this.personaje=personaje;


    }

    /**
     * Metodo abstracto que determina que se hace en cada estado.
     *
     */

    public abstract void actuar();

    /**
     * Verifica el estado del personaje, si este esta muerto (tiene 0 de vida)
     * le cambia el estado al estado Muerto(para despues ser eliminado).
     *
     */

    public void verificarEstado(){

        if(personaje.estaMuerto())
            personaje.setEstado(new Muerto(personaje));

    }

    /**
     * Le cambia el estado del personaje al estado Atacando.
     *
     */

    public void cambiarAAtacando(){
        personaje.setEstado(new Atacando(personaje));
    }

    /**
     * Le cambia el estado del personaje al estado Caminando.
     *
     */

    public void cambiarACaminando(){
        personaje.setEstado(new Caminando(personaje));
    }

    /**
     * Le cambia el estado al personaje al estado Quieto.
     *
     */

    public void cambiarAQuieto(){
        personaje.setEstado(new Quieto(personaje));
    }











}
