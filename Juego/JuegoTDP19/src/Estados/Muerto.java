package Estados;

import Entidad.*;

public class Muerto extends Estado {

    protected boolean actuo;

    public Muerto (Personaje personaje){
        super(personaje);
        actuo=false;
    }

    public void actuar() {

        personaje.getComponentesGraficas().cambiarGrafico(2);

        personaje.setEstado(new EstadoNulo(personaje));

        hiloMuerte.start();



    }

    /**
     * Redefiniciones de metodos generales para que cuando se este en este
     * estado no produzcan ninguna funcion.
     *
     */

    public void verificarEstado(){

    }

    public void cambiarAAtacando(){
    }

    public void cambiarACaminando(){
    }

    public void cambiarAQuieto(){
    }
}
