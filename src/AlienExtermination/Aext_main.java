package AlienExtermination;
//Videojuego creado por Moises Sepulveda Segarra.
//Importamos las clases de java necesaria

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.*;


public class Aext_main extends JFrame  {
	
	private int vertical;
	private	int horizontal;
	private int horizontal2;
	private int horizontal3;
	private int horizontal4;
	private int horizontal5;
	private int horizontal6;
	private int balas = 14;
	private int puntuacion = 0;
	private String infobalas = "Balas:" + balas; 
	private String infopuntos = "Puntos: " + puntuacion;
	private musica_y_sonidos musica_fondo = new musica_y_sonidos();

	
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
		musica_fondo.musica_y_sonidos("alien_music.wav");
		
		//Fondo
		PanelImagen background = new PanelImagen();
		
		//Nave
		starship nave = new starship();
		nave.setLocation(400, 500);
		
		//Alienigenas
		alien alien1 = new alien();
		alien1.setLocation(400, 100);
		
		alien alien2 = new alien();
		alien2.setLocation(400, 130);
		
		alien alien3 = new alien();
		alien3.setLocation(400, 160);
		
		alien alien4 = new alien();
		alien4.setLocation(400, 190);
		
		alien alien5 = new alien();
		alien5.setLocation(400, 210);
		
		alien alien6 = new alien();
		alien6.setLocation(400, 240);
		
		//Puntuacion 
		JTextField puntos = new JTextField (infopuntos);
		puntos.setOpaque(false);
		puntos.setBounds(700, 540, 100, 30);
		puntos.setForeground(Color.red);
		
		//Municion
		JTextField balas_sys = new JTextField (infobalas);
		balas_sys.setOpaque(false);
		balas_sys.setBounds(0, 540, 100, 30);
		balas_sys.setForeground(Color.red);
		
		//Disparo
		Shoot disparo = new Shoot();
		disparo.setLocation(420, 350);
		disparo.setVisible(false);
		
		//Creacion de panel
		JPanel nivel1 = new JPanel();
		nivel1.setLayout(null);
		
		//Contenedor
		Container contenedor = getContentPane();
		
		//Añadimos elementos al contenedor
		contenedor.add(nivel1);
		
		//Añadimos elementos a los niveles
		nivel1.add(puntos);
		nivel1.add(balas_sys);
		nivel1.add(alien1);
		nivel1.add(alien2);
		nivel1.add(alien3);
		nivel1.add(alien4);
		nivel1.add(alien5);
		nivel1.add(alien6);
		nivel1.add(nave);
		nivel1.add(disparo);
		nivel1.add(background);
		
		//Escuchar teclado, esto caputa las teclas cuando las pulsamos
				KeyListener Escuchar = new EscucharTeclado (nave, disparo, balas);
				addKeyListener(Escuchar);
				setFocusable(true);
		//Musica de fondo
			
				
		//Movimientos de la nave alienigena, se van teletransportando de manera random en la misma fila donde estan situadas
			Timer timerovni = new Timer(1500, new ActionListener(){
			       @Override
			       public void actionPerformed(ActionEvent e) {
			    	horizontal = (int)(Math.random() * (770 - 20) + 20);
			    	horizontal2 = (int)(Math.random() * (770 - 20) + 20);
			    	horizontal3 = (int)(Math.random() * (770 - 20) + 20);
			    	horizontal4 = (int)(Math.random() * (770 - 20) + 20);
			    	horizontal5 = (int)(Math.random() * (770 - 20) + 20);
			    	horizontal6 = (int)(Math.random() * (770 - 20) + 20);
			        alien1.setLocation(horizontal, 100);
			        alien2.setLocation(horizontal2, 130);
			        alien3.setLocation(horizontal3, 160);
			        alien4.setLocation(horizontal4, 190);
			        alien5.setLocation(horizontal5, 210);
			        alien6.setLocation(horizontal6, 240);
			        //Sistema de colisiones
			        if (disparo.getBounds().intersects(alien1.getBounds())){
					alien1.setVisible(false);
				}
						}
			        }
			    );
			
			timerovni.start();
			
			//Timer para las colisiones
			Timer colisiones = new Timer(1, new ActionListener(){
			       @Override
			       public void actionPerformed(ActionEvent e) {
			    	   
			    	   //Actualizar balas, segun pulsamos espacio se nos van gastando las balas
			    	   balas_sys.setText("Balas: " + ((EscucharTeclado)Escuchar).getBalas());
			    	   
			        //Sistema de colisiones, Si la bala toca con un alienigena el alieniga desaparece y se suman puntos
			    	   
			        if (disparo.getBounds().intersects(alien1.getBounds())){
			        puntuacion = puntuacion + 150;
			        puntos.setText("Puntos: " + puntuacion);
					alien1.setVisible(false);
			        }
			        if (disparo.getBounds().intersects(alien2.getBounds())){
				        puntuacion = puntuacion + 150;
				        puntos.setText("Puntos: " + puntuacion);
						alien2.setVisible(false);
					}
			        if (disparo.getBounds().intersects(alien3.getBounds())){
				        puntuacion = puntuacion + 150;
				        puntos.setText("Puntos: " + puntuacion);
						alien3.setVisible(false);
					}
			        if (disparo.getBounds().intersects(alien4.getBounds())){
				        puntuacion = puntuacion + 150;
				        puntos.setText("Puntos: " + puntuacion);
						alien4.setVisible(false);
					}
			        if (disparo.getBounds().intersects(alien5.getBounds())){
				        puntuacion = puntuacion + 150;
				        puntos.setText("Puntos: " + puntuacion);
						alien5.setVisible(false);
					}
			        if (disparo.getBounds().intersects(alien6.getBounds())){
				        puntuacion = puntuacion + 150;
				        puntos.setText("Puntos: " + puntuacion);
						alien6.setVisible(false);
					}
			        
			      //Condicion de Victoria, si se nos gastan las balas perdemops si matamos a todos los ovnis ganamos
					if (alien1.isVisible() == false && alien2.isVisible() == false && alien3.isVisible() == false &&
							alien4.isVisible() == false && alien5.isVisible() == false && alien6.isVisible() == false) {
						JOptionPane.showMessageDialog(null, "Has salvado a la tierra de la invasion alienigena!!!");
						System.exit(0);
					}
					
					if (((EscucharTeclado)Escuchar).getBalas() == 0) {
						JOptionPane.showMessageDialog(null, "Has perdido, los alienigenas han invadido la tierra");
						System.exit(0);
					}
						}
			        }
			    );
			colisiones.start();
	}
	
	
//Clase principal del juego donde lo iniciaremos
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
