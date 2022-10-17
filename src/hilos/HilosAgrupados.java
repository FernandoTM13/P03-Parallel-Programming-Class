package hilos;

public class HilosAgrupados {

	public static void main(String args[]){

	HiloParaAgrupado claseH = new HiloParaAgrupado();
	
	ThreadGroup grupoA = new ThreadGroup("Grupo A");
	
	
	Thread hilo1 = new Thread(grupoA, claseH, "Hilo 1");
	Thread hilo2 = new Thread(grupoA, claseH, "Hilo 2");
	
	int contadorHilos = grupoA.activeCount();
	System.out.println("Número de Hilos: " + contadorHilos);
	
	hilo1.start();
	hilo2.start();
	
	grupoA.list();
	
		
	}
	
}
