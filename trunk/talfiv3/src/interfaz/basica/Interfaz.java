package interfaz.basica;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Interfaz extends JFrame {

	public Interfaz(){
		this.setSize(1280, 800);
		this.setResizable(true);
		inicializarInterfaz();
	}
	
	private void inicializarInterfaz(){
		this.setJMenuBar(getMenuPrincipal());
		this.setContentPane(getPanelPrincipal());
	}
	
	//--- CREAMOS EL MENU PRINCIPAL ---
	
	private JMenuBar getMenuPrincipal(){
		JMenuBar barraMenu = null;
		barraMenu = new JMenuBar();
		barraMenu.add(getMenuArchivo());
		//barraMenu.add(getMenuIdioma());
		return barraMenu;
	}
	
	// --- COMENZAMOS CON EL MENU ARCHIVO ---
	
	private JMenu getMenuArchivo(){
		JMenu archivoMenu = null;
		archivoMenu = new JMenu("Archivo");
		archivoMenu.add(getNuevo());
		archivoMenu.add(getAbrir());
		archivoMenu.add(getSalvar());
		archivoMenu.add(getSalvarComo());
		archivoMenu.addSeparator();
		archivoMenu.add(getSalir());
		return archivoMenu;
	}
	
	// --- LOS ITEMS DEL MENU ARCHIVO ---
	
	private JMenu getNuevo(){
		JMenu nuevo = null;
		nuevo = new JMenu("Nuevo");
		nuevo.add(getAF());
		nuevo.add(getAP());
		nuevo.add(getMT());
		return nuevo;
	}
	
	private JMenuItem getAF(){
		JMenuItem AF = null;
		AF = new JMenuItem("Autómata Finito");
		AF.setEnabled(true);
		AF.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent evento){
						//Aqui creamos el Panel para hacer el autómata finito
					}
				});
		return AF;
	}
	
	private JMenuItem getAP(){
		JMenuItem AP = null;
		AP = new JMenuItem("Autómata Pila");
		AP.setEnabled(true);
		AP.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent evento){
						//Aqui creamos el Panel para hacer el autómata a pila
					}
				});
		return AP;
	}
	
	private JMenuItem getMT(){
		JMenuItem MT = null;
		MT = new JMenuItem("Máquina Turing");
		MT.setEnabled(true);
		MT.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent evento){
						//Aqui creamos el Panel para hacer la máquina Turing
					}
				});
		return MT;
	}
	
	private JMenuItem getAbrir(){
		JMenuItem abrir = null;
		abrir = new JMenuItem("Abrir");
		abrir.setEnabled(true);
		abrir.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent evento){
						JFileChooser selector=new JFileChooser();
						if (selector.showOpenDialog(Interfaz.this)==JFileChooser.APPROVE_OPTION){
							String fichabrir = selector.getSelectedFile().getName();
							//hacer las operaciones de archivos
						}
					}
				});
		return abrir;
	}
	
	private JMenuItem getSalvar(){
		JMenuItem salvar = null;
		salvar = new JMenuItem("Salvar");
		if (true)
			{
			salvar.setEnabled(true);
			salvar.addActionListener(
					new ActionListener(){
						public void actionPerformed(ActionEvent evento){
							JFileChooser selector; 
						}
					});
			}
		else
			{
			
			}
		return salvar;
	}
	
	private JMenuItem getSalvarComo(){
		JMenuItem salvarComo = null;
		salvarComo = new JMenuItem("Salvar como");
		salvarComo.setEnabled(true);
		salvarComo.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent evento){
						JFileChooser selector; 
					}
				});
		return salvarComo;
	}
	
	private JMenuItem getSalir(){
		JMenuItem salir = null;
		salir = new JMenuItem("Salir");
		salir.setEnabled(true);
		salir.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent evento){
					JFileChooser selector; 
				}
			});
		return salir;
	}
	
	private Container getPanelPrincipal(){
		Container panel=null;
		panel = new Container();
		return panel;
	}
	
}
