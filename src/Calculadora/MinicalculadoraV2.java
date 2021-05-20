package Calculadora;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;


public class MinicalculadoraV2 extends JFrame {
	
	public MinicalculadoraV2(){
		//Variables
		
		//Titulo y algunas opciones
		setTitle("MinicalculadoraV23000");
		setSize(380,150);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Creacion de elementos
		//Primer Valor
		JTextField pvalor = new JTextField();   
        pvalor.setBounds(0, 20, 100, 30);
        pvalor.setHorizontalAlignment(JTextField.CENTER);
		
        //Segundo valor
        JTextField svalor = new JTextField();   
        svalor.setBounds(0, 60, 100, 30);
        svalor.setHorizontalAlignment(JTextField.CENTER);
        
        //Opciones radiales
        JRadioButton rdbtnOpcion= new JRadioButton("Sumatorio");
        rdbtnOpcion.setBounds(120, 10, 109, 23);
        
 
        JRadioButton rdbtnOpcion_1 = new JRadioButton("Productorio");
        rdbtnOpcion_1.setBounds(120, 40, 109, 23);
     
 
        JRadioButton rdbtnOpcion_2 = new JRadioButton("Expotencial");
        rdbtnOpcion_2.setBounds(120, 70, 109, 23);
        
       //Agrupar botones de radio
        ButtonGroup bgroup = new ButtonGroup();
        bgroup.add(rdbtnOpcion);
        bgroup.add(rdbtnOpcion_1);
        bgroup.add(rdbtnOpcion_2); 
        
        //Boton de calcular
        JButton calcular= new JButton ("¡Calcula!");
		calcular.setBounds(250, 10, 100, 30);
		
		//Resultados
		JTextField resultados = new JTextField();
		resultados.setHorizontalAlignment(JTextField.CENTER);
		resultados.setBackground(Color.pink);
		resultados.setEditable(false);
		resultados.setBounds(250, 55, 100, 50);
        
        //Creacion del panel
        JPanel elementos = new JPanel();
		elementos.setLayout(null);
		//Contenedor
		Container contenedor = getContentPane();
		//Aniadir
		contenedor.add(elementos);
		elementos.add(pvalor);
		elementos.add(svalor);
		elementos.add(rdbtnOpcion);
		elementos.add(rdbtnOpcion_1);
		elementos.add(rdbtnOpcion_2);
		elementos.add(resultados);
		elementos.add(calcular);
		
		//Eventos
		calcular.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                if (rdbtnOpcion.isSelected()) {
                	String numero1 = pvalor.getText();
	            	String numero2 = svalor.getText();
	            	int numeroint = Integer.parseInt(numero1);
	            	int numeroint2 = Integer.parseInt(numero2);
	            	int resultadosuma = 0;
	            	//Sumatorio
	            	for (int i=numeroint;i<=numeroint2;i++) {
	            		resultadosuma = resultadosuma + i;
	            	} 
	            	resultados.setText(" " +resultadosuma);
                }
                if(rdbtnOpcion_1.isSelected()) {
                	String numero1 = pvalor.getText();
	            	String numero2 = svalor.getText();
	            	int numeroint = Integer.parseInt(numero1);
	            	int numeroint2 = Integer.parseInt(numero2);
	            	int resultadomultiplicar = 1;
	            	//Sumatorio
	            	for (int i=numeroint;i<=numeroint2;i++) {
	            		resultadomultiplicar = resultadomultiplicar * i;
	            	} 
	            	resultados.setText(" " +resultadomultiplicar);
                }
                if(rdbtnOpcion_2.isSelected()) {
                	String numero1 = pvalor.getText();
	            	String numero2 = svalor.getText();
	            	int numeroint = Integer.parseInt(numero1);
	            	int numeroint2 = Integer.parseInt(numero2);
	            	int potencia = (int)Math.pow(numeroint, numeroint2);  
	            	resultados.setText(" " +potencia);
                }
              
            }
        });
		
	//Fin de Constructor		
	}
	
	
	
	//Clase principal
	public static void main(String[] args) {
		 EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                try {
	                	MinicalculadoraV2 frame = new MinicalculadoraV2();
	                    frame.setVisible(true);
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        });
	}
	
//Fin del programa
}
