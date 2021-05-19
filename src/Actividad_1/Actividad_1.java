package Actividad_1;
//Importamos clase 
import java.awt.*;
import javax.swing.*;

//Clase de JFRAME
class ventanita extends JFrame {
	
	public ventanita () {
		setTitle("Mi primerita ventana");
		setVisible(true);
		setSize(500,600);
		setLocation(700,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

//Clase JDialog
class mensajito extends JDialog {
	public mensajito () {
		setTitle("ATENCION");
		setVisible(true);
		setSize(250,300);
		setLocation(700,500);
	}
}

//Clase principal
public class Actividad_1 {

	public static void main(String[] args) {
		
		ventanita emergente = new ventanita ();
		
		mensajito cuidadin = new mensajito ();
		
	}

}
