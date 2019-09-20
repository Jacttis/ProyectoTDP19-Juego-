package Estados;

import Entidad.*;

public abstract class Estado {

    protected Entidad entidad;

    public Estado (Entidad entidad) {

        this.entidad=entidad;


    }


    public abstract void actuar();











}
