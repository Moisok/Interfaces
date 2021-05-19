package Actividad_1;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class PruebaJPanel extends JFrame {

	//Jpanel
	public PruebaJPanel() {
		setTitle("Guenas!");
			setSize (300, 200);
		
		//Container
			Container contentpane = getContentPane();
		
		//Crear objeto tipo JPnale
			JPanel panel = new JPanel();
		
			//Agregar el panel en el objeto conetenedor del frame
			contentpane.add(panel);
			
			//Color
			panel.setBackground(Color.RED);
			
			//Agrego un boton
			panel.add(new JButton("Haz clock aqui"));
			setVisible(true);
	}
	
	
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new PruebaJPanel();
			}
		});
	}

}
