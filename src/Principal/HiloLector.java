package Principal;

public class HiloLector extends Thread {

    private Dato   d;
    public  HiloLector (Dato   d)
    {
        this.d=d;
    }
    
   public  void  run()
   {      
       int valor;
        try 
        {   for(int  i=1;i<=5;i++)
            {   Thread.sleep((int)(Math.random()*1000));
                valor=d.Obtener();
            }            
        } catch (Exception e)
        {
        }
   }
}
