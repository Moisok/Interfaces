package Actividad_1;


import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.*;

public class Actividad_3 {

	public static void main(String[] args) {
		
		MarcoCentrado pruebamarco = new MarcoCentrado();
	}
		
}
//AutoCentrar Ventanas
class MarcoCentrado extends JFrame{
	
	public MarcoCentrado() {
		
		Toolkit predeterminado=Toolkit.getDefaultToolkit();
		
		Dimension tamanoPantalla=predeterminado.getScreenSize();
		
		//Alto
		int alturaScreen=tamanoPantalla.height;
		
		//Ancho
		int anchuraScreen=tamanoPantalla.width;
		
		setSize(anchuraScreen/2, alturaScreen/2);
		
		setLocation(anchuraScreen/4, alturaScreen/4);
		
		setVisible(true);
		
		setTitle("Mohai Maker");
		
		Image icono=predeterminado.getImage("Imagen.gif");
		
		setIconImage(icono);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}