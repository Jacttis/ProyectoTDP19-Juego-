package Tienda;

import java.awt.*;

public class ParCelda {

    protected Point pos;
    protected boolean ocupada;

    public ParCelda(Point pos){

        this.pos=pos;
        ocupada=false;

    }

    public boolean estaOcupada(){
        return ocupada;
    }

    public void ocupar(){
        ocupada=true;
    }

    public void desocupar(){
        ocupada=false;
    }

    public Point getPos(){
        return pos;
    }


}
