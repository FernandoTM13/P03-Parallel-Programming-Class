package tareaSemana3;

public class TareaHiloJava {

	public static void main(String args[]) {
		Thread hilo1 = new Thread(new FuncionesHilos(10), "Hilo 1");
		Thread hilo2 = new Thread(new FuncionesHilos(10), "Hilo 2");

		hilo1.start();
		hilo2.start();
	}		
}

class FuncionesHilos implements Runnable{
	
	int veces;
	
	public FuncionesHilos(int veces) {
		this.veces = veces;
	}
	
	
	@Override
	public void run() {
			
		for (int i = 0; i < veces; i++) {
			System.out.println(Thread.currentThread().getName() + " - " + i);
		}			
	}
}
