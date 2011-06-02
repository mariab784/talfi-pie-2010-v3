/**
 * 
 */
package vista;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import controlador.*;
import modelo.AutomatasException;
import modelo.automatas.Alfabeto;
import modelo.automatas.Automata;

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
		query=null;
		controlador=Controlador_imp.getInstancia();
		controlador.registraVista(this);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			query=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(query);
		ejecuta();
	}
	
	public void ejecuta() {
		try {
			controlador.ejecutaQuery(query);
		} catch(AutomatasException e){
			System.out.println(e.getMensaje());
		}
	}

	public void trataMensaje(String mensaje) {
		// TODO Auto-generated method stub
		System.out.println(mensaje);
	}

	public Controlador getControlador(){
		return controlador;
	}
	
	public void muestraHtml(boolean pasos, String rutahtml){
		
	}
	
	public void setExpresion(String exp){
		
	}
	
	public void deleteExpresion(){
		
	}
	
	public String traducirXML(String exp, Alfabeto alfabeto) throws AutomatasException{
		return ""; //Cambiar si el metodo necesita funcionalidad
	}
	
	public void desactivaToogleButtons(){
		
	}
	
	public void activaToogleButtons(){
		
	}
	
	public void reconstruir(){
		
	}

	public void setAutomata(Automata a){
		
	}
	
	public void reconstruirPanelUsuario(){
		
	}
	
	public boolean dibujar(){
		return true; //Cambiar si el metodo necesita funcionalidad
	}
	
	public String getRutaPredef(){
		return ""; //Cambiar si el metodo necesita funcionalidad
	}

	public void setRutaPredef(String rutaPredef){
		
	}
	
	public void requestFocus(){
		
	}
	
	public void setPegar(){
		
	}

	public void reconstruirPanelJTree(){
		
	}

	public void setOpcionesAF() {
		// TODO Auto-generated method stub
		
	}

	public void setOpcionesMT() {
		// TODO Auto-generated method stub
		
	}

	public void setOpcionesAP() {
		// TODO Auto-generated method stub
		
	}
	
}
