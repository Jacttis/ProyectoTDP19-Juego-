package Entidad;

import java.awt.*;

public class Premio extends Entidad {

    protected float duracion; //vida o tiempo
    public Premio(Point pos, int damage,float duracion) {
        super(pos, 0, damage);
    }
}
