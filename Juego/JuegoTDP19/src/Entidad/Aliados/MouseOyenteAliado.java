package Entidad.Aliados;

import Entidad.PowerUp.ControladorPowerAliado;
import Entidad.PowerUp.PowerUp;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseOyenteAliado implements MouseListener {
    private Aliado aliado;

    public MouseOyenteAliado(Aliado aliado){
        this.aliado=aliado;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        ControladorPowerAliado.getControladorPowerAliado().aplicarPowerToAliado(aliado);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
