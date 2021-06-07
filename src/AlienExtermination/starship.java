package AlienExtermination;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.*;
//...
 
public class starship extends JPanel {
	public starship() {
		this.setSize(60,80);
	}
	
	@Override
	public void paintComponent(Graphics G) {
		Dimension tamanio = getSize();
		ImageIcon nave = new ImageIcon(getClass().getResource("starship.png")); //La imagen se pone en la carpeta raiz del workspace
		G.drawImage(nave.getImage(), 0, 0, tamanio.width, tamanio.height, null);
		setOpaque(false);
		super.paintComponent(G);
	}
}