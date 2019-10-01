package Estados;

import Entidad.Entidad;
import Entidad.Personaje;

public class Atacando extends Estado {

    public Atacando(Entidad entidad){
        super(entidad);
    }


    public void actuar() {

        entidad.getInteligencia().actualizarEntidad();

        entidad.cambiarGrafico(1);

        entidad.atacar();

        verificarEstado();
    }

    public void verificarEstado(){

        if(entidad.getSerEliminado())
            entidad.setEstado(new Muerto(entidad));

    }



}
