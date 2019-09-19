package Splash;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String a[]) {

        Splash ventana=new Splash();

        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);

        for(int i=0;i<=100;i++) {
            try {
                Thread.sleep(60);
                if(i>0 && i<20) {
                    ventana.textField.setText("Cargando Puntajes");
                }
                if(i>20 && i<40) {
                    ventana.textField.setText("Cargando Personajes");
                }

                if(i>40 && i<100) {
                    ventana.textField.setText("Cargando Tienda");
                }

            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            ventana.progressBar.setValue(i);
        }
        ventana.dispose();
        JOptionPane.showMessageDialog(null, " El que lee es puto, comiste");
    }

}
