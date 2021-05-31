package Procesador_texto;


import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.border.Border;

public class Mash_Text  extends JFrame{
	
	private JTextArea mostrar;

	public Mash_Text () {
		setTitle("Mash_Text");
		setSize(800,600);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Tipos de fuentes
		Font letra1 = new Font("Arial", Font.BOLD,  20);
				
		//Mostrar
		mostrar = new JTextArea ("ESTO ES UNA PRUEBA");
		mostrar.setBounds(50,55,700,500);

		
		//Botones
		

		
		//JPanel
		JPanel principal = new JPanel();
		principal.setLayout(null);
		principal.setBackground(Color.GRAY);

		
		//Contenedor
		Container contenedor = getContentPane();
		
		//Aniadir cosas
		contenedor.add(principal);
		principal.add(mostrar);
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
