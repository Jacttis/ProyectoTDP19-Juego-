package Entidad;

import java.awt.*;

import javax.swing.*;

import FabricaDisparos.FabricaDisparo;
import Inteligencia.Inteligencia;
import Juego.Mapa;

public class EnemigoGolemHielo extends Enemigo {

	public EnemigoGolemHielo(int vida, int damage, float velocidadAtaque, int velocidad, int puntos) {

		super(vida, damage, velocidadAtaque, velocidad, puntos);
		imagen[0] = new ImageIcon("Sprites/Golems/GolemHieloGIF/CaminandoTRUE.gif");
		imagen[1] = new ImageIcon("Sprites/Golems/GolemHieloGIF/AtacandoTRUE.gif");
		imagen[2] = new ImageIcon("Sprites/Golems/GolemHieloGIF/ASDF.gif");

	}


	public JLabel getEtiquetaVida(){
		if(this.etiquetaVida==null){
			this.etiquetaVida=new JLabel();
			this.etiquetaVida.setBounds(pos.x,pos.y+this.height,80,5);
			this.etiquetaVida.setOpaque(true);
			this.etiquetaVida.setBackground(Color.GREEN);
		}

		return etiquetaVida;
	}

	public void actualizarEtiquetaVida(int n){

		if(etiquetaVida!=null) {
			etiquetaVida.setBounds(pos.x+(this.width-90), pos.y+(this.height-10) , (etiquetaVida.getWidth()-((n*80)/100)), etiquetaVida.getHeight());

			if (vida < 70) {
				if (vida < 40)
					etiquetaVida.setBackground(Color.RED);
				else etiquetaVida.setBackground(Color.YELLOW);
			}
		}
	}


	@Override
	protected int getOro() {
	
		return 0;
	}


	public Entidad clone(){
		return new EnemigoGolemHielo(vida,damage,velocidadAtaque,velocidad,puntos);
	}

	public void atacar(){

		if(puedeAtacar)
			FabricaDisparo.getFabricaDisparos().generarGolpeGolemHielo(this);
	}

	public Rectangle getHitBox(){
		return new Rectangle(pos.x+40,pos.y,width-30,height-70);
	}
}
