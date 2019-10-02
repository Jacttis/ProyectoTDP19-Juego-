package Estados;

import Entidad.*;

public abstract class Estado {

    protected HiloEstados hiloMuerte;
    protected Personaje personaje;

    public Estado (Personaje personaje) {

        hiloMuerte=new HiloEstados(personaje);
        this.personaje=personaje;


    }


    public abstract void actuar();

    public void verificarEstado(){

        if(personaje.getSerEliminado())
            personaje.setEstado(new Muerto(personaje));

    }

    public void cambiarAAtacando(){
        personaje.setEstado(new Atacando(personaje));
    }

    public void cambiarACaminando(){
        personaje.setEstado(new Caminando(personaje));
    }

    public void cambiarAQuieto(){
        personaje.setEstado(new Quieto(personaje));
    }











}
