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



public class BurguerQueenV2 extends JFrame{

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
	
	//Paneles
	
	
	public BurguerQueenV2() {
	
		//Titulo y cosas
		setTitle("McMoisok's burguer V2");
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
		
		
		//Hamburguesa
		hamburguesa = new JLabel("Hamburguesa");
		hamburguesa.setForeground(Color.blue);
		hamburguesa.setFont(letra1);
	
		
		//tipo de pan
		pan = new JLabel("Pan");
		pan.setForeground(Color.blue);
		pan.setFont(letra1);
		
		
		//tipo de papas
		papas = new JLabel("Patatas");
		papas.setForeground(Color.blue);
		papas.setFont(letra1);
	
		
		//Bebida
		bebida = new JLabel("Bebida");
		bebida.setForeground(Color.blue);
		bebida.setFont(letra1);
		
		
		//Extras
		extras = new JLabel("Complementos/Adiconales");
		extras.setForeground(Color.blue);
		extras.setFont(letra1);
		
		
		//Salsas
		salsas = new JLabel("Salsas (0,50 cada 1)");
		salsas.setForeground(Color.blue);
		salsas.setFont(letra1);
	
		
		
		//Opciones burguer
		pollo= new JRadioButton("Pollo",true);
		pollo.setOpaque(false);
     
        cerdo= new JRadioButton("Cerdo");
        cerdo.setOpaque(false);
  
        ternera= new JRadioButton("Ternera (1€)");
        ternera.setOpaque(false);
      
        vegana= new JRadioButton("Vegana (1€)");
        vegana.setOpaque(false);
     
        opburguer = new ButtonGroup();
        opburguer.add(pollo);
        opburguer.add(cerdo);
        opburguer.add(ternera);
        opburguer.add(vegana);
        
        //Opciones de pan
        normal= new JRadioButton("Normal",true);
        normal.setOpaque(false);

        integral= new JRadioButton("Integral");
        integral.setOpaque(false);
    
        centeno= new JRadioButton("Centeno");
        centeno.setOpaque(false);
      
        oppan = new ButtonGroup();
        oppan.add(normal);
        oppan.add(integral);
        oppan.add(centeno);
        
        //Opciones patatas
        fritas= new JRadioButton("Fritas",true);
        fritas.setOpaque(false);
   
        gajo= new JRadioButton("Gajo");
        gajo.setOpaque(false);
    
        caseras= new JRadioButton("Onduladas");
        caseras.setOpaque(false);
     
        oppapas = new ButtonGroup();
        oppapas.add(fritas);
        oppapas.add(gajo);
        oppapas.add(caseras);
        
        //Opciones de bebida
        cola= new JRadioButton("Cola",true);
        cola.setOpaque(false);
    
        naranja= new JRadioButton("Naranja");
        naranja.setOpaque(false);
  
        limon= new JRadioButton("Limon");
        limon.setOpaque(false);

        agua= new JRadioButton("Agua");
        agua.setOpaque(false);

        opbebidas = new ButtonGroup();
        opbebidas.add(cola);
        opbebidas.add(naranja);
        opbebidas.add(limon);
        opbebidas.add(agua);
        
        //Salsas
        sket = new JLabel ("Ketchup");

        ketchup = new JSpinner ();

        
        sbb= new JLabel ("BBQ");

        bbq = new JSpinner ();
     
        
        smos= new JLabel ("Mostaza");
    
        mostaza = new JSpinner ();
    
        
        syogur= new JLabel ("Yogur");
    
        yogur = new JSpinner ();
       
        
        //Extras
        doble = new JCheckBox("Doble burguer: 2€");
        doble.setOpaque(false);
        
 
        
        doblequeso = new JCheckBox("Doble queso: 0,50€");
        doblequeso.setOpaque(false);
   
        
        doblepapas = new JCheckBox("Doble papas: 1€");
        doblepapas.setOpaque(false);
 
        
        //Domicilio
        domicilio= new JRadioButton("Domicilio 5€");
        domicilio.setOpaque(false);
        domicilio.setForeground(Color.blue);
  
        recogida= new JRadioButton("En local",true);
        recogida.setOpaque(false);
        recogida.setForeground(Color.blue);
 
        oppan = new ButtonGroup();
        oppan.add(domicilio);
        oppan.add(recogida);
        
        //BOTON PARA CALCULAR
        calcular= new JButton ("Calcula");

		
		//Boton de reinicio
		reiniciar= new JButton ("Reiniciar");
	
		
		//Nota
		mensaje= new JLabel ("El precio base del menu son 10 euros");
		mensaje.setFont(letra1);
 
        
        mensaje2= new JLabel ("(Sin calcular el iva (10%))");
		mensaje2.setFont(letra1);
  
		
        
		//Total
		resultados = new JTextField();
		resultados.setHorizontalAlignment(JTextField.CENTER);
		resultados.setSize(80, 60);
		resultados.setBackground(Color.red);
		resultados.setEditable(false);

		
		
		//Creacion de panel
		JPanel elementos = new JPanel();
		elementos.setBackground(Color.orange);
		
		
		JPanel Hamburguesas = new JPanel();
		Hamburguesas.setBackground(Color.orange);
		Hamburguesas.setLayout(new BoxLayout(Hamburguesas, BoxLayout.Y_AXIS)); 
		Hamburguesas.setBounds(10, 40, 100, 160);
		Hamburguesas.setBorder(BorderFactory.createLineBorder(Color.blue,2));
		
		JPanel panes = new JPanel();
		panes.setBackground(Color.orange);
		panes.setLayout(new BoxLayout(panes, BoxLayout.Y_AXIS)); 
		panes.setBounds(145, 40, 100, 160);
		panes.setBorder(BorderFactory.createLineBorder(Color.blue,2));
		
		JPanel papitas = new JPanel();
		papitas.setBackground(Color.orange);
		papitas.setLayout(new BoxLayout(papitas, BoxLayout.Y_AXIS)); 
		papitas.setBounds(280, 40, 100, 160);
		papitas.setBorder(BorderFactory.createLineBorder(Color.blue,2));
		
		JPanel liquidos = new JPanel();
		liquidos.setBackground(Color.orange);

		liquidos.setBounds(10, 240, 400, 40);
		liquidos.setBorder(BorderFactory.createLineBorder(Color.blue,2));
		
		JPanel complementitos = new JPanel();
		complementitos.setBackground(Color.orange);
		complementitos.setLayout(new BoxLayout(complementitos, BoxLayout.Y_AXIS)); 
		complementitos.setBounds(10, 290, 180, 150);
		complementitos.setBorder(BorderFactory.createLineBorder(Color.blue,2));
		
		JPanel salsitas = new JPanel();
		salsitas.setBackground(Color.orange);
		salsitas.setBounds(200, 290, 180, 150);
		salsitas.setBorder(BorderFactory.createLineBorder(Color.blue,2));
		
		JPanel envios = new JPanel();
		envios.setBackground(Color.orange);
		envios.setBounds(50, 450, 300, 40);
		envios.setBorder(BorderFactory.createLineBorder(Color.blue,2));
		
		JPanel finale = new JPanel();
		finale.setBackground(Color.orange);
		finale.setLayout(new BoxLayout(finale, BoxLayout.Y_AXIS)); 
		finale.setBounds(10, 500, 390, 155);
		finale.setBorder(BorderFactory.createLineBorder(Color.blue,2));
		
		
		//Contenedor
		Container contenedor = getContentPane();
		
		//Aniadir cosas
		contenedor.add(finale);
		contenedor.add(envios);
		contenedor.add(salsitas);
		contenedor.add(complementitos);
		contenedor.add(liquidos);
		contenedor.add(papitas);
		contenedor.add(panes);
		contenedor.add(Hamburguesas);
		contenedor.add(elementos);
		elementos.add(menu);
		Hamburguesas.add(hamburguesa);
		//elementos.add(pan);
		//elementos.add(papas);
		Hamburguesas.add(pollo);
		Hamburguesas.add(cerdo);
		Hamburguesas.add(ternera);
		Hamburguesas.add(vegana);
		panes.add(pan);
		panes.add(normal);
		panes.add(integral);
		panes.add(centeno);
		papitas.add(papas);
		papitas.add(fritas);
		papitas.add(gajo);
		papitas.add(caseras);
		liquidos.add(bebida);
		liquidos.add(cola);
		liquidos.add(naranja);
		liquidos.add(limon);
		liquidos.add(agua);
		complementitos.add(extras);
		complementitos.add(doble);
		complementitos.add(doblequeso);
		complementitos.add(doblepapas);
		salsitas.add(salsas);
		salsitas.add(sket);
		salsitas.add(ketchup);
		salsitas.add(sbb);
		salsitas.add(bbq);
		salsitas.add(smos);
		salsitas.add(mostaza);
		salsitas.add(syogur);
		salsitas.add(yogur);
		envios.add(domicilio);
		envios.add(recogida);
		finale.add(mensaje);
		finale.add(mensaje2);
		finale.add(resultados);
		finale.add(calcular);
		
		
		
		
		
		
		
		//Evento de calcular
		FuncionCalcula(calcular,resultados);
		
		
	//Fin de constructor	
	}

	
	//Funcion para calcular
	private void FuncionCalcula(JButton calcular, JTextField resultados) {
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
            	//Excepciones
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
            }
        });
	}
	
	
	//Clase Principal
	public static void main(String[] args) {
		 EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                try {
	                	BurguerQueenV2 frame = new BurguerQueenV2();
	                    frame.setVisible(true);
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        });
	}
	//Fin de la clase
}
