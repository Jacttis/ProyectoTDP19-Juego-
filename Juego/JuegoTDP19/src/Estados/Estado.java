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


        if(personaje.estaMuerto())
            personaje.setEstado(new Muerto(personaje));
    }











}
