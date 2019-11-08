/**
 * Clase creada por Julian Acttis,Axel Fontana, Leandro Moran
 */
package Entidad.Aliados;

import Colisionadores.Colisionador;
import Colisionadores.ColisionadoresAliados.ColisionadorAliado;
import ColisionadoresCombate.ColCombateAliado;
import ColisionadoresCombate.ColisionadorCombate;
import Entidad.*;
import Estados.Quieto;
import Inteligencia.InteligenciaAliados;
import java.awt.*;
import Juego.Mapa;
import Tienda.*;

public abstract class Aliado extends Personaje {

     protected String descripcion;
     protected int precio;
     protected Entidad disparo;
     protected ParCelda celdaUbicado;
    

    /**
     * Crea un Personaje Aliado
     *
     * Inicializa el atributo IA como una InteligenciaAliados con el mismo Aliado parametrizado.
     * Inicializa el atributo colisionador como un ColisionadorAliado con el mismo Aliado parametrizado.
     * Inicializa el atributo colisionadorCombato como un ColCombateAliado con el mismo Aliado parametrizado.
     * Inicializa el atributo estado como un nuevo estado Quieto con el mismo Aliado parametrizado.
     *
     * @param vida
     * @param damage
     * @param velocidadAtaque
     * @param Descripcion
     */
    public Aliado(int vida, int damage,float velocidadAtaque,int rango, double velocidad, String Descripcion) {
        super(new Point(0,0), vida, damage, velocidadAtaque, rango,velocidad);
        IA=new InteligenciaAliados(this);

        descripcion=Descripcion;

        colisionador=new ColisionadorAliado(this);
        colisionadorCombate=new ColCombateAliado(this);


        estado=new Quieto(this);

    }

    /**
     * Setters y Getters de atributos
     */


    /**
     * Devuelve la descripcion del Personaje Aliado
     * @return String con personaje aliado
     */
    public String getDescripcion(){
        return descripcion;
    }

    /**
     * Retorna el valor del atributo precio del Aliado
     *
     *
     * @return int precio
     */

    public int getPrecio(){
        return precio;
    }

    public void setPrecio(int nuevoPrecio){
        precio=nuevoPrecio;
    }


    public ParCelda getCelda(){
        return celdaUbicado;
    }

    /**
     * Fin de Setters y Getters de atributos.
     */

    //----------------------------------------------------------------------------//

    /**
     * Redefinicion del eliminarse de Entidad
     *
     * Cuando se elimina desocupa la posicion en celda que ocupaba, y
     * en caso de que fue eliminado por medio de una venta (no por muerte)
     * se le envia el mensaje a la tienda VenderAliado con el mismo Aliado parametrizado.
     *
     */

    public void eliminarse(){
        celdaUbicado.desocupar();
        Mapa.getMapa().eliminarEntidad(this);

        if(!this.estaMuerto())
            Tienda.getTienda().venderAliado(this);

    }

    /**
     * Sobrecarga de Posicionar de Entidad
     *
     * Un aliado al posicionarse en el mapa recibe parametrizado una celda
     * la cual ocupara y se posicionara en la posicion que tenga esa celda como atributo.
     *
     * @param celda
     */

    public void posicionar(ParCelda celda){
        celda.ocupar();
        celdaUbicado=celda;
        pos.setLocation(celda.getPos());
    }



    /**
     * implementacion del metodo abstracto serChocado.
     *
     * Le envia al colisionador parametrizado el mensaje afectarAliado, con
     * esta instancia (Aliado) como parametro.
     * @param colisionador
     */

    public void serChocado(Colisionador colisionador){
        colisionador.afectarAliado(this);
    }

    /**
     * implementacion del metodo abstracto serDetectado.
     *
     * Le envia al colisionadorCombate parametrizado el mensaje detectoAliado, con
     * esta instancia (Aliado) como parametro.
     * @param colisionadorCombate
     */

    public void serDetectado(ColisionadorCombate colisionadorCombate){
        colisionadorCombate.detectoAliado(this);
    }


    /**
     * Redefinicion de getRangoCombate de Personaje ya que el rango de los aliados
     * sera un Rectangle que comenzara desde la posicion del Aliado hasta 'x' unidades a la derecha.
     *
     * @return
     */

    public Rectangle getRangoCombate() {
        Rectangle hitBox=this.getHitBox();
        hitBox.width=hitBox.width+rango;
        hitBox.setLocation(hitBox.x,hitBox.y);

        return hitBox;
    }


}
