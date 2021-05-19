package Prueba;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;



public class Prueba_y_Ejemplos extends JFrame {
	//Ventana
	
	private JComboBox<String> comboBox;
	
	public Prueba_y_Ejemplos() {
		setTitle("Ejemplos funciones");
			setSize(800, 600);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
		//Prueba
		JLabel pruebatexto = new JLabel ("Prueba: ");
		pruebatexto.setBounds(10, 10, 90, 30);
		JButton boton = new JButton ("Click");
		boton.setBounds(60, 10, 90, 30);
		
		//ComboBox
		JLabel pruebatexto2 = new JLabel ("Prueba de cajita: ");
		pruebatexto2.setBounds(10, 60, 120, 30);
		 comboBox = new JComboBox<>();
		 comboBox.setBounds(125, 60, 100, 30);
		 comboBox.setBackground(Color.red);
		 
		//Aniado Opciones
	        comboBox.addItem("PS4");
	        comboBox.addItem("PS5");
	        comboBox.addItem("PS6");
	        
	    //Boton raton
	     JRadioButton Opcion= new JRadioButton("Opcion 1");
	     Opcion.setBounds(10, 145, 109, 23);
	     JRadioButton Opcion2= new JRadioButton("Opcion 2");
	     Opcion2.setBounds(10, 165, 109, 23); 
	     JRadioButton Opcion3= new JRadioButton("Opcion 3");
	     Opcion3.setBounds(10, 185, 109, 23); 
	     
	     ButtonGroup bgroup = new ButtonGroup();
	        bgroup.add(Opcion);
	        bgroup.add(Opcion2);
	        bgroup.add(Opcion3);
	        
	     JLabel pruebatexto4 = new JLabel ("Estas sobre: ");
	     pruebatexto4.setBounds(200, 165, 500, 23); 
	     
	    //Introducir cosas
	        JLabel pruebatexto3 = new JLabel ("Introduce cosas xD: ");   
	        pruebatexto3.setBounds(10, 100, 120, 30);
	        JTextField introduce = new JTextField();
			introduce.setBounds(150, 100, 100, 30);
			JButton botonaniade = new JButton ("aniadir");
			botonaniade.setBounds(260, 100, 90, 30);
		
			
		//JPanel los botones y las cosas y demas se meten siempre al PANEL!!	
		JPanel elementos = new JPanel();
		elementos.setLayout(null);
		//Contenedor
		Container contenedor = getContentPane();
		
		//Añadir cosas
		elementos.add(pruebatexto);
		elementos.add(boton);
		elementos.add(pruebatexto2);
		elementos.add(comboBox);
		elementos.add(pruebatexto3);
		elementos.add(introduce);
		elementos.add(botonaniade);
		elementos.add(Opcion);
		elementos.add(Opcion2);
		elementos.add(Opcion3);
		elementos.add(pruebatexto4);
		contenedor.add(elementos);
		
		//Eventos
		
		//Pulsar un boton
		boton.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                JOptionPane.showMessageDialog(elementos, "Me has pulsado!");
            }
        });
		
		//Aniadir cosicas
		  botonaniade.addActionListener(new ActionListener(){
	            public void actionPerformed (ActionEvent e){
	                comboBox.addItem(introduce.getText());
	                introduce.setText("");
	                JOptionPane.showMessageDialog(elementos, "Lo has ponido!!");
	            }
	        });
		  
		 //Estas sobre...
		  Opcion.addMouseListener(new MouseListener(){
	            public void mouseClicked(MouseEvent e){
	 
	            }
	            public void mouseEntered(MouseEvent e){
	                pruebatexto4.setText(pruebatexto4.getText()+Opcion.getText());
	            }
	            public void mouseExited(MouseEvent e){
	                pruebatexto4.setText("Estas sobre la ");
	            }
	            public void mousePressed(MouseEvent e){
	 
	            }
	            public void mouseReleased(MouseEvent e){
	 
	            }
	        });
		  
		  Opcion2.addMouseListener(new MouseListener(){
	            public void mouseClicked(MouseEvent e){
	 
	            }
	            public void mouseEntered(MouseEvent e){
	                pruebatexto4.setText(pruebatexto4.getText()+Opcion2.getText());
	            }
	            public void mouseExited(MouseEvent e){
	                pruebatexto4.setText("Estas sobre la ");
	            }
	            public void mousePressed(MouseEvent e){
	 
	            }
	            public void mouseReleased(MouseEvent e){
	 
	            }
	        });
		  
		  Opcion3.addMouseListener(new MouseListener(){
	            public void mouseClicked(MouseEvent e){
	 
	            }
	            public void mouseEntered(MouseEvent e){
	                pruebatexto4.setText(pruebatexto4.getText()+Opcion3.getText());
	            }
	            public void mouseExited(MouseEvent e){
	                pruebatexto4.setText("Estas sobre la ");
	            }
	            public void mousePressed(MouseEvent e){
	 
	            }
	            public void mouseReleased(MouseEvent e){
	 
	            }
	        });
		
	//Fin del JFrame
	}
	
	
	
	//Clase Main Principal
	 public static void main(String[] args) {
	        EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                try {
	                	Prueba_y_Ejemplos frame = new Prueba_y_Ejemplos();
	                    frame.setVisible(true);
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        });
	    }
	
	

}

