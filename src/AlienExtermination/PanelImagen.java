package AlienExtermination;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.*;
//...
 
public class PanelImagen extends JPanel {
	public PanelImagen() {
		this.setSize(800,600);
	}
	
	@Override
	public void paintComponent(Graphics G) {
		Dimension tamanio = getSize();
		ImageIcon imagenFondo = new ImageIcon(getClass().getResource("ae.png")); //La imagen se pone en la carpeta raiz del workspace
		G.drawImage(imagenFondo.getImage(), 0, 0, tamanio.width, tamanio.height, null);
		setOpaque(false);
		super.paintComponent(G);
	}
}