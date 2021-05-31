package Aprobar_trol;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.border.Border;

public class Aprobar extends JFrame {
	//Variables
	private JLabel mensaje;
	private JButton si;
	private JButton si2;
	private JButton no;
	
	

	public Aprobar() {
		PanelImagen p = new PanelImagen();
		setTitle("Gandul V.0.1");
		setSize(300,200);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		//Fuentes
		Font letra1 = new Font("Rufscript", Font.BOLD,  20);
		
		//Mensaje
		mensaje = new JLabel ("Vas a aprobar DAM?");
		mensaje.setForeground(Color.red);
		mensaje.setBounds(50,25,200,30);
		mensaje.setFont(letra1);
		
		//Botones
		si= new JButton ("Sí");
		si.setBounds(90,75,50,20);
		si2= new JButton ("Sí");
		si2.setVisible(false);
		si2.setBounds(120,150,50,20);
		no= new JButton ("no");
		no.setBounds(150,75,50,20);
		//Paneles
		JPanel principal = new JPanel();
		principal.setLayout(null);
	
		
		//Contenedor
		Container contenedor = getContentPane();
		
		//Añadir cosas
		contenedor.add(principal);
		
		principal.add(mensaje);
		principal.add(si);
		principal.add(no);
		principal.add(si2);
		principal.add(p);
	
		
		//EVENTOS
		si.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent e){
 
            }
            public void mouseEntered(MouseEvent e){
            	si.setVisible(false);
            	si2.setVisible(true);
            }
            public void mouseExited(MouseEvent e){
            	
            }
            public void mousePressed(MouseEvent e){
 
            }
            public void mouseReleased(MouseEvent e){
 
            }
        });
		
		si2.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent e){
 
            }
            public void mouseEntered(MouseEvent e){
            	si2.setVisible(false);
            	si.setVisible(true);
            }
            public void mouseExited(MouseEvent e){
            	
            }
            public void mousePressed(MouseEvent e){
 
            }
            public void mouseReleased(MouseEvent e){
 
            }
        });
		
	no.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent e){
            	JOptionPane.showMessageDialog(null, "Pues haber 'estudiao'");
            }
            public void mouseEntered(MouseEvent e){
            	
            }
            public void mouseExited(MouseEvent e){
            	
            }
            public void mousePressed(MouseEvent e){
 
            }
            public void mouseReleased(MouseEvent e){
 
            }
        });
		
		
	}
		
	public void imagen(Graphics g) {
		Dimension tamanio=getSize();
		
	}
		
	

	
	//Clase main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                try {
	                	Aprobar frame = new Aprobar();
	                    frame.setVisible(true);
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        });

	}

}
