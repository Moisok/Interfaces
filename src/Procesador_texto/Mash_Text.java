package Procesador_texto;


import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.border.Border;

public class Mash_Text  extends JFrame{
	
	private JButton guardar;
	private JButton abrir;
	private JButton nuevo;
	private JTextField mostrar;

	public Mash_Text () {
		setTitle("Mash_Text");
		setSize(800,600);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Tipos de fuentes
		Font letra1 = new Font("Arial", Font.BOLD,  20);
				
		//Mostrar
		mostrar = new JTextField ("ESTO ES UNA PRUEBA");
		mostrar.setBounds(50,20,700,400);
		mostrar.setBackground(Color.BLACK);
		mostrar.setForeground(Color.green);
		
		//Botones
		JButton guardar = new JButton("Guardar");
		guardar.setBounds(180, 450, 120, 30);

		JButton abrir = new JButton("Abrir");
		abrir.setBounds(340, 450, 120, 30);
		
		JButton nuevo = new JButton("Nuevo");
		nuevo.setBounds(500, 450, 120, 30);

		
		//JPanel
		JPanel principal = new JPanel();
		principal.setLayout(null);
		principal.setBackground(Color.GRAY);

		
		//Contenedor
		Container contenedor = getContentPane();
		
		//Aniadir cosas
		contenedor.add(principal);
		principal.add(mostrar);
		principal.add(nuevo);
		principal.add(abrir);
		principal.add(guardar);
		
		
		
	}
		
	
	
	
	//Clase principal
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                try {
	                	Mash_Text frame = new Mash_Text();
	                    frame.setVisible(true);
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        });

	}

}
