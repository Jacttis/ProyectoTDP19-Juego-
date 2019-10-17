package ColisionadoresCombate;

import Entidad.Aliado;
import Entidad.Disparo;
import Entidad.Enemigo;
import Entidad.GolpeEnemigo;

public interface ColisionadorCombate {

    public void detectoAliado(Aliado chocada);
    public void detectoEnemigo(Enemigo chocada);
    public void detectoDisparo(Disparo chocada);
    public void detectoGolpeEnemigo(GolpeEnemigo chocada);


}
