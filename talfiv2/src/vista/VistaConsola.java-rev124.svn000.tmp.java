/**
 * 
 */
package vista;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import controlador.*;

/**
 * @author Miguel
 *
 */
public class VistaConsola implements Vista{
	
	//LA UTILIDAD DE EsTA CLASE EN EL FUTURO SER� UNA PARTE DE LA INTERFAZ GR�FICA
	//DE MOMENTO SOLO PASA LAS QUERYS AL CONTROLADOR
	private Controlador controlador;
	private String query;
	
	public VistaConsola() {
		controlador=Controlador_imp.getInstancia();
		query=null;
		System.out.println("Escribe aqu� la sentencia de ejecuci�n:");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			query=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ejecuta();
	}
	
	public void ejecuta() {
		controlador.ejecutaQuery(query);
	}

}
