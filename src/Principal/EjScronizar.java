package Principal;

public class EjScronizar {

    public static void main(String[] args)
    {
        Dato  d=new Dato();
        HiloEscritor hiloescribe=new HiloEscritor(d);
        HiloLector   hilolector=new HiloLector(d);
        hiloescribe.start();
        hilolector.start();
       
      
    }
    
}
