package hilos;

import javax.swing.JOptionPane;

public class MainHilos {

	@SuppressWarnings("removal")
	public static void main(String args[]) {
		
		Thread hilo1 = new Thread(new GrupoHilos("Hilo 1"));
		Thread hilo2 = new Thread(new GrupoHilos("Hilo 2"));
		Thread hilo3 = new Thread(new GrupoHilos("Hilo 3"));

		String nombre1 = JOptionPane.showInputDialog("Introduce tu nombre");
		System.out.println("Nombre: " + nombre1);
		hilo1.start();
		hilo2.start();
		hilo3.start();
		hilo1.suspend();
		hilo1.resume();
		
		
		
	}
	
}
