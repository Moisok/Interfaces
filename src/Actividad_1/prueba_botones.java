package Actividad_1;
import javax.swing.*;
import java.awt.*;

public class prueba_botones extends JFrame {
	
	//Probar las ventanas
	public prueba_botones() {
		setTitle("Ejemplos de botones");
			setSize(400, 300);
		
		//Labelels, texto y elementos
			
			//Nombre
		JLabel nombre = new JLabel ("Nombre: ");
		JTextField intronom = new JTextField(8);
		nombre.setBounds(380,280, 20,20);
		intronom.setLocation(500, 200);
		
			//Edad
		/*JLabel edad = new JLabel ("Edad: ");
		JTextField introedad = new JTextField(2);
		edad.setBounds(380, 260, 20, 60);
		introedad.setBounds(370, 270, 30, 60);*/
			//CheckBox
		/*JCheckBox acepto = new JCheckBox();
		acepto.setText("¿Aceptas las condiciones?");*/
		
			//RadioButtom
		/*JRadioButton sexo1 = new JRadioButton();
		sexo1.setBackground(Color.blue);
		sexo1.setText("Varon");
		JRadioButton sexo2 = new JRadioButton();
		sexo2.setBackground(Color.blue);
		sexo2.setText("mujer");*/
		
			//JToggleButton
		/*JToggleButton recibir = new JToggleButton();
		recibir.setText("Recibi notificaciones al coreo");*/
		
			//JComboBox
		/*JComboBox seleccion = new JComboBox();
		seleccion.addItem("Deportes");
		seleccion.addItem("Musica");
		seleccion.addItem("Electronica");
		seleccion.addItem("Viajes");
		seleccion.addItem("Moda");*/
		
			//JSeparator
		/*JSeparator separador = new JSeparator();
		separador.setBounds(30, 30, 500, 500);*/
		
			//JSlider
		/*JSlider deslizador = new JSlider();
		deslizador.setBounds(300, 140, 100, 30);
		deslizador.setValue(60);*/
	
			//JSpinner
		/*JSpinner spinnerspin = new JSpinner();
		spinnerspin.setBounds(250,140,100,30);*/
			
			//JProgressBar miBarrapan
		/*JProgressBar barrabas = new JProgressBar();
		barrabas.setBounds(100,200,100,200);*/
		
		
		//Jpanel
		JPanel elementos = new JPanel ();
		elementos.setBackground(Color.pink);
		
		//Container
		Container contenedor = getContentPane();
		
		//Añadimos al contenedor el panel elementos
		contenedor.add(elementos);
		
		//Añadimos a elementos los componentes
		elementos.add(nombre);
		elementos.add(intronom);
		//elementos.add(edad);
		//elementos.add(introedad);
		//elementos.add(sexo1);
		//elementos.add(sexo2);
		//elementos.add(separador);
		//elementos.add(recibir);                                
		//elementos.add(seleccion);
		//elementos.add(deslizador);
		//elementos.add(spinnerspin);
		//elementos.add(barrabas);
		//Este el ultimo
		//elementos.add(acepto);
		
		//Visivilidad
		setVisible(true);
	}
	
	
	//Main
	public static void main (String[]args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new prueba_botones();
			}
		});
	}
	
	

}
