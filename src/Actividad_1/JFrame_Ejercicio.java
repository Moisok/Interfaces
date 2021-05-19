package Actividad_1;
//Escribir en un marco Por moises sepulveda segarra

import javax.swing.*;
import java.awt.*;


public class JFrame_Ejercicio {

	public static void main(String[] args) {
		
		MarcoConTexto mimarco = new MarcoConTexto();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}

//Construccion del marco
class MarcoConTexto extends JFrame{
	
	public MarcoConTexto() {
		setVisible(true);
		setSize(600,450);
		setLocation(600,400);
		setTitle("Primer texto");
		lamina milamina= new lamina();
		add(milamina);
	}
}

//Contruccion del lienzo o lamina

class lamina extends JPanel{
	Font fuente= new Font("Arial", Font.ROMAN_BASELINE, 15);
	public void paintComponent(Graphics g) {
		super.paintComponent(g); //Primero llamamos 
		setBackground(Color.pink);
		g.setColor(Color.red);
		g.setFont(fuente);
		g.drawString("Buenas tardes ¿es aqui la reunion de testigos de jehova?", 100, 100);//Ahora me dibujas esto xD
		g.drawRect(95, 70, 400, 100);
		
	}
}


