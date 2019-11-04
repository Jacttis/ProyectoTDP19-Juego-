package ColisionadoresCombate;

import Entidad.Aliados.Aliado;
import Entidad.Disparos.Disparo;
import Entidad.Enemigos.Enemigo;
import Entidad.Disparos.GolpeEnemigo;
import Entidad.ObjetosMapa.ObjetoMapa;
import Entidad.ObjetosMapa.ObjetoMapaVida;

public interface ColisionadorCombate {

    public void verificarColisionando();
    public void detectoAliado(Aliado chocada);
    public void detectoEnemigo(Enemigo chocada);
    public void detectoDisparo(Disparo chocada);
    public void detectoGolpeEnemigo(GolpeEnemigo chocada);
    public void detectoObjetoMapaDestruible(ObjetoMapaVida chocada);
}
