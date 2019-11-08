package ColisionadoresCombate;

import Entidad.Aliados.Aliado;
import Entidad.Disparos.Disparo;
import Entidad.Enemigos.Enemigo;
import Entidad.ObjetosMapa.ObjetoMapaVida;
import Entidad.PowerUp.ObjetosPreciosos.ObjetoPreciosoVida;

/**
 * Este colisionador esta dirigido a las colisiones que puedan tener los aliados y enemigos,
 * entre ellos mismos o con distintos objetos (Ya que los aliados y enemigos pueden tener un rango y al tener en rango o dejar tener
 * en rango a una de estas entidades deben realizar alguna accion diferente a la de si colisionan cuerpo a cuerpo)
 *
 */

public interface ColisionadorCombate {

    public void verificarColisionando();
    public void detectoAliado(Aliado chocada);
    public void detectoEnemigo(Enemigo chocada);
    public void detectoDisparo(Disparo chocada);
    public void detectoObjetoMapaDestruible(ObjetoMapaVida chocada);
    public void detectoObjetoPreciosoDestruible(ObjetoPreciosoVida chocada);

}
