package Entidad;

import java.awt.*;

public abstract class ObjetosPreciosos  extends Premio{

    protected int precio;
    public ObjetosPreciosos(Point pos, int damage,int precio,float duracion) {
        super(pos, damage,duracion);
        this.precio=precio;
    }







}
