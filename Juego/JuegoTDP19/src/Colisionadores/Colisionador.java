package Colisionadores;

import Entidad.*;

public abstract class Colisionador {
    protected Entidad entidad;

    public Colisionador(Entidad entidad){
        this.entidad=entidad;
    }

    public abstract void meChocaron(Colisionador colisionador);
    public abstract void chocasteConAliado(Entidad chocada);
    public abstract void chocasteConEnemigo(Entidad chocada);
    public abstract void chocasteConDisparo(Entidad chocada);
    public abstract void chocasteConGolpeEnemigo(Entidad chocada);



}
