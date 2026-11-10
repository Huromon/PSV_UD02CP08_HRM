import java.util.Random;

public class ControladorAmbiental extends Thread{
    private final String MSG = "[CONTROL]";
    private Control cnt;
    private Invernadero inv;
    ControladorAmbiental(Control cn,Invernadero inv){
    this.cnt=cn;
        this.inv=inv;
    }
@Override
    public void run(){
    Random k = new Random();

    System.out.println(MSG + " Inializado...");
    while (true){
        try {
            cnt.LeerTemperatura(this);

           if (inv.getTemperatura()>=28){

               System.out.println("[CONTROL] Lectura de temperatura de "+ inv.getTemperatura() + "ºC. --> activando la ventilacion");
           }else{
               System.out.println("[CONTROL] Lectura de temperatura de "+ inv.getTemperatura() + "ºC. --> Todo correcto");

           }
            cnt.recibido();
            Thread.sleep(1000 + k.nextInt(1000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }



}



}
