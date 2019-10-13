package Entidad;

import java.awt.*;

import javax.swing.*;

import FabricaDisparos.FabricaDisparo;

public class MagoHielo extends Aliado {

	public MagoHielo(int vida, int damage, float velocidadAtaque, String Descripcion, FabricaDisparo fabricaDisparos) {
		super(vida, damage, velocidadAtaque, Descripcion, fabricaDisparos);
		
		width=102;
		height=120;
		
		imagen[0] = new ImageIcon("Sprites/CharacterSprites/GIFs/MagoHielo/attackTRUE.gif");
		imagen[1] = new ImageIcon("Sprites/CharacterSprites/GIFs/MagoHielo/attackTRUE.gif");
		imagen[2] = new ImageIcon("Sprites/CharacterSprites/GIFs/MagoHielo/attackTRUE.gif");
	}


	public JLabel getEtiquetaVida(){
		if(this.etiquetaVida==null) {
			this.etiquetaVida=new JLabel();
			this.etiquetaVida.setBounds(pos.x,pos.y+this.height,80,5);
			this.etiquetaVida.setOpaque(true);
			this.etiquetaVida.setBackground(Color.GREEN);
		}

		return etiquetaVida;
	}

	public void actualizarEtiquetaVida(int n){

		if(etiquetaVida!=null) {
			etiquetaVida.setBounds(pos.x+10, pos.y+this.height+5 , (etiquetaVida.getWidth()-((n*80)/100)), etiquetaVida.getHeight());

			if (vida < 70) {
				if (vida < 40)
					etiquetaVida.setBackground(Color.RED);
				else etiquetaVida.setBackground(Color.YELLOW);
			}
		}
	}


	/**
	 * Utiliza la fabrica de disparos para generar un disparo y
	 * que lo meta en el mapa.
	 * 
	 */
	
	public void atacar() {
		
		if(puedeAtacar)
		
			fabricaDisparos.generarDisparoMagoHielo(this);

	}

	public void posicionar(Point posicionNueva){
		this.pos=new Point(posicionNueva.x,posicionNueva.y+15);

	}

	public Entidad clone(){
		return new MagoHielo(vida,damage,velocidadAtaque,descripcion,fabricaDisparos);
	}
	
	
	


}
