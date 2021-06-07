package BurguerQueen;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.*;
//...
 
public class starship extends JPanel {
	public void PanelImagen() {
		this.setSize(100,200);
	}
	
	@Override
	public void paintComponent(Graphics G) {
		Dimension tamanio = getSize();
		ImageIcon imagenFondo = new ImageIcon(getClass().getResource("starship.png")); //La imagen se pone en la carpeta raiz del workspace
		G.drawImage(imagenFondo.getImage(), 0, 0, tamanio.width, tamanio.height, null);
		setOpaque(false);
		super.paintComponent(G);
	}
}