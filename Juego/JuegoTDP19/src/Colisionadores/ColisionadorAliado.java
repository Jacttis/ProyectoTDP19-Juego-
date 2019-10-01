package Colisionadores;

import Entidad.*;

public class ColisionadorAliado extends Colisionador {

    public ColisionadorAliado(Aliado entidad){
        super(entidad);
    }


    public void meChocaron(Colisionador colisionador){
        colisionador.chocasteConAliado(entidad);
    }

    @Override
    public void chocasteConAliado(Entidad chocada) {

    }

    @Override
    public void chocasteConGolpeEnemigo(Entidad chocada) {
        entidad.afectar(chocada.getDamage());
    }

    @Override
    public void chocasteConDisparo(Entidad chocada) {

    }

    @Override
    public void chocasteConEnemigo(Entidad chocada) {

    }
}
