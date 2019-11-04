package ColisionadoresCombate;

import Entidad.Aliados.Aliado;
import Entidad.Disparos.Disparo;
import Entidad.Enemigos.Enemigo;
import Entidad.Disparos.GolpeEnemigo;
import Entidad.ObjetosMapa.ObjetoMapa;
import Entidad.ObjetosMapa.ObjetoMapaVida;

import java.util.LinkedList;

public class ColCombateEnemigo implements ColisionadorCombate {

    protected Enemigo enemigo;
    protected LinkedList<Aliado> aliadosDetectados;
    protected Aliado aliadoDetectado;

    public ColCombateEnemigo(Enemigo enemigo){
        this.enemigo=enemigo;
        aliadosDetectados=new LinkedList<Aliado>();
    }

    public void verificarColisionando(){

        /*
        for( Aliado a : aliadosDetectados){
            if(a.estaMuerto())
                aliadosDetectados.remove(a);
        }

        if(aliadosDetectados.isEmpty())
            enemigo.getEstado().cambiarACaminando();

          */
         if(aliadoDetectado!=null){
            if(aliadoDetectado.estaMuerto())
                 enemigo.getEstado().cambiarACaminando();
            }
    }

    public void detectoAliado(Aliado chocada) {
        enemigo.getEstado().cambiarAAtacando();

        if(aliadoDetectado!=null) {
            if (!aliadoDetectado.equals(chocada))
                aliadoDetectado = chocada;
        }
        else aliadoDetectado=chocada;
    }


    public void detectoEnemigo(Enemigo chocada) {

    }

    public void detectoDisparo(Disparo chocada) {

    }

    public void detectoGolpeEnemigo(GolpeEnemigo chocada) {

    }

    @Override
    public void detectoObjetoMapaDestruible(ObjetoMapaVida chocada) {
        chocada.getColisionadorCombate().detectoEnemigo(enemigo);
    }
}
