package Niveles;

import java.awt.Point;

import Entidad.ArqueroHumano;
import Entidad.DisparoArqueroHumano;
import Entidad.EnemigoGolemHielo;
import Entidad.Entidad;
import Entidad.MagoHielo;
import Juego.Mapa;
import Entidad.*;

public class NivelUno extends Nivel {
	private static NivelUno instance=null;
	private NivelUno(Mapa mapa) {
		super(mapa);
	}

	public  static NivelUno getinstance(Mapa mapa){
		if(instance==null){
			instance=new NivelUno(mapa);
		}
		return instance;
	}

	public  static NivelUno getinstance(){
	    if(instance==null){
            System.out.println("NULL");
        }
		return instance;
	}
	/**
	 * Genera los enemigos y utiliza agregarEntidad de mapa
	 * para insertarlos en el mismo
	 * 
	 */
	
	public void generarEnemigos() {

		Entidad enemigo1=fabricaEnemigos.generarGolemHielo();
		enemigo1.posicionar(new Point(1800,600));
		mapa.agregarEntidad(enemigo1);

		Entidad enemigo2=fabricaEnemigos.generarGolemHielo();
		enemigo2.posicionar(new Point(1800,495));
		mapa.agregarEntidad(enemigo2);


	}
	
	
	/**
	 * Genera los aliados y utiliza agregarEntidad de mapa
	 * para insertarlos en el mismo
	 * 
	 */
	public void generarAliados() {

		/*
		ArqueroHumano aliado1 = new ArqueroHumano(new Point(650  ,300),10,10,1500,"",mapa.getFabricaDisparos()); //agrega un aliado
		mapa.agregarEntidad(aliado1);
		
		Point posicionAliado=aliado1.getPos(); //Consulta la posicion del aliado y se guarda
		

		ArqueroHumano aliado3 = new ArqueroHumano(new Point(490,255),10,10,1500,"",mapa.getFabricaDisparos());
		mapa.agregarEntidad(aliado3);
		
		MagoHielo aliado2 = new MagoHielo(new Point(150,300),10,10,1500,"",mapa.getFabricaDisparos());
		mapa.agregarEntidad(aliado2);
	
		
		*/
																				
	
	}
	
	
	
	
}
