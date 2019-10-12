package Estados;

import Entidad.*;

public class EstadoNulo extends Estado {

    public EstadoNulo(Personaje personaje){
        super(personaje);
    }

    public void actuar() {
    }

    public void verificarEstado(){
        if(personaje.getSerEliminado())
            personaje.setEstado(new Muerto(personaje));
    }


}
