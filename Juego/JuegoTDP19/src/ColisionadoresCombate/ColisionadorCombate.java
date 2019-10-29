package ColisionadoresCombate;

import Entidad.Aliados.Aliado;
import Entidad.Disparos.Disparo;
import Entidad.Enemigos.Enemigo;
import Entidad.Disparos.GolpeEnemigo;

public interface ColisionadorCombate {

    public void verificarColisionando();
    public void detectoAliado(Aliado chocada);
    public void detectoEnemigo(Enemigo chocada);
    public void detectoDisparo(Disparo chocada);
    public void detectoGolpeEnemigo(GolpeEnemigo chocada);


}
