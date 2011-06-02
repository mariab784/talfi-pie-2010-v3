package comandos;
import vista.vistaGrafica.AutomataCanvas;

public class PasoAJPG {
	private static String rutaXML;
	private static String rutaJPG;
	
	public PasoAJPG(){
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length == 0){
			System.out.printf("Introducir los Argumentos de la operacion");
		}
		else
		{
			rutaXML = args[0];
			if (args.length == 1){
				rutaJPG = "default.jpg";
			}
			else {
				rutaJPG = args[1];
			}
		PasoAJPG p = new PasoAJPG();
		p.XMLToJPG(rutaXML,rutaJPG);
		}
	}
	public void XMLToJPG(String rXML, String rJPG){
		AutomataCanvas ac=new AutomataCanvas(null);
		//Revisar como hacer sin tener que cargar toda la clase VistaGráfica que es inútil para lo que buscamos
		ac.cargarAutomata(rutaXML);
		ac.generarImagenJPg(rutaJPG);
	}
}
