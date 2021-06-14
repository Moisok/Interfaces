package AlienExtermination;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.*;
//...
 
public class Shoot extends JPanel {
	public Shoot() {
		this.setSize(20,50);
	}
	
	@Override
	public void paintComponent(Graphics G) {
		Dimension tamanio = getSize();
		ImageIcon imagenFondo = new ImageIcon(getClass().getResource("shoot.png")); //La imagen se pone en la carpeta raiz del workspace
		G.drawImage(imagenFondo.getImage(), 0, 0, tamanio.width, tamanio.height, null);
		setOpaque(false);
		super.paintComponent(G);
	}


}