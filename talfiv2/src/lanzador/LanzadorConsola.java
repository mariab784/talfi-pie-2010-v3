/**
 * 
 */
package lanzador;

import controlador.*;
import vista.*;

/**
 * @author Miguel
 *
 */
public class LanzadorConsola {
	
	public LanzadorConsola(){
	}
	
	public void ejecuta(){
		Controlador controlador=Controlador_imp.getInstancia();
		Vista v=new VistaConsola();
		controlador.registraVista(v);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lanzador l=new Lanzador();
		l.ejecuta();
	}

}
