package Tienda;


import java.awt.*;

public class Grilla {


    /**
     * Grilla de celdas donde seran ubicados los aliados
     *         cada celda contiene un boolean denotando si esta ocupada o no
     *         y la posicion central de esa celda.
     *
     *
     *
     */




    protected ParCelda grilla [][];

    public Grilla(){

        grilla=new ParCelda[6][10];

        for(int i=0;i<grilla.length;i++)
            for(int j=0;j<grilla[0].length;j++){
                grilla[i][j]=new ParCelda(new Point(150+i*105,300+j*170));
            }

    }

    /**
     * devuelve la celda correspondiente a la fila y columna pasadas como parametro
     *
     * @param fila
     * @param columna
     * @return
     */

    public ParCelda obtenerCelda(int fila, int columna){
        return grilla[fila][columna];
    }

}
