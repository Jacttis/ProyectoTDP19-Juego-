package ColisionadoresCombate;

import Entidad.Aliados.Aliado;
import Entidad.Disparos.Disparo;
import Entidad.Enemigos.Enemigo;
import Entidad.Disparos.GolpeEnemigo;

public class ColCombateAliado implements ColisionadorCombate {

    protected Aliado aliado;
    protected Enemigo enemigoDetectado;

    public ColCombateAliado(Aliado aliado){
        this.aliado=aliado;
    }

    public void verificarColisionando(){
        if(enemigoDetectado!=null){
            if(enemigoDetectado.estaMuerto())
                aliado.getEstado().cambiarACaminando();
        }
    }

    public void detectoAliado(Aliado chocada) {

    }


    public void detectoEnemigo(Enemigo chocada) {
        aliado.getEstado().cambiarAAtacando();

        if(enemigoDetectado!=null) {
            if (!enemigoDetectado.equals(chocada))
                enemigoDetectado = chocada;
        }
        else enemigoDetectado=chocada;

    }


    public void detectoDisparo(Disparo chocada) {

    }


    public void detectoGolpeEnemigo(GolpeEnemigo chocada) {

    }
}
