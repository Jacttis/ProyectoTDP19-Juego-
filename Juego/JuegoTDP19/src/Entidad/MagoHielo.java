package Entidad;

import java.awt.*;

import javax.swing.*;

import Constantes.Constantes;
import FabricaDisparos.FabricaDisparo;
import FabricaDisparos.FabricaDisparoMagoHielo;

public class MagoHielo extends Aliado {

	public MagoHielo(int vida, int damage, float velocidadAtaque,int rango, String Descripcion) {
		super(vida, damage, velocidadAtaque, rango, Descripcion);
		
		width= Constantes.ALIADOX;
		height=Constantes.ALIADOY;

		fabricaDisparo=new FabricaDisparoMagoHielo(this);

		imagen[0] = new ImageIcon("Sprites/CharacterSprites/GIFs/MagoHielo/attackTRUE.gif");
		imagen[1] = new ImageIcon("Sprites/CharacterSprites/GIFs/MagoHielo/attackTRUE.gif");
		imagen[2] = new ImageIcon("Sprites/CharacterSprites/GIFs/MagoHielo/attackTRUE.gif");
		imagen[3] = new ImageIcon("Sprites/CharacterSprites/GIFs/MagoHielo/attackTRUE.gif");
	}


	public void iniciarEtiquetaVida(){
		if(this.etiquetaVida==null) {
			this.etiquetaVida=new JLabel();
			this.etiquetaVida.setBounds(pos.x,pos.y+this.height,80,5);
			this.etiquetaVida.setOpaque(true);
			this.etiquetaVida.setBackground(Color.GREEN);
			this.graficos[1]=etiquetaVida;
		}
	}

	public void actualizarEtiquetaVida(int n){

		if(etiquetaVida!=null) {
			etiquetaVida.setBounds(pos.x+10, pos.y+this.height+5 , (etiquetaVida.getWidth()-((n*80)/vidaTotal)), etiquetaVida.getHeight());

			if (vidaActual < 70) {
				if (vidaActual < 40)
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
		
			fabricaDisparo.generarDisparo();

	}

	public void posicionar(Point posicionNueva){
		this.pos=new Point(posicionNueva.x,posicionNueva.y+15);

	}

	public Entidad clone(){
		return new MagoHielo(vidaTotal,damage,velocidadAtaque,rango,descripcion);
	}


	public Rectangle getHitBox(){
		return new Rectangle(pos.x,pos.y,width-30,height-70);
	}



}
