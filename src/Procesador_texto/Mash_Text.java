package Procesador_texto;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;
import javax.swing.border.Border;

public class Mash_Text  extends JFrame{
	
	private JMenuItem nuevo;
	private JMenuItem guardar;
	private JMenuItem abrir;
	private JMenuItem salir;
	private JMenu files;
	private JMenuBar menup;
	private JTextArea mostrar;

	public Mash_Text () {
		setTitle("Mash_Text");
		setSize(800,600);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Tipos de fuentes
		Font letra1 = new Font("Arial", Font.BOLD,  20);
				
		//Mostrar
		mostrar = new JTextArea (" ");
		mostrar.setBounds(50,55,700,500);

		//Menu
		menup = new JMenuBar ();
		setJMenuBar(menup);
		
		//Barra File
		files = new JMenu ("File");
		nuevo = new JMenuItem ("Nuevo");
		abrir = new JMenuItem ("Abrir");
		guardar = new JMenuItem ("Guardar");
		salir = new JMenuItem ("Salir");

		
		//JPanel
		JPanel principal = new JPanel();
		principal.setLayout(null);
		principal.setBackground(Color.GRAY);

		
		//Contenedor
		Container contenedor = getContentPane();
		
		//Aniadir cosas
		contenedor.add(principal);
		principal.add(mostrar);
		principal.add(menup);
		
		//Aniadir menu barra
		menup.add(files); 
		
		//Aniadir menu 
		files.add(nuevo);
		files.add(guardar);
		files.add(abrir);
		files.add(salir);
		
		//Eventos
		//Salir
		salir.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent ev) {
	                System.exit(0);
	        }
	    });
		
		//Guardar
		guardar.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent ev) {
	        	javax.swing.JFileChooser jF1= new javax.swing.JFileChooser();
	            String ruta = "";
	             try{
	                if(jF1.showSaveDialog(null)==jF1.APPROVE_OPTION){
	                  ruta = jF1.getSelectedFile().getAbsolutePath();
	                  FileWriter archivo = new FileWriter (ruta);
	                  archivo.write(mostrar.getText());
	                  archivo.close();
	                  
	                //Aqui ya tiens la ruta,,,ahora puedes crear un fichero n esa ruta y escribir lo k kieras...
	                }
	              }catch (Exception ex){
	                ex.printStackTrace();
	              }
	        }
	    });
		
		//Abrir
		abrir.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent ev) {
	        	mostrar.setText(abrirArchivo());
	        }
	    });
		
		//Nuevo
		nuevo.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent ev) {
	        	mostrar.setText("");
	        }
	    });
	//Fin constructor	
	}
	
	
	//Funcion para abrir archivos
	private String abrirArchivo() {
		  String aux="";   
		  String texto="";
		  try
		  {
		   /**llamamos el metodo que permite cargar la ventana*/
		   JFileChooser file=new JFileChooser();
		   file.showOpenDialog(this);
		   /**abrimos el archivo seleccionado*/
		   File abre=file.getSelectedFile();

		   /**recorremos el archivo, lo leemos para plasmarlo
		   *en el area de texto*/
		   if(abre!=null)
		   {     
		      FileReader archivos=new FileReader(abre);
		      BufferedReader lee=new BufferedReader(archivos);
		      while((aux=lee.readLine())!=null)
		      {
		         texto+= aux+ "\n";
		      }
		         lee.close();
		    }    
		   }
		   catch(IOException ex)
		   {
		     JOptionPane.showMessageDialog(null,ex+"" +
		           "\nNo se ha encontrado el archivo",
		                 "ADVERTENCIA!!!",JOptionPane.WARNING_MESSAGE);
		    }
		  return texto;//El texto se almacena en el JTextArea
		}


		
	
	
	
	//Clase principal
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                try {
	                	Mash_Text frame = new Mash_Text();
	                    frame.setVisible(true);
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        });

	}

}
