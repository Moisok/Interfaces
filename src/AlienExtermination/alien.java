package AlienExtermination;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.*;
//...
 
public class alien extends JPanel {
	public alien() {
		this.setSize(60,80);
	}
	@Override
	public void paintComponent(Graphics G) {
		Dimension tamanio = getSize();
		ImageIcon nave = new ImageIcon(getClass().getResource("alien.png")); //La imagen se pone en la carpeta raiz del workspace
		G.drawImage(nave.getImage(), 0, 0, tamanio.width, tamanio.height, null);
		setOpaque(false);
		super.paintComponent(G);
	}
	

}