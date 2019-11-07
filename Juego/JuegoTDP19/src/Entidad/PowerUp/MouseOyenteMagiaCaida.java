package Entidad.PowerUp;

import Entidad.PowerUp.MagiasTemporales.MagiaTemporal;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseOyenteMagiaCaida implements MouseListener {



    private MagiaTemporal magia;

    public MouseOyenteMagiaCaida(MagiaTemporal magia){
        this.magia=magia;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        MagiaTemporal magiaClon= (MagiaTemporal) magia.clone();
        ControladorPowerAliado.getControladorPowerAliado().setNextPower(magiaClon);
        magia.eliminarse();
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

