package ColisionadoresCombate;

import Entidad.Aliados.Aliado;
import Entidad.Disparos.Disparo;
import Entidad.Disparos.GolpeEnemigo;
import Entidad.Enemigos.Enemigo;
import Entidad.ObjetosMapa.ObjetoMapaTiempo;
import Entidad.ObjetosMapa.ObjetoMapaVida;
import Entidad.Personaje;

import java.util.LinkedList;

public class ColCombateObjetoMapaNoDestruible implements ColisionadorCombate {

    protected LinkedList<Enemigo> enemigosAfectados;
    protected ObjetoMapaTiempo objetoMapaTiempo;

    public ColCombateObjetoMapaNoDestruible(ObjetoMapaTiempo objetoMapaTiempo){
        enemigosAfectados = new LinkedList<Enemigo>();
        this.objetoMapaTiempo=objetoMapaTiempo;
    }

    public void verificarColisionando() {

        LinkedList<Enemigo> enemigosARemover = new LinkedList<Enemigo>();

        for( Enemigo e : enemigosAfectados ){
            if(!e.getHitBox().intersects(objetoMapaTiempo.getHitBox())) {
                enemigosARemover.add(e);
                objetoMapaTiempo.desafectar(e);
            }
        }

        for( Enemigo e : enemigosARemover )
            enemigosAfectados.remove(e);



    }

    public void desafectarTodos(){
        for( Enemigo e : enemigosAfectados )
            objetoMapaTiempo.desafectar(e);
    }

    @Override
    public void detectoAliado(Aliado chocada) {

    }

    @Override
    public void detectoEnemigo(Enemigo chocada) {
        boolean esta=false;

        for(Enemigo e : enemigosAfectados)
            if(e.equals(chocada)){
                esta=true;
                break;
            }
         if(!esta) {
             enemigosAfectados.add(chocada);
             objetoMapaTiempo.afectar(chocada);
         }
    }

    @Override
    public void detectoDisparo(Disparo chocada) {

    }

    @Override
    public void detectoGolpeEnemigo(GolpeEnemigo chocada) {

    }

    @Override
    public void detectoObjetoMapaDestruible(ObjetoMapaVida chocada) {

    }
}
