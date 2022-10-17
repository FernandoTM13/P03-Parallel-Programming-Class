package Principal;

public class Dato 
{
    private boolean disponible ;
    private int valor;
    
    public Dato()
    {   valor=0;
       disponible=false; 
    }
    
    public synchronized void Asignar(int  v)
    {
        if(disponible=true)
        {
            try 
            {
                wait();
            } catch (Exception e) {
            }
        }
           valor =v;
          System.out.println("Escribiendo !!!!!! "+valor);
          disponible=true;
          notify();
    }
    
    
    public synchronized int Obtener()
    { 
       
        if(disponible==false)
        {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.println("Leyendo !!!!! "+valor);
        disponible=false;
        notify();              
       return  valor; 
    }
    
}

