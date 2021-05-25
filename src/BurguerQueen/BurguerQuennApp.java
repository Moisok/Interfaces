package BurguerQueen;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;



public class BurguerQuennApp extends JFrame{

	//Variables y artributos
	private JLabel menu;
	private JLabel hamburguesa;
	private JLabel pan;
	private JLabel papas;
	private JLabel bebida;
	private JLabel extras;
	private JLabel salsas;
	private JLabel sket;
	private JLabel smos;
	private JLabel sbb;
	private JLabel syogur;
	private JLabel mensaje;
	private JLabel mensaje2;
	private JRadioButton pollo;
	private JRadioButton cerdo;
	private JRadioButton ternera;
	private JRadioButton vegana;
	private ButtonGroup opburguer;
	private JRadioButton normal;
	private JRadioButton integral;
	private JRadioButton centeno;
	private ButtonGroup oppan;
	private JRadioButton fritas;
	private JRadioButton gajo;
	private JRadioButton caseras;
	private ButtonGroup oppapas;
	private JRadioButton cola;
	private JRadioButton naranja;
	private JRadioButton limon;
	private JRadioButton agua;
	private JRadioButton cerveza;
	private ButtonGroup opbebidas;
	private JCheckBox doble;
	private JCheckBox doblequeso;
	private JCheckBox doblepapas;
	private JSpinner ketchup;
	private JSpinner mostaza;
	private JSpinner bbq;
	private JSpinner yogur;
	private JRadioButton domicilio;
	private JRadioButton recogida;
	private JTextField resultados;
	private JButton calcular;
	private JButton reiniciar;
	
