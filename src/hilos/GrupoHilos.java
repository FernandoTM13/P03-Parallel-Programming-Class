package hilos;


public class GrupoHilos implements Runnable{

	String nombreHilos = "";
	
	public GrupoHilos(String nombreHilos) {
		this.nombreHilos = nombreHilos;
	}

	
	@Override
	public void run() {
		
		try {
			for (int i = 0; i < 30; i++) {
				Thread.sleep(1000);
				System.out.println(nombreHilos);
			}
	
		} catch (Exception e) {		
			System.out.println("Problema: " + e.getMessage() );		
		}
	
	}

	
	public void mandarExcepcion(){
	
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
}
