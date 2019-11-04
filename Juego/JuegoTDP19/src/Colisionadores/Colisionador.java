package Colisionadores;

import Entidad.Aliados.Aliado;
import Entidad.Disparos.Disparo;
import Entidad.Disparos.GolpeEnemigo;
import Entidad.Enemigos.Enemigo;
import Entidad.ObjetosMapa.ObjetoMapa;

public interface Colisionador {

    public void afectarAliado(Aliado chocada);
    public void afectarEnemigo(Enemigo chocada);
    public void afectarDisparo(Disparo chocada);
    public void afectarGolpeEnemigo(GolpeEnemigo chocada);
    public void afectarObjetoMapa(ObjetoMapa chocada);

}
