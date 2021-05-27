package Aprobar_trol;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;




public class Aprobar extends JFrame {
	//Variables
	private JLabel mensaje;
	private JButton si;
	private JButton no;
	
	public Aprobar() {
		setTitle("Gandul V.0.1");
		setSize(300,200);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Fuentes
		Font letra1 = new Font("Rufscript", Font.BOLD, 25);
		
		//Mensaje
		mensaje = new JLabel ("Vas a aprobar DAM?");
		mensaje.setFont(letra1);
		
		//Botones
		si= new JButton ("Sí");
		no= new JButton ("no");
		
		//Paneles
		JPanel principal = new JPanel();
		
		//Contenedor
		Container contenedor = getContentPane();
		
		//Añadir cosas
		contenedor.add(principal);
		principal.add(mensaje);
		principal.add(si);
		principal.add(no);
		
		//EVENTOS
		si.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent e){
 
            }
            public void mouseEntered(MouseEvent e){
               si.setLocation(67, 23); //Random
            }
            public void mouseExited(MouseEvent e){
            	si.setLocation(0,0); 
            }
            public void mousePressed(MouseEvent e){
 
            }
            public void mouseReleased(MouseEvent e){
 
            }
        });
		
	}
	
	

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
