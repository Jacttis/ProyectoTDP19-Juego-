package Entidad.PowerUp;

import Entidad.Entidad;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseOyentePowerUp implements MouseListener{



        private PowerUp power;

        public MouseOyentePowerUp(PowerUp power){
            this.power=power;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            PowerUp powerClon= (PowerUp) power.clone();
            ControladorPowerAliado.getControladorPowerAliado().setNextPower(powerClon);
            power.eliminarse();
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


