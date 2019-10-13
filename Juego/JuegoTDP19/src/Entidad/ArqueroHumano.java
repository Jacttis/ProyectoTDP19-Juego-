package Entidad;

import java.awt.*;

import javax.swing.*;

import Estados.Atacando;
import FabricaDisparos.FabricaDisparo;
import Tienda.ParCelda;


public class ArqueroHumano extends Aliado {

	public ArqueroHumano( int vida, int damage, float velocidadAtaque, String Descripcion, FabricaDisparo fabricaDisparos) {
		super(vida, damage, velocidadAtaque, Descripcion, fabricaDisparos);
		
		width=100;
		height=120;

		imagen[0] = new ImageIcon("Sprites/ArqueroHumano/Archer1GIF/aaaH.gif");
		imagen[1] = new ImageIcon("Sprites/ArqueroHumano/Archer1GIF/aaaH.gif");
		imagen[2] = new ImageIcon("Sprites/ArqueroHumano/Archer1GIF/aaaH.gif");



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
			etiquetaVida.setBounds(pos.x+10, pos.y+this.height , (etiquetaVida.getWidth()-((n*80)/100)), etiquetaVida.getHeight());

			if (vida < 70) {
				if (vida < 40)
					etiquetaVida.setBackground(Color.RED);
				else etiquetaVida.setBackground(Color.YELLOW);
			}
		}
	}

	
	/**
	 * Genera un disparo y lo retorna para que fabrica de disparos
	 * lo inserte en el mapa
	 * 
	 */
	
	public void atacar() {
		
		if(puedeAtacar)

			fabricaDisparos.generarDisparoArqueroHumano(this);

	}




	public void posicionar(ParCelda celda){
		super.posicionar(celda);
		pos.setLocation(celda.getPos().x,celda.getPos().y+15);

	}

	public Entidad clone(){
		return new ArqueroHumano(vida,damage,velocidadAtaque,descripcion,fabricaDisparos);
	}
	
	
	
	
	
	
}
