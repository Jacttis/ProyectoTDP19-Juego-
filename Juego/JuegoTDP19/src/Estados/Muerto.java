package Estados;

import Entidad.*;

public class Muerto extends Estado {

    protected boolean actuo;

    public Muerto (Personaje personaje){
        super(personaje);
        actuo=false;
    }

    public void actuar() {

        personaje.cambiarGrafico(2);
        hiloMuerte.start();
        personaje.setEstado(new EstadoNulo(personaje));
        personaje.eliminarse();



    }

    public void verificarEstado(){

    }

    public void cambiarAAtacando(){
    }

    public void cambiarACaminando(){
    }

    public void cambiarAQuieto(){
    }
}
