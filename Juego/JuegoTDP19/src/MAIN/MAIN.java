package MAIN;

import GUI.GUI;

import java.awt.*;
import Splash.*;
public class MAIN {

    public static void main(String[] args) {

        SplashL splashl = new SplashL();
        //splashl.cargarSplash();
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GUI frame = new GUI();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}