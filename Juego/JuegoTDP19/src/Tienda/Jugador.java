package Tienda;

public class Jugador {

    private static Jugador instance=null;
    private int oro;
    private int puntos;
    private Tienda miTienda;

    private Jugador(Tienda miTienda){
        oro=10;
        puntos=0;
        this.miTienda=miTienda;
    }

    private static Jugador CrearJugador(Tienda tienda){
        if(instance==null){
            instance=new Jugador(tienda);
        }
        return instance;
    }

    //setters
    public void setPuntos(int puntos){
        this.puntos=puntos;
    }
    public void setOro(int oro){
        this.oro=oro;
    }

    //getters
    public int getOro(){
        return oro;
    }
    public int getPuntos(){
        return puntos;
    }
}
