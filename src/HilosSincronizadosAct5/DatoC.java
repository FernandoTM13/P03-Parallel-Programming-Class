package HilosSincronizadosAct5;

public class DatoC {
	
	private boolean disponible;
	private int minutos= 0;
	private int segundos= 0;
    static Formulario objeto;
    
	public static void main(String args[]) {
		
		objeto = new Formulario();
		objeto.setVisible(true);
	}

    
    
    public DatoC()
    {  disponible=false; 
    }
    
    public synchronized void Asignar(int segundosEnviados, int minutosEnviados)
    {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {	}
		
        if(disponible==true)
        {
            try 
            {
                wait();
            } catch (Exception e) {
            }
        }
        
        segundos = segundosEnviados;
        minutos = minutosEnviados;
        
        objeto.p2.setVisible(false);
        objeto.p1.setVisible(true);
        objeto.l1.setText(minutos + " min: " +  segundos  + " seg");
        objeto.l2.setVisible(false);
        objeto.l1.setVisible(true);
        
        disponible=true;
        notify();
    }
    
    public synchronized int Obtener()
    { 
    	try {
			Thread.sleep(1000);
		} catch (Exception e) {	}
    	
        if(disponible==false)
        {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        
        
        objeto.p1.setVisible(false);
        objeto.p2.setVisible(true);
        objeto.l2.setText(minutos + " min: " +  (segundos +1)+ " seg");
        objeto.l1.setVisible(false);
        objeto.l2.setVisible(true);
        
        disponible=false;
        notify();              
        return segundos; 
    }
}
