package HilosSincronizadosAct5;

public class HiloLectorCro implements Runnable {
	
	DatoC d;
	
	public HiloLectorCro(DatoC d) {
		this.d = d;
	}
	
	
	
	@Override
	public void run() {		
		try {
			int segundos = 0, minutos = 0;

			while (true) {
				segundos = d.Obtener();
				segundos++;
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}
}
