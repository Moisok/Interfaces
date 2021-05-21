package CalculadoraComplejos;
//Ejercicio en el cual voy a crear una minicalculadora
//Creado por Moises Sepulveda Segarra 
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Minicalculadora extends JFrame {
	//Variables de Jpanel
	private JLabel resultado;
	
	//Ventana Calculadora
	public Minicalculadora () {
		//Titulo
		setTitle("Calculator 3000 V0.0.1");
			setSize(300,200);
			setResizable(false);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		//Creacion de elementos
			//Primer valor
		JTextField pvalor = new JTextField();   
        pvalor.setBounds(20, 20, 50, 30);
        pvalor.setHorizontalAlignment(JTextField.CENTER);
			//Segundo valor
		JTextField svalor = new JTextField();   
        svalor.setBounds(140, 20, 50, 30);
        svalor.setHorizontalAlignment(JTextField.CENTER);
        	//imaginaria
        JTextField imaginario = new JTextField();   
        imaginario.setBounds(200, 20, 50, 30);
        imaginario.setHorizontalAlignment(JTextField.CENTER);
        	//real
        JTextField real = new JTextField();   
        real.setBounds(80, 20, 50, 30);
        real.setHorizontalAlignment(JTextField.CENTER);
        	//Sumar
        JButton suma= new JButton ("+");
		suma.setBounds(10, 60, 50, 30);
			//restar
		JButton resta= new JButton ("-");
		resta.setBounds(80, 60, 50, 30);
			//Multiplicar
		JButton multiplicar= new JButton ("*");
		multiplicar.setBounds(150, 60, 50, 30);
			//Dividir
		JButton dividir= new JButton ("/");
		dividir.setBounds(220, 60, 50, 30);
			//Resultado
		resultado = new JLabel("Resultado: ");
		resultado.setBounds(80, 100, 200, 30);
		//Creacion del panel
		JPanel elementos = new JPanel();
		elementos.setBackground(Color.cyan);
		elementos.setLayout(null);
		//Contenedor
		Container contenedor = getContentPane();
		//Aniadir
		elementos.add(pvalor);
		elementos.add(svalor);
		elementos.add(imaginario);
		elementos.add(real);
		elementos.add(suma);
		elementos.add(resta);
		elementos.add(multiplicar);
		elementos.add(dividir);
		elementos.add(resultado);
		contenedor.add(elementos);
		
		//EVENTOS 
		//SUMAR
		suma.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
            	resultado.setText("Resultado: ");
            	String numero1 = pvalor.getText();
            	String numero2 = svalor.getText();
            	String numeroreal = real.getText();
            	String numeroimaginario = imaginario.getText();
            	double numeroint = Double.parseDouble(numero1);
            	double numeroint2 = Double.parseDouble(numero2);
            	double numero3 = Double.parseDouble(numeroreal);
            	double numero4 = Double.parseDouble(numeroimaginario);
            	complejos calculareal = new complejos(numeroint,numeroint2);
            	complejos calcular = new complejos(numero3,numero4);         	
            	resultado.setText(resultado.getText() + calculareal.suma(calcular));
            }
        });
	
		//RESTA
		resta.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
            	resultado.setText("Resultado: ");
            	String numero1 = pvalor.getText();
            	String numero2 = svalor.getText();
            	String numeroreal = real.getText();
            	String numeroimaginario = imaginario.getText();
            	double numeroint = Double.parseDouble(numero1);
            	double numeroint2 = Double.parseDouble(numero2);
            	double numero3 = Double.parseDouble(numeroreal);
            	double numero4 = Double.parseDouble(numeroimaginario);
            	complejos calculareal = new complejos(numeroint,numeroint2);
            	complejos calcular = new complejos(numero3,numero4);         	
            	resultado.setText(resultado.getText() + calculareal.resta(calcular));
            }
        });
		
		//MULTIPLICACION
		multiplicar.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
            	resultado.setText("Resultado: ");
            	String numero1 = pvalor.getText();
            	String numero2 = svalor.getText();
            	String numeroreal = real.getText();
            	String numeroimaginario = imaginario.getText();
            	double numeroint = Double.parseDouble(numero1);
            	double numeroint2 = Double.parseDouble(numero2);
            	double numero3 = Double.parseDouble(numeroreal);
            	double numero4 = Double.parseDouble(numeroimaginario);
            	complejos calculareal = new complejos(numeroint,numeroint2);
            	complejos calcular = new complejos(numero3,numero4);         	
            	resultado.setText(resultado.getText() + calculareal.multiplicar(calcular));
            }
        });
		
		//DIVIDIR
		dividir.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
            	resultado.setText("Resultado: ");
            	String numero1 = pvalor.getText();
            	String numero2 = svalor.getText();
            	String numeroreal = real.getText();
            	String numeroimaginario = imaginario.getText();
            	double numeroint = Double.parseDouble(numero1);
            	double numeroint2 = Double.parseDouble(numero2);
            	double numero3 = Double.parseDouble(numeroreal);
            	double numero4 = Double.parseDouble(numeroimaginario);         
            	if (numeroint2 == 0 | numero4 == 0) {
            		resultado.setText(resultado.getText() + "Invalid");
            	}
            	else {
            		complejos calculareal = new complejos(numeroint,numeroint2);
                	complejos calcular = new complejos(numero3,numero4);         	
                	resultado.setText(resultado.getText() + calculareal.division(calcular));
            	}
            }
        });
		
		
		
		
		
	//Fin de la clase
	}
	
	//Clase Main (o principal)
	public static void main(String[]args) {
		 EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                try {
	                	Minicalculadora frame = new Minicalculadora();
	                    frame.setVisible(true);
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        });
	}
}
