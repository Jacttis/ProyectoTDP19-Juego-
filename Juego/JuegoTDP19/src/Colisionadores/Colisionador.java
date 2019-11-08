package Colisionadores;

import Entidad.Aliados.Aliado;
import Entidad.Disparos.Disparo;
import Entidad.Disparos.GolpeEnemigo;
import Entidad.Enemigos.Enemigo;
import Entidad.ObjetosMapa.ObjetoMapa;
import Entidad.PowerUp.ObjetosPreciosos.ObjetoPreciosoVida;

/**
 * Este colisionador esta destinado para las colisiones simples (hitbox con hitbox) de entidad con entidad sin tener en cuenta el rango (por ejemplo disparo con enemigo)
 *
 */

public interface Colisionador {

    public void afectarAliado(Aliado chocada);
    public void afectarEnemigo(Enemigo chocada);
    public void afectarDisparo(Disparo chocada);
    public void afectarGolpeEnemigo(GolpeEnemigo chocada);
    public void afectarObjetoMapaDestruible(ObjetoMapa chocada);
    public void afectarObjetoPreciosoDestruible(ObjetoPreciosoVida chocada);

}
