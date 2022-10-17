package hilos;

public class HiloParaAgrupado implements Runnable{

	@Override
	public void run() {

		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName() + " - Iteración " + i);
			try {
				Thread.sleep(50);
			} catch (Exception e) {
				System.out.println("Error: " + e);
			}
		}
		
		
	}

	
	
	
}