	public BurguerQuennApp() {
	
		//Titulo y cosas
		setTitle("McMoisok's burguer");
		setSize(420,700);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Toolkit predeterminado=Toolkit.getDefaultToolkit();
		Image icono=predeterminado.getImage("Icono.gif");
		setIconImage(icono);
		
		//Fuentes 
		Font letra1 = new Font("Rufscript", Font.BOLD, 15);
		Font letra2 = new Font("Linux Biolinum Keyboard O", Font.BOLD, 20);
		
		//Modificacion de variables
		//Letras del menu
		menu = new JLabel("Menu basico");
		menu.setForeground(Color.red);
		menu.setFont(letra2);
		menu.setBounds(10, 10, 300, 22);
		
		//Hamburguesa
		hamburguesa = new JLabel("Hamburguesa");
		hamburguesa.setForeground(Color.blue);
		hamburguesa.setFont(letra1);
		hamburguesa.setBounds(10, 40, 100, 22);
		
		//tipo de pan
		pan = new JLabel("Pan");
		pan.setForeground(Color.blue);
		pan.setFont(letra1);
		pan.setBounds(150, 40, 100, 22);
		
		//tipo de papas
		papas = new JLabel("Patatas");
		papas.setForeground(Color.blue);
		papas.setFont(letra1);
		papas.setBounds(250, 40, 100, 22);
		
		//Bebida
		bebida = new JLabel("Bebida");
		bebida.setForeground(Color.blue);
		bebida.setFont(letra1);
		bebida.setBounds(10, 200, 100, 22);
		
		//Extras
		extras = new JLabel("Complementos/Adiconales");
		extras.setForeground(Color.blue);
		extras.setFont(letra1);
		extras.setBounds(10, 260, 210, 22);
		
		//Salsas
		salsas = new JLabel("Salsas (0,50 cada 1)");
		salsas.setForeground(Color.blue);
		salsas.setFont(letra1);
		salsas.setBounds(200, 280, 210, 22);
		
		
		//Opciones burguer
		pollo= new JRadioButton("Pollo");
        pollo.setBounds(15, 70, 109, 23);
        cerdo= new JRadioButton("Cerdo");
        cerdo.setBounds(15, 100, 109, 23);
        ternera= new JRadioButton("Ternera (1€)");
        ternera.setBounds(15, 130, 109, 23);
        vegana= new JRadioButton("Vegana (1€)");
        vegana.setBounds(15, 160, 109, 23);
        opburguer = new ButtonGroup();
        opburguer.add(pollo);
        opburguer.add(cerdo);
        opburguer.add(ternera);
        opburguer.add(vegana);
        
        //Opciones de pan
        normal= new JRadioButton("Normal");
        normal.setBounds(135, 70, 109, 23);
        integral= new JRadioButton("Integral");
        integral.setBounds(135, 100, 109, 23);
        centeno= new JRadioButton("Centeno");
        centeno.setBounds(135, 130, 109, 23);
        oppan = new ButtonGroup();
        oppan.add(normal);
        oppan.add(integral);
        oppan.add(centeno);
        
        //Opciones patatas
        fritas= new JRadioButton("Fritas");
        fritas.setBounds(255, 70, 109, 23);
        gajo= new JRadioButton("Gajo");
        gajo.setBounds(255, 100, 109, 23);
        caseras= new JRadioButton("Centeno");
        caseras.setBounds(255, 130, 109, 23);
        oppapas = new ButtonGroup();
        oppapas.add(fritas);
        oppapas.add(gajo);
        oppapas.add(caseras);
        
        //Opciones de bebida
        cola= new JRadioButton("Cola");
        cola.setBounds(5, 230, 80, 23);
        naranja= new JRadioButton("Naranja");
        naranja.setBounds(100, 230, 80, 23);
        limon= new JRadioButton("Limon");
        limon.setBounds(195, 230, 80, 23);
        agua= new JRadioButton("Agua");
        agua.setBounds(285, 230, 80, 23);
        opbebidas = new ButtonGroup();
        opbebidas.add(cola);
        opbebidas.add(naranja);
        opbebidas.add(limon);
        opbebidas.add(agua);
        
        //Salsas
        sket = new JLabel ("Ketchup");
        sket.setBounds(200, 325, 80, 20);
        ketchup = new JSpinner ();
        ketchup.setBounds(260, 325, 40, 20);
        
        sbb= new JLabel ("BBQ");
        sbb.setBounds(200, 355, 40, 20);
        bbq = new JSpinner ();
        bbq.setBounds(260, 355, 40, 20);
        
        smos= new JLabel ("Mostaza");
        smos.setBounds(310, 325, 80, 20);
        mostaza = new JSpinner ();
        mostaza.setBounds(370, 325, 40, 20);
        
        syogur= new JLabel ("Yogur");
        syogur.setBounds(310, 355, 80, 20);
        yogur = new JSpinner ();
        yogur.setBounds(370, 355, 40, 20);
        
        //Extras
        doble = new JCheckBox("Doble burguer: 2€");
        doble.setBounds(10, 295, 150, 20);
        
        doblequeso = new JCheckBox("Doble queso: 0,50€");
        doblequeso.setBounds(10, 325, 150, 20);
        
        doblepapas = new JCheckBox("Doble papas: 1€");
        doblepapas.setBounds(10, 355, 150, 20);
        
        //Domicilio
        domicilio= new JRadioButton("Domicilio 5€");
        domicilio.setForeground(Color.blue);
        domicilio.setBounds(80, 400, 109, 23);
        recogida= new JRadioButton("En local");
        recogida.setForeground(Color.blue);
        recogida.setBounds(200, 400, 109, 23);
        oppan = new ButtonGroup();
        oppan.add(domicilio);
        oppan.add(recogida);
        
        //BOTON PARA CALCULAR
        calcular= new JButton ("Calcula");
		calcular.setBounds(150, 450, 100, 30);
		
		//Boton de reinicio
		reiniciar= new JButton ("Reiniciar");
		reiniciar.setBounds(10, 450, 100, 30);
		
		//Nota
		mensaje= new JLabel ("El precio base del menu son 10 euros");
		mensaje.setFont(letra1);
        mensaje.setBounds(80, 550, 500, 100);
        
        mensaje2= new JLabel ("(Sin calcular el iva (10%))");
		mensaje2.setFont(letra1);
        mensaje2.setBounds(80, 570, 500, 100);
		
        
		//Total
		resultados = new JTextField();
		resultados.setHorizontalAlignment(JTextField.CENTER);
		resultados.setBackground(Color.red);
		resultados.setEditable(false);
		resultados.setBounds(150, 500, 100, 50);
		
		
		//Creacion de panel
		JPanel elementos = new JPanel();
		elementos.setBackground(Color.orange);
		elementos.setLayout(null);
		
		//Contenedor
		Container contenedor = getContentPane();
		
		//Aniadir cosas
		contenedor.add(elementos);
		elementos.add(menu);
		elementos.add(hamburguesa);
		elementos.add(pan);
		elementos.add(papas);
		elementos.add(pollo);
		elementos.add(cerdo);
		elementos.add(ternera);
		elementos.add(vegana);
		elementos.add(normal);
		elementos.add(integral);
		elementos.add(centeno);
		elementos.add(fritas);
		elementos.add(gajo);
		elementos.add(caseras);
		elementos.add(bebida);
		elementos.add(cola);
		elementos.add(naranja);
		elementos.add(limon);
		elementos.add(agua);
		elementos.add(extras);
		elementos.add(doble);
		elementos.add(doblequeso);
		elementos.add(doblepapas);
		elementos.add(salsas);
		elementos.add(sket);
		elementos.add(ketchup);
		elementos.add(sbb);
		elementos.add(bbq);
		elementos.add(smos);
		elementos.add(mostaza);
		elementos.add(syogur);
		elementos.add(yogur);
		elementos.add(domicilio);
		elementos.add(recogida);
		elementos.add(calcular);
		elementos.add(resultados);
		elementos.add(mensaje);
		elementos.add(mensaje2);
		elementos.add(reiniciar);
		
		
		//Evento de calcular
		FuncionCalcula(calcular, reiniciar, resultados);
		
		
	//Fin de constructor	
	}

	
	//Funcion para calcular
	private void FuncionCalcula(JButton calcular, JButton reiniciar, JTextField resultados) {
		calcular.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
            	double precio = 10;
            	int vketchup = (int)ketchup.getValue();
            	double vvketchup = vketchup*0.5;
            	int vmostaza = (int)mostaza.getValue();
            	double vvmostaza = vmostaza*0.5;
            	int vyogur = (int)yogur.getValue();
            	double vvyogur = vyogur*0.5;
            	int vbbq = (int)bbq.getValue();
            	double vvbbq = vbbq*0.5;
            	  if (ternera.isSelected() | vegana.isSelected()  ) {
                  	precio = precio +1;
                  }
            	  if (doble.isSelected() ) {
                  	precio = precio + 2;
                  }
            	  if (doblequeso.isSelected() ) {
                    	precio = precio + 0.50;
                    }
            	  if (doblepapas.isSelected() ) {
                  	precio = precio + 1;
                  }
            	  if (domicilio.isSelected() ) {
                    	precio = precio + 5;
                    }
            	double total = precio + vvketchup + vvmostaza + vvyogur + vvbbq;
            	double iva = total * 0.10;
            	double totalconiva = total + iva;
            	resultados.setText(totalconiva + " " + "€"); 
            	reiniciar.addActionListener(new ActionListener(){
        			public void actionPerformed (ActionEvent e){
        				double totalconiva = 0;
        				resultados.setText(totalconiva + " " + "€"); 
        			}
        		});	
            }
        });
	}
	
	
	//Clase Principal
	public static void main(String[] args) {
		 EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                try {
	                	BurguerQuennApp frame = new BurguerQuennApp();
	                    frame.setVisible(true);
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        });
	}
	//Fin de la clase
}
