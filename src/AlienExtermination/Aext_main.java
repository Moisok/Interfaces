package AlienExtermination;
//Videojuego creado por Moises Sepulveda Segarra.
//Importamos las clases de java necesaria

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyListener;
import java.awt.Robot; 

import javax.swing.*;



public class Aext_main extends JFrame {
	
	public Aext_main () {
		//Opciones de la ventana
		setTitle("Alien Extermination");
		setSize(800,600);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Toolkit predeterminado=Toolkit.getDefaultToolkit();
		Image icono= predeterminado.getImage("icon.png");
		setIconImage(icono);
		
		//Fondo
		PanelImagen background = new PanelImagen();
		
		//Nave
		starship nave = new starship();
		nave.setLocation(400, 500);
		
		//Disparo
		Shoot disparo = new Shoot();
		disparo.setLocation(420, 480);
		disparo.setVisible(false);
		
		
		//Creacion de panel
		JPanel nivel1 = new JPanel();
		nivel1.setLayout(null);
		//Contenedor
		Container contenedor = getContentPane();
		
		//Añadimos elementos al contenedor
		contenedor.add(nivel1);
		
		//Añadimos elementos a los niveles
		nivel1.add(disparo);
		nivel1.add(nave);
		nivel1.add(background);
		
		
		//Escuchar teclado
				KeyListener Escuchar = new EscucharTeclado(nave, disparo);
				addKeyListener(Escuchar);
				setFocusable(true);
				
		
	}


//Clase principal de 
public static void main(String[] args) {
	// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			  public void run() {
			     try {
			    	 Aext_main frame = new Aext_main();
			            frame.setVisible(true);
			         } catch (Exception e) {
			        e.printStackTrace();
			     }
			  }
		});
	}

}
