package AlienExtermination;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//Clase para el movimiento de la nave 
	public class EscucharTeclado implements KeyListener {
		
		private starship nave;
		private int posicion = 400;
		private int movimiento = 20;
		
		public EscucharTeclado (starship nave) {
			this.nave = nave;
		}
	
		@Override
		public void keyTyped(KeyEvent e) {
		}

		@Override
		public void keyPressed(KeyEvent e) {
			switch (e.getKeyCode()) {
			
			case KeyEvent.VK_RIGHT:
				posicion = posicion + movimiento;
				nave.setLocation(posicion, 500); 
				if (posicion >= 700) {
					posicion = 700;
					nave.setLocation(680, 500); 
				}
				break;
				
			case KeyEvent.VK_LEFT:
				posicion = posicion - movimiento;
				nave.setLocation(posicion, 500);
				if (posicion < 100) {
					posicion = 80;
					nave.setLocation(80, 500); 
				}
				break;
			
			case KeyEvent.VK_SPACE:
				System.out.println("Disparo"); 
				break;
			}
		}
		@Override
		public void keyReleased(KeyEvent e) {
			
	}
}
