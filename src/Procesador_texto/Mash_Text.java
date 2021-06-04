package Procesador_texto;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.font.TextAttribute;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.text.DefaultEditorKit;
import javax.swing.text.EditorKit;
import javax.swing.text.StyledEditorKit;

import org.w3c.dom.Text;

public class Mash_Text  extends JFrame{
	
	private JMenuItem nuevo;
	private JMenuItem guardar;
	private JMenuItem abrir;
	private JMenuItem salir;
	private JMenu files;
	private JMenuBar menup;
	private JTextArea mostrar;
	private JSpinner tamanio;
	private JComboBox<String> comboBox;
	
	//Botones
	private JButton negrita;
	private JButton cursiva;
	private JButton subr;

	//Variables
	 private int tamanio_letra = 12;
	
	public Mash_Text () {
		setTitle("Mash_Text");
		setSize(800,1000);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Toolkit predeterminado=Toolkit.getDefaultToolkit();
		Image icono=predeterminado.getImage("ms.png");
		setIconImage(icono);
		
		//Tipos de fuentes
		Font letra1 = new Font("Arial", Font.BOLD,  tamanio_letra);
		Font letra2 = new Font("Arial", Font.ITALIC,  tamanio_letra);
		Font letra3 = new Font("Arial", TextAttribute.UNDERLINE_ON, tamanio_letra);
		
		//Tipos de letra
		Font Arial = new Font ("Arial", tamanio_letra, tamanio_letra);
		Font serif = new Font ("Liberation Serif", tamanio_letra, tamanio_letra);
		Font Caladea = new Font ("Caladea", tamanio_letra, tamanio_letra);
		
        comboBox = new JComboBox<>();
        comboBox.setSize(60,50);
 
        //A�adimos opciones
        comboBox.addItem("Arial");
        comboBox.addItem("Liberation serif");
        comboBox.addItem("Caladea");
		
				
		//Mostrar
		mostrar = new JTextArea (" ");
		mostrar.setBounds(0,60,800,1000);

		//Menu
		menup = new JMenuBar ();
		setJMenuBar(menup);
		
		//Barra File
		files = new JMenu ("Archivo");
		nuevo = new JMenuItem ("Nuevo");
		abrir = new JMenuItem ("Abrir");
		guardar = new JMenuItem ("Guardar");
		salir = new JMenuItem ("Salir");
		
		//Barra editar
		  JMenu editMenu = new JMenu("Editar");

	      Action cutAction = new DefaultEditorKit.CutAction();
	      cutAction.putValue(Action.NAME, "Cortar");
	      editMenu.add(cutAction);

	      Action copyAction = new DefaultEditorKit.CopyAction();
	      copyAction.putValue(Action.NAME, "Copiar");
	      editMenu.add(copyAction);

	      Action pasteAction = new DefaultEditorKit.PasteAction();
	      pasteAction.putValue(Action.NAME, "Pegar");
	      editMenu.add(pasteAction);
	      
	   
	      //Submenu con Opciones
	      negrita = new JButton ("N");
	      negrita.setFont(letra1);
	      negrita.setSize(60,50);
	      
	      //Cursiva
	     cursiva = new JButton ("C");
	     cursiva.setFont(letra2);
	     cursiva.setSize(60,50);
	     
	     //Subrayado
	     subr = new JButton ("N");
	     subr.setFont(letra3);
	     subr.setSize(60,50);
	     
	     //Color
	     //JColorChooser dialogoColor = new JColorChooser(Color.BLUE);
	     JButton color = new JButton ("Color");
	     color.setSize(100,50);
	     
	      
		//Barra Help
		JMenu help = new JMenu ("Ayuda");
		JMenuItem ABOUT = new JMenuItem ("Sobre Mash Text");
		
		//Barra de herramientas
		JToolBar barra = new JToolBar();
		
		barra.setBounds(0, 25, 800, 30);
		
		barra.setFloatable(false); //impide que se pueda mover de sitio

		barra.setOrientation(JToolBar.HORIZONTAL); // pone la orientación vertical
		
		//Tamanio de texto
		JButton confirmar = new JButton ("Apply");
		confirmar.setSize(60,70);
		tamanio = new JSpinner ();
		tamanio.setSize(60,50);

		
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
		principal.add(barra);
		
		//Aniadir menu barra
		menup.add(files); 
		menup.add(editMenu);
		menup.add(help);
		
		//Aniadir menu 
		files.add(nuevo);
		files.add(guardar);
		files.add(abrir);
		files.add(salir);
		
		//Opciones ayuda
		help.add(ABOUT);
		
		//Barra de heraamientas
		barra.add(cursiva);
		barra.add(negrita); 
		barra.add(subr); 
		barra.add(color);
		barra.add(tamanio);
		barra.add(comboBox);
		barra.add(confirmar);
		
		
		
		//Eventos
		//Tamanio letra
		confirmar.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent ev) {
	            tamanio_letra = (int)tamanio.getValue();
	            mostrar.setFont(new Font(comboBox.getSelectedItem().toString(), Font.BOLD,  tamanio_letra));
	            /*if () {
	            	mostrar.setFont(new Font("Arial", Font.BOLD,  tamanio_letra));
	            }
	            if (comboBox.equals("serif")) {
	            	mostrar.setFont(new Font("Liberation Serif", Font.BOLD, tamanio_letra));
	            }*/
	        	
	        }
	    });
		
		
		//Salir
		salir.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent ev) {
	                System.exit(0);
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
		
		//AYUDA
		ABOUT.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent ev) {
	        	 JOptionPane.showMessageDialog(getContentPane(), "Programa creado por Moisok  \n"
	        	 		+ "Para la practica de programacion (DAM) de IES BENIGASLO");
	        }
	    });
		
		//Negrita
		negrita.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent ev) {
	        	mostrar.setFont(letra1);
	        }
	    });
		
		//Cursiva
		cursiva.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent ev) {
	        	mostrar.setFont(letra2);
	        }
	    });
		
		//Subrayado
		subr.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent ev) {
	        	   Font font = mostrar.getFont();
	               Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
	               attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
	               mostrar.setFont(font.deriveFont(attributes));
	        }
	    });
		
		//Color
		color.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent ev) {
	        	Color c = JColorChooser.showDialog(getContentPane(), "Selecciona el color", Color.BLUE);
	        	mostrar.setForeground(c);
	        	color.setBackground(c);
	        	
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

		
	//Funcion Fuentes
	/*private void loadFont() {
		GraphicsEnvironment gEnv = GraphicsEnvironment.getLocalGraphicsEnvironment();
		// get all font name&amp;amp;amp;amp;nbsp;
		String[] fontNames = gEnv.getAvailableFontFamilyNames();
		// load to combobox
		ComboBoxModel model = new DefaultComboBoxModel(fontNames);
		jcbFont.setModel(model);
		}*/
	
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
