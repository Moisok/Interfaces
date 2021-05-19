package Actividad_1;
//Ahora voy a seguir los ejemplos del PDF (Mañana lo corrijo)
import javax.swing.*;


	//Ejemplo de dialog (clase)
	public class EjemploJDialoj extends JFrame {
			//Constructor
		public EjemploJDialoj() {
			super ("Ejemplo de ventana con JDialog delante!");
			setSize(300,200);
			setVisible(true);
			JDialog cuadro = new JDialog(this, true);
			cuadro.setTitle("JDialog");
			cuadro.setSize(100,100);
			cuadro.setVisible(true);
			}
			
			

	//Main principal
	public static void main (String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new EjemploJDialoj();
			}	
		});
	}
}


	
	
	
	

