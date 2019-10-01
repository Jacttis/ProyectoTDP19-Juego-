package Estados;

import Entidad.*;

public abstract class Estado {

    protected HiloEstados hiloMuerte;
    protected Entidad entidad;

    public Estado (Entidad entidad) {

        hiloMuerte=new HiloEstados(entidad);
        this.entidad=entidad;


    }


    public abstract void actuar();

    public abstract void verificarEstado();











}
