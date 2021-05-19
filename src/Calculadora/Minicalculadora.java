package Calculadora;
//Ejercicio en el cual voy a crear una minicalculadora
//Creado por Moises Sepulveda Segarra 
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Minicalculadora extends JFrame {

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
		JLabel valor1 = new JLabel ("Primer valor");
		valor1.setBounds(0, 0, 100, 20);
		JTextField pvalor = new JTextField();   
        pvalor.setBounds(0, 20, 100, 30);
        pvalor.setHorizontalAlignment(JTextField.CENTER);
			//Segundo valor
		JLabel valor2 = new JLabel ("Segundo valor");
		valor2.setBounds(200, 0, 100, 20);
		JTextField svalor = new JTextField();   
        svalor.setBounds(190, 20, 100, 30);
        svalor.setHorizontalAlignment(JTextField.CENTER);
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
		JLabel resultado = new JLabel("Resultado: ");
		resultado.setBounds(80, 100, 200, 30);
		//Creacion del panel
		JPanel elementos = new JPanel();
		elementos.setBackground(Color.cyan);
		elementos.setLayout(null);
		//Contenedor
		Container contenedor = getContentPane();
		//Aniadir
		elementos.add(valor1);
		elementos.add(valor2);
		elementos.add(pvalor);
		elementos.add(svalor);
		elementos.add(suma);
		elementos.add(resta);
		elementos.add(multiplicar);
		elementos.add(dividir);
		elementos.add(resultado);
		contenedor.add(elementos);
		
		//EVENTOS 
		//SUMAR
		Sumar(pvalor, svalor, suma, resultado);
	
		//RESTA
		restar(pvalor, svalor, resta, resultado);
		
		//MULTIPLICACION
		multiplicar(pvalor, svalor, multiplicar, resultado);
		
		//DIVIDIR
		dividir(pvalor, svalor, dividir, resultado);
	//Fin de la clase
	}
	
	//Dividir
	private void dividir(JTextField pvalor, JTextField svalor, JButton dividir, JLabel resultado) {
		dividir.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
            	resultado.setText("Resultado: ");
            	String numero1 = pvalor.getText();
            	String numero2 = svalor.getText();
            	double numeroint = Double.parseDouble(numero1);
            	double numeroint2 = Double.parseDouble(numero2);
            	if (numeroint2 == 0) {
            		resultado.setText(resultado.getText() + "Invalid");
            	}
            	else {
            	double resultadosuma = numeroint / numeroint2;
            	resultado.setText(resultado.getText() + resultadosuma);
            	}
            }
        });
	}
	
	//Multiplicar
	private void multiplicar(JTextField pvalor, JTextField svalor, JButton multiplicar, JLabel resultado) {
		multiplicar.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
            	resultado.setText("Resultado: ");
            	String numero1 = pvalor.getText();
            	String numero2 = svalor.getText();
            	int numeroint = Integer.parseInt(numero1);
            	int numeroint2 = Integer.parseInt(numero2);
            	int resultadosuma = numeroint * numeroint2;
            	resultado.setText(resultado.getText() + resultadosuma);
            }
        });
	}
	
	//Restar
	private void restar(JTextField pvalor, JTextField svalor, JButton resta, JLabel resultado) {
		resta.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
            	resultado.setText("Resultado: ");
            	String numero1 = pvalor.getText();
            	String numero2 = svalor.getText();
            	int numeroint = Integer.parseInt(numero1);
            	int numeroint2 = Integer.parseInt(numero2);
            	int resultadosuma = numeroint - numeroint2;
            	resultado.setText(resultado.getText() + resultadosuma);
            }
        });
	}
	
	//Sumar
	private void Sumar(JTextField pvalor, JTextField svalor, JButton suma, JLabel resultado) {
		suma.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
            	resultado.setText("Resultado: ");
            	String numero1 = pvalor.getText();
            	String numero2 = svalor.getText();
            	int numeroint = Integer.parseInt(numero1);
            	int numeroint2 = Integer.parseInt(numero2);
            	int resultadosuma = numeroint + numeroint2;
            	resultado.setText(resultado.getText() + resultadosuma);
            }
        });
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
