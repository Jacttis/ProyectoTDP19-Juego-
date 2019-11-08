package MAIN;

import java.awt.*;
import Menu.Menu;
public class MAIN {

    public static void main(String[] args) {


        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                  Menu menu=Menu.getMenu();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}