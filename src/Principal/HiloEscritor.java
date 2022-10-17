package Principal;

public class HiloEscritor extends Thread 
{   
	
	private Dato d;
    public HiloEscritor(Dato  d)
    {    this.d=d;
    }
    
    public void run()
    {
    	int valor;
        try 
        {   for(int  i=1;i<=5;i++)
            {   Thread.sleep((int)(Math.random()*1000));
                d.Asignar(i);
            }            
        } catch (Exception e)
        {
        }
        
    }
    
}
