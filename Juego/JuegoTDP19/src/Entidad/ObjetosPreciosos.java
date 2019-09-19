package Entidad;

import java.awt.*;

public abstract class ObjetosPreciosos  extends Entidad{

    protected int precio;
    protected int vida;
    public ObjetosPreciosos(Point pos, int damage,int precio,int vida) {
        super(pos, 0, damage);
        this.precio=precio;
        this.vida=vida;

    }
}
