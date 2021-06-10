package AlienExtermination;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

//Clase para el movimiento de la nave 
	/**@author Moises Sepulveda**/ 
	/**Prueba comentario**/
	public class EscucharTeclado implements KeyListener {
		//Variables
		private Shoot disparo;
		private starship nave;
		private int posicion = 400;
		private int posiciondisparo = 420;
		private int disparoV = 480;
		private int movimiento = 20;
		
		//Timer para el disparo
		Timer timer = new Timer(30, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            	disparo.setVisible(true);
				disparo.setLocation(posiciondisparo, disparoV);
				disparoV = disparoV - movimiento;
				if (disparoV == 15) {
					disparo.setVisible(false);
					disparoV = 480;
					disparo.setLocation(posiciondisparo, disparoV);
					timer.stop();
				}
            }
        });
		
		public EscucharTeclado (starship nave, Shoot disparo) {
			this.nave = nave;
			this.disparo = disparo;
		}
	
		@Override
		public void keyTyped(KeyEvent e) {
		}

		@Override
		public void keyPressed(KeyEvent e) {
			switch (e.getKeyCode()) {
			
			case KeyEvent.VK_RIGHT:
				posicion = posicion + movimiento;
				posiciondisparo = posiciondisparo + movimiento;
				nave.setLocation(posicion, 500);
				disparo.setLocation(posiciondisparo, 480);
				if (posicion >= 700) {
					posicion = 700;
					nave.setLocation(680, 500); 
					disparo.setLocation(680, 480); 
				}
				break;
				
			case KeyEvent.VK_LEFT:
				posicion = posicion - movimiento;
				posiciondisparo = posiciondisparo - movimiento;
				nave.setLocation(posicion, 500);
				disparo.setLocation(posiciondisparo, 480);
				if (posicion < 100) {
					posicion = 80;
					nave.setLocation(80, 500); 
					disparo.setLocation(80, 480);
				}
				break;
			
			case KeyEvent.VK_SPACE:
				timer.start();
				break;
			}
		}
		@Override
		public void keyReleased(KeyEvent e) {
			
	}
		
}
	
