package tareaSemana3;

public class RepracticaHilos {
	public static void main(String args[]) {
		
		Thread hilo1 = new Thread( new SoporteHilos(5), "Hilos 1");
		Thread hilo2 = new Thread( new SoporteHilos(5), "Hilos 2");
		
		
		hilo1.start();
		hilo2.start();
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}


class SoporteHilos implements Runnable{

	int veces;
	public SoporteHilos(int veces) {
		this.veces = veces;
		
	}
	
	
	@Override
	public void run() {

		for (int i = 0; i < veces; i++) {
			System.out.println( Thread.currentThread().getName() + " - " + i);
		}
	}
	
	
	
}