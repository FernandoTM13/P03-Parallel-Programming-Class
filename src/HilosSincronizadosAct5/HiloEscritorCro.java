package HilosSincronizadosAct5;

public class HiloEscritorCro implements Runnable {

	DatoC d;
	public HiloEscritorCro(DatoC d) {
		this.d = d;
	}
	
	
	@Override
	public void run() {
		try {
			int segundos = 0, minutos = 0;
			while (true) {

				if (segundos ==60) {
					minutos++;
					segundos = 0;
				}
				d.Asignar(segundos,minutos);
				segundos = segundos + 2;
			}
			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}

}
