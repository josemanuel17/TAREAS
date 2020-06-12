package SummerJava.Tareas;

public class tarea1 {
    public static void main(String[] args){
        
    int velocidad = 100;

    Kuchao kuchao1 = new Kuchao("EL RAYO", velocidad, true);

    kuchao1.meterleNitro();
    
    Kuchao kuchao2 = new Kuchao("EL PAPI", velocidad, false);

    kuchao2.meterleNitro();

    //System.out.println("La nueva velocidad es:" + getVelocidad());
    
    }
}