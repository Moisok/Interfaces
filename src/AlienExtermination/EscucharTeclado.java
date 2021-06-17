package AlienExtermination;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
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
		private int movimiento = 10;
		private int balas;
		private musica_y_sonidos laser_gun = new musica_y_sonidos();
		
		//Timer para el disparo, esto hace que la bala vaya subiendo hacia arriba
		Timer timer = new Timer(30, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            	disparo.setVisible(true);
				disparo.setLocation(posiciondisparo, disparoV);
				disparoV = disparoV - movimiento;
				if (disparoV == 0) {
					disparo.setVisible(false);
					disparoV = 480;
					disparo.setLocation(posiciondisparo, disparoV);
					timer.stop();
				}
            }
        });
		
		public EscucharTeclado (starship nave, Shoot disparo, int balas) {
			this.nave = nave;
			this.disparo = disparo;
			this.balas = balas;
		}
	

		//Esto caputra las teclas de la clase principal ademas limita que la nave no pueda moverse mas haya de los bordes (izquierda y derecha)
		//Se han asignado 3 teclas la tecla derecha, la tecla izquierda y el espacio que es para disparar, cuando disparamos con el espacio
		//iniciamos el timer para que la bala salga disparada hacia arriba
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
				disparo.setLocation(posiciondisparo, disparoV);
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
				disparo.setLocation(posiciondisparo, disparoV);
				if (posicion < 100) {
					posicion = 80;
					nave.setLocation(80, 500); 
					disparo.setLocation(80, 480);
				}
				break;
			
			case KeyEvent.VK_SPACE:
				laser_gun.musica_y_sonidos("alien_9.wav");
				balas = balas -1;
				timer.start();
				break;
			}
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
			
	}
		//Getter para devolver balas
		public int getBalas() {
			return balas;
		}
		
}
