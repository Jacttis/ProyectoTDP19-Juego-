package Juego;

import Entidad.Entidad;
import Entidad.Personaje;

public class ComunicadorEntidadMapa {


    private static ComunicadorEntidadMapa instance=null;
    private Mapa mapa;

    public ComunicadorEntidadMapa(Mapa mapa){
        this.mapa=mapa;
    }

    public  static ComunicadorEntidadMapa getComunicadorEntidadMapa(Mapa mapa){
        if(instance==null){
            instance=new ComunicadorEntidadMapa(mapa);
        }
        return instance;
    }

    public void eliminarEntidad(Entidad entidad){
        mapa.eliminarEntidad(entidad);
    }
}
