package Colisionadores;

import Entidad.Entidad;
import Estados.Atacando;

public class ColisionadorEnemigo extends Colisionador {

    public ColisionadorEnemigo(Entidad entidad){
        super(entidad);
    }

    public void meChocaron(Colisionador colisionador){
        colisionador.chocasteConEnemigo(entidad);
    }

    @Override
    public void chocasteConAliado(Entidad chocada) {
        entidad.setEstado(new Atacando(entidad));
    }

    @Override
    public void chocasteConGolpeEnemigo(Entidad chocada) {

    }

    @Override
    public void chocasteConDisparo(Entidad chocada) {

    }

    @Override
    public void chocasteConEnemigo(Entidad chocada) {

    }
}
